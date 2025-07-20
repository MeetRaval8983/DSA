public class Sorting {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 2, 6};

        System.out.println("\nBefore sorting:");
        for(int i : arr) {
            System.out.print(i + " ");
        }

        // selectionsort(arr);
        // bubblesort(arr);
        insertionsort(arr);
        
        System.out.println("\nAfter sorting:");
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
    private static int[] selectionsort(int[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < a.length; j++) {
                if(a[min] > a[j]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        return a;
    }
    private static int[] bubblesort(int[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = 0; j < a.length - i - 1; j++) {
                if(a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }
    private static int[] insertionsort(int[] a) {
        for(int i = 1; i < a.length; i++) {
            int j = i - 1;
            int temp = a[i];
            while(j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
        return a;
    }
}