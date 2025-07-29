import java.util.*;

class Process {
    int pid;
    int arrivalTime;
    int burstTime;
    int remainingTime;
    int priority;
    int completionTime;
    int waitingTime;
    int turnaroundTime;
    boolean isCompleted = false;

    public Process(int pid, int arrivalTime, int burstTime, int priority) {
        this.pid = pid;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
    }
}

public class PriorityPreemptive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        List<Process> processes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Arrival Time, Burst Time, and Priority for Process " + (i + 1) + ":");
            int at = sc.nextInt();
            int bt = sc.nextInt();
            int pr = sc.nextInt();
            processes.add(new Process(i + 1, at, bt, pr));
        }

        int currentTime = 0, completed = 0;
        double totalTAT = 0, totalWT = 0;

        while (completed != n) {
            Process current = null;
            int highestPriority = Integer.MAX_VALUE;

            for (Process p : processes) {
                if (p.arrivalTime <= currentTime && p.remainingTime > 0) {
                    if (p.priority < highestPriority) {
                        highestPriority = p.priority;
                        current = p;
                    } else if (p.priority == highestPriority) {
                        if (current == null || p.arrivalTime < current.arrivalTime) {
                            current = p;
                        }
                    }
                }
            }

            if (current != null) {
                current.remainingTime--;
                currentTime++;

                if (current.remainingTime == 0) {
                    current.completionTime = currentTime;
                    current.turnaroundTime = current.completionTime - current.arrivalTime;
                    current.waitingTime = current.turnaroundTime - current.burstTime;
                    current.isCompleted = true;
                    totalTAT += current.turnaroundTime;
                    totalWT += current.waitingTime;
                    completed++;
                }
            } else {
                currentTime++; // CPU Idle
            }
        }

        // Output
        System.out.println("\nPID\tAT\tBT\tPR\tCT\tTAT\tWT");
        for (Process p : processes) {
            System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\n",
                    p.pid, p.arrivalTime, p.burstTime, p.priority,
                    p.completionTime, p.turnaroundTime, p.waitingTime);
        }

        System.out.printf("\nAverage Turnaround Time: %.2f\n", totalTAT / n);
        System.out.printf("Average Waiting Time: %.2f\n", totalWT / n);

        sc.close();
    }
}
