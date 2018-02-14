package SearchingAssignmentPackage;

import java.util.HashMap;
import java.util.Map;

/* Find if an sub array is equal to given sum and return boolean value accordingly
 * @params : array and givenSum
 */


public class SubArrayEqualsSum {

	public static void main(String[] args) {
		int arr[] = {1,1,2,7,6,4};
		int count = isSubArrayEqualsSum(arr, 11);
		System.out.println("The number of sub-array that are equal to given sum " + count);
	}
    
	/* Run-time analysis is O(n^2) */
//	private static boolean isSubArrayEqualsSum (int[] arr, int givenSum) {
//		int current_sum ;
//		for(int i = 0; i < arr.length; i++){
//			current_sum = arr[i];
//			for(int j = i + 1 ; j < arr.length; j++){
//				if(current_sum == givenSum){
//					return true;
//				}
//				if(current_sum > givenSum || current_sum == arr.length){
//					break;
//				}
//				current_sum = current_sum + arr[j];						
//			}
//		}		
//		return false;				
//	}
	
	/* Run-time O(n)
	 * Keep pointer to start element and remove the trailing elements if current sum is greater than given sum
	 */
//	private static boolean isSubArrayEqualsSum(int[] arr, int givenSum){
//		int current_sum = arr[0], startPointer = 0;
//		for(int i = 1 ; i < arr.length; i++){			
//			
//			if(current_sum == givenSum){
//				return true;
//			}else if (current_sum < givenSum){
//				current_sum = current_sum + arr[i];
//			}
//			while(current_sum > givenSum){
//				current_sum = current_sum - arr[startPointer];
//				startPointer++;				
//			}			
//		}
//		return false;		
//	}
	
	/* Using Hashing
	 * You keep track of all sums and store in the map */
//	private static boolean isSubArrayEqualsSum(int[] arr, int givenSum){
//        int count = 0, sum = 0;
//        HashMap <Integer,Integer> map = new HashMap <Integer,Integer>();
//        map.put(0, 1);
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//            if (map.containsKey(sum - givenSum))
//                return true;
//            map.put(sum, 1);
//        }
//        System.out.println(map);
//        return false;		
//	}
	
	public static int isSubArrayEqualsSum(int[] nums, int k) {
        int sum = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		map.put(0, 1);
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (map.containsKey(sum - k)) {
				count += map.get(sum-k);
			}
			if (!map.containsKey(sum)) {
				map.put(sum, 1);
			} else {
			    map.put(sum, map.get(sum) + 1);
			}
		}
        System.out.println(map);
		return count;
    }
	
}


