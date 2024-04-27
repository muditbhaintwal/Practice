/**
 * Given an integer array nums,
 * return an array answer such that answer[i] is
 * equal to the product of all the elements of nums except nums[i].
 */
public class FindProduct {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 0, 3, 4}; // answer = {210, 70, 42, 105, 30}    {6, }

    // {0, 0 , 0 ,0 }
        int[] answer = findProduct(nums);
    }

    private static int[] findProduct(int[] nums) {
        boolean hasZero = false;
        boolean hasTwoZero = false;
        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                hasZero = true;
                continue;
            } else if (hasZero && nums[i] == 0) {
                hasTwoZero = true;
                continue;
            }
            product = product * nums[i];
            /*1 ->3, 5, 2, 7 = 210
            3 ->1, 5, 2, 7 = 70*/
        }


        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                nums[j] = product;
            } else if (hasZero) {
                nums[j] = 0;
            } else {
                nums[j] = product / nums[j];
            }
        }




        /*IF nums.length == 2
        retrun nums[ i]*nums[i + 1];  2*3 =6

        nums[i] * findProduct(nums[]);


        nums[i]-- > findProduct(nums[i + 1]);*/


        return new int[0];
    }
}
