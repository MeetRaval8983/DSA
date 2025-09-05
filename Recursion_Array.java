import java.util.ArrayList;

public class Recursion_Array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4, 5};
        System.out.println(sorted(a, 0));
        System.out.println(linearSearch(a, 0, 4));
        findAllIndex(a, 0, 4);
        System.out.println(list);
        System.out.println(findAllIndexArrayList(a, 0, 4, new ArrayList<>()));
        int[] b = {1, 2, 3, 4, 4, 5, 4, 4};
        System.out.println(findAllIndexArrayList1(b, 0, 4));
    }
    static boolean sorted(int arr[], int i) {
        if(i == arr.length - 1) {
            return true;
        }
        return arr[i] < arr[i + 1] && sorted(arr, i + 1);
    }
    static int linearSearch(int arr[], int i, int target) {
        if(i == arr.length) {
            return - 1;
        }
        return arr[i] == target ? i : linearSearch(arr, i + 1, target);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int arr[], int i, int target) {
        if(i == arr.length) {
            return;
        }
        if(arr[i] == target) {
            list.add(i);
        }
        findAllIndex(arr, i + 1, target);
    }
    static ArrayList<Integer> findAllIndexArrayList(int arr[], int i, int target, ArrayList<Integer> list) {
        if(i == arr.length) {
            return list;
        }
        if(arr[i] == target) {
            list.add(i);
        }
        return findAllIndexArrayList(arr, i + 1, target, list);
    }
    static ArrayList<Integer> findAllIndexArrayList1(int arr[], int i, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length) {
            return list;
        }
        if(arr[i] == target) {
            list.add(i);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndexArrayList1(arr, i + 1, target);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
