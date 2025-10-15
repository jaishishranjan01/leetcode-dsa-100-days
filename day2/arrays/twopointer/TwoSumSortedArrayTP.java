package day2.arrays.twopointer;

public class TwoSumSortedArrayTP {
    public static void main(String[] args) {
        int [] arr = {1, 2, 4, 6, 8, 9, 14, 15};
        int[] a = findTwoSumPair(arr, 13);
        if (a.length == 0) System.out.println("No Pair Found.");
        else System.out.println(a[0] + ", " + a[1]);
    }

    public static int[] findTwoSumPair(int[] arr, int target) {
        if (arr == null || arr.length < 2) return new int[0];
        int left = 0;
        int right = arr.length-1;

        while(left < right) {
            if (arr[left] + arr[right] == target) return  new int[]{arr[left], arr[right]};
            if (arr[left] + arr[right] < target) {
                left ++;
            } else {
                right --;
            }
        }
        return new int[0];
    }
}
