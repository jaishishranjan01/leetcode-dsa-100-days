package day2.arrays.twopointer;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoSortedArrayMergeTP {
    public static void main(String[] args) {
        int [] first = new int[] {1, 2, 10, 15};
        int [] second = new int[] {4, 5, 7, 8 ,20, 25};
        int [] res = mergeTwoSortedArray(first, second);
        System.out.println(
                Arrays.stream(res)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(", "))
        );
    }

    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        if (arr1 == null || arr1.length == 0) {
            return arr2;
        }

        if (arr2 == null || arr2.length ==0) {
            return arr1;
        }
        int[] res = new int[arr1.length + arr2.length];
        int iArr1 =0, jArr2 = 0, r = 0;
        while (iArr1 < arr1.length && jArr2 < arr2.length) {
            if (arr1[iArr1] < arr2[jArr2]) {
                res[r] = arr1[iArr1];
                iArr1++;
            } else {
                res[r] = arr2[jArr2];
                jArr2++;
            }
            r++;
        }
        while (iArr1 < arr1.length) {
            res[r] = arr1[iArr1];
            r++;
            iArr1++;
        }

        while (jArr2 < arr2.length) {
            res[r] = arr2[jArr2];
            r++;
            jArr2++;
        }
        return res;
    }
}
