package string.mergedsortedarray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list1 = {1,2,3,0,0,0};
        int[] list2= {6,8,9};
        int m = 3;
        int n = 3;


        MergedSortedArray merger = new MergedSortedArray();
        merger.merge(list1, m, list2, n);

        System.out.println("Merged Array" + Arrays.toString(list1));

    }
}
