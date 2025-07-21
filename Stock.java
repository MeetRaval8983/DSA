public class Stock {
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i : prices) {
            if(min > i) {
                min = i;
            } else {
                max = Math.max(max, i - min);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println();
        // int[] arr = {7,1,5,3,6,4};
        // int[] arr = {7,6,4,3,1};
        // int[] arr = {1};
        int[] arr = {2, 4, 1};
        System.out.println(maxProfit(arr));
    }
}