package leetCodeAlgoEasy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class majorityElementInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,2,2};
		System.out.println(majorityElement(arr));

	}
    public static int majorityElement(int[] nums) {
    	int majority = nums.length /2;
    	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    	for(int i = 0 ; i < nums.length ; i++){
    		if(hm.containsKey(nums[i])){
    			System.out.println("contains");
    			hm.put(nums[i] , hm.get(nums[i]) + 1);
    		}else{
    			hm.put(nums[i], 1);
    		}
    	}
    	System.out.println(hm);
    	for(Map.Entry entry : hm.entrySet() ){
    		if((int) entry.getValue() > majority){
    			return (int) entry.getKey();
    		}
    	}
		return 0;		       
    }

}