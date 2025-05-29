package string.mergedsortedarray.removeelement;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        int[] nums = {3, 2, 2, 3};

        int val = 3;


        Solution solution = new Solution();
        int k = solution.removeElement(nums, val);

        System.out.print("k = "+ k + " " + "nums = [");
        for(int i = 0; i < nums.length; i++){
            if (i < k){
                System.out.print(nums[i]);
            }else {
                System.out.print("_");
            }
            if(i < nums.length - 1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
