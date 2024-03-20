//Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

//A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

 


package DSA.ArrayProblems.Array;

public class BuildArraypermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] buildArray(int[] nums) {
        //int[] arr = new int[nums.length];
        int n = nums.length;
        for(int i = 0;i<n;i++){
           nums[i]  = (n * ( nums[nums[i]] % n)) +nums[i];
        }
        for(int i = 0;i<n;i++){
           nums[i]  = nums[i]/n;
        }
        return nums;
    }
	public int[] getConcatenation(int[] nums) {
        int[] ans =new int[2 * nums.length];
        for(int i = 0;i<2 *nums.length;i++){
            ans[i] = nums[i%nums.length];
        }
       
        return ans;
    }

}
