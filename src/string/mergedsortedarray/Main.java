package string.mergedsortedarray;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {6, 7 , 8};
        int m = 3;
        int n = 3;

        MergedSortedArray obj = new MergedSortedArray();

        obj.merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}
