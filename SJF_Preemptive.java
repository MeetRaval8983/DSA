import java.util.Scanner;

public class SJF_Preemptive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] pid = new int[n];
        int[] AT = new int[n];
        int[] BT = new int[n];
        int[] BT_Remaining = new int[n];
        int[] CT = new int[n];
        int[] TAT = new int[n];
        int[] WT = new int[n];
        boolean[] isCompleted = new boolean[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Process ID: ");
            pid[i] = sc.nextInt();

            System.out.print("Enter Arrival Time for process " + pid[i] + ": ");
            AT[i] = sc.nextInt();

            System.out.print("Enter Burst Time for process " + pid[i] + ": ");
            BT[i] = sc.nextInt();

            BT_Remaining[i] = BT[i]; // copy burst time
        }

        int completed = 0;
        int currentTime = 0;
        int minIndex;
        int minRemaining;

        while (completed < n) {
            minIndex = -1;
            minRemaining = Integer.MAX_VALUE;

            // Find process with shortest remaining time at current time
            for (int i = 0; i < n; i++) {
                if (AT[i] <= currentTime && !isCompleted[i] && BT_Remaining[i] < minRemaining && BT_Remaining[i] > 0) {
                    minRemaining = BT_Remaining[i];
                    minIndex = i;
                }
            }

            if (minIndex == -1) {
                currentTime++; // CPU idle
            } else {
                // Execute 1 unit of selected process
                BT_Remaining[minIndex]--;
                currentTime++;

                // If process finishes
                if (BT_Remaining[minIndex] == 0) {
                    CT[minIndex] = currentTime;
                    isCompleted[minIndex] = true;
                    completed++;
                }
            }
        }

        // Calculate Turnaround Time and Waiting Time + total for averages
        int totalTAT = 0;
        int totalWT = 0;

        for (int i = 0; i < n; i++) {
            TAT[i] = CT[i] - AT[i];
            WT[i] = TAT[i] - BT[i];
            totalTAT += TAT[i];
            totalWT += WT[i];
        }

        // Sort output by PID for clean display
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

        // Output results
        System.out.println("SJF Preemptive (SRTF) Scheduling Result:");
        System.out.println("PID\tAT\tBT\tCT\tTAT\tWT");
        for (int i = 0; i < n; i++) {
            System.out.println(pid[i] + "\t" + AT[i] + "\t" + BT[i] + "\t" + CT[i] + "\t" + TAT[i] + "\t" + WT[i]);
        }

        // Display Averages
        double avgTAT = (double) totalTAT / n;
        double avgWT = (double) totalWT / n;

        System.out.printf("Average Turnaround Time: %.2f", avgTAT);
        System.out.printf("\nAverage Waiting Time: %.2f\n", avgWT);

        sc.close();
    }
}
