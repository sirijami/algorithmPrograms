package leetCodeAlgoEasy;

public class maxContonousSubArray {

	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));

	}
    public static int maxSubArray(int[] nums) {
    	int max = 0,sum = 0, maxSoFar = Integer.MIN_VALUE;
    	for(int i = 0 ; i < nums.length; i++){
    		sum = sum + nums[i];
    		if( sum > maxSoFar){
    			maxSoFar = sum;
    		}
    		if(sum < 0){
    			sum = 0;
    		}

    	}
		return maxSoFar;
        
    }

}
