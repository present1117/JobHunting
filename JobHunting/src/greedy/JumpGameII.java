package greedy;

public class JumpGameII {
// ==================================================================  //  
//	Jump Game II 
//Given an array of non-negative integers, you are initially positioned at the first index of the array.
//
//Each element in the array represents your maximum jump length at that position.
//
//Your goal is to reach the last index in the minimum number of jumps.
//
//For example:
//Given array A = [2,3,1,1,4]
//
//The minimum number of jumps to reach the last index is 2. 
//(Jump 1 step from index 0 to 1, then 3 steps to the last index.)
//==================================================================  //  
    public int jump(int[] A) {
        int curMax = 0, nexMax = 0, ans = 0;
        for(int i = 0; i < A.length; ++i){
        	if(i > curMax){
        		curMax = nexMax;
        		ans++;
        	}
        	nexMax = Math.max(nexMax, A[i]+i);
        }
        return ans;
    }
}
