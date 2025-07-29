import java.util.Scanner;

public class SJF_NonPreemptive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println();

        System.out.print("How many processes you want to schedule? ");
        int n = sc.nextInt();

        int[] pid = new int[n];
        int[] AT = new int[n];
        int[] BT = new int[n];
        int[] CT = new int[n];
        int[] TAT = new int[n];
        int[] WT = new int[n];
        boolean[] completed = new boolean[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Process ID: ");
            pid[i] = sc.nextInt();
            System.out.print("Enter Arrival Time for process " + pid[i] + ": ");
            AT[i] = sc.nextInt();
            System.out.print("Enter Burst Time for process " + pid[i] + ": ");
            BT[i] = sc.nextInt();
        }

        int currentTime = 0;
        int completedCount = 0;

        while (completedCount < n) {
            int minBT = Integer.MAX_VALUE;
            int selected = -1;

            // Select the process with the shortest burst time that has arrived
            for (int i = 0; i < n; i++) {
                if (!completed[i] && AT[i] <= currentTime && BT[i] < minBT) {
                    minBT = BT[i];
                    selected = i;
                }
            }

            if (selected == -1) {
                currentTime++; // No process has arrived yet
            } else {
                CT[selected] = currentTime + BT[selected];
                currentTime = CT[selected];
                completed[selected] = true;
                completedCount++;
            }
        }

        // Calculate TAT and WT and their totals
        int totalTAT = 0;
        int totalWT = 0;

        for (int i = 0; i < n; i++) {
            TAT[i] = CT[i] - AT[i];
            WT[i] = TAT[i] - BT[i];
            totalTAT += TAT[i];
            totalWT += WT[i];
        }

        // Sort by PID before displaying output
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (pid[j] > pid[j + 1]) {
                    int temp;
                    temp = pid[j]; pid[j] = pid[j + 1]; pid[j + 1] = temp;
                    temp = AT[j]; AT[j] = AT[j + 1]; AT[j + 1] = temp;
                    temp = BT[j]; BT[j] = BT[j + 1]; BT[j + 1] = temp;
                    temp = CT[j]; CT[j] = CT[j + 1]; CT[j + 1] = temp;
                    temp = TAT[j]; TAT[j] = TAT[j + 1]; TAT[j + 1] = temp;
                    temp = WT[j]; WT[j] = WT[j + 1]; WT[j + 1] = temp;
                }
            }
        }

        // Output
        System.out.println("SJF Non-Preemptive Scheduling Result:");
        System.out.println("PID\tAT\tBT\tCT\tTAT\tWT");
        for (int i = 0; i < n; i++) {
            System.out.println(pid[i] + "\t" + AT[i] + "\t" + BT[i] + "\t" + CT[i] + "\t" + TAT[i] + "\t" + WT[i]);
        }

        // Average TAT and WT
        double avgTAT = (double) totalTAT / n;
        double avgWT = (double) totalWT / n;

        System.out.printf("Average Turnaround Time: %.2f", avgTAT);
        System.out.printf("\nAverage Waiting Time: %.2f\n", avgWT);

        sc.close();
    }
}
