import java.util.Scanner;

public class FCFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println();

        System.out.print("How many processes you want to schedule? ");
        int n = sc.nextInt();

        int temp;
        int[] pid = new int[n];
        int[] AT = new int[n];
        int[] BT = new int[n];
        int[] CT = new int[n];
        int[] TAT = new int[n];
        int[] WT = new int[n];

        // Input section
        for (int i = 0; i < n; i++) {
            System.out.print("Enter process id: ");
            pid[i] = sc.nextInt();

            System.out.print("Enter Arrival Time for process " + pid[i] + ": ");
            AT[i] = sc.nextInt();

            System.out.print("Enter Burst Time for process " + pid[i] + ": ");
            BT[i] = sc.nextInt();
        }

        // Sort by Arrival Time (FCFS logic)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (AT[j] > AT[j + 1]) {
                    // Swap AT
                    temp = AT[j];
                    AT[j] = AT[j + 1];
                    AT[j + 1] = temp;

                    // Swap PID
                    temp = pid[j];
                    pid[j] = pid[j + 1];
                    pid[j + 1] = temp;

                    // Swap BT
                    temp = BT[j];
                    BT[j] = BT[j + 1];
                    BT[j + 1] = temp;
                }
            }
        }

        // Calculate Completion Time (CT)
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                CT[i] = AT[i] + BT[i]; // First process
            } else {
                if (CT[i - 1] < AT[i]) {
                    CT[i] = AT[i] + BT[i]; // CPU idle
                } else {
                    CT[i] = CT[i - 1] + BT[i]; // CPU busy
                }
            }
        }

        // Calculate Turnaround Time, Waiting Time, and Totals
        int totalTAT = 0;
        int totalWT = 0;

        for (int i = 0; i < n; i++) {
            TAT[i] = CT[i] - AT[i];
            WT[i] = TAT[i] - BT[i];
            totalTAT += TAT[i];
            totalWT += WT[i];
        }

        // Sort back by PID before displaying
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (pid[j] > pid[j + 1]) {
                    // Swap PID
                    temp = pid[j];
                    pid[j] = pid[j + 1];
                    pid[j + 1] = temp;

                    // Swap AT
                    temp = AT[j];
                    AT[j] = AT[j + 1];
                    AT[j + 1] = temp;

                    // Swap BT
                    temp = BT[j];
                    BT[j] = BT[j + 1];
                    BT[j + 1] = temp;

                    // Swap CT
                    temp = CT[j];
                    CT[j] = CT[j + 1];
                    CT[j + 1] = temp;

                    // Swap TAT
                    temp = TAT[j];
                    TAT[j] = TAT[j + 1];
                    TAT[j + 1] = temp;

                    // Swap WT
                    temp = WT[j];
                    WT[j] = WT[j + 1];
                    WT[j + 1] = temp;
                }
            }
        }

        // Display final output sorted by PID
        System.out.println("\nFinal Output (Sorted by Process ID):");
        System.out.println("PID\tAT\tBT\tCT\tTAT\tWT");
        for (int i = 0; i < n; i++) {
            System.out.println(pid[i] + "\t" + AT[i] + "\t" + BT[i] + "\t" + CT[i] + "\t" + TAT[i] + "\t" + WT[i]);
        }

        // Display average TAT and WT
        double avgTAT = (double) totalTAT / n;
        double avgWT = (double) totalWT / n;

        System.out.printf("\nAverage Turnaround Time: %.2f", avgTAT);
        System.out.printf("\nAverage Waiting Time: %.2f\n", avgWT);

        sc.close();
    }
}
