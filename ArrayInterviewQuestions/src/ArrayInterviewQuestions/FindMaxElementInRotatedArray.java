package ArrayInterviewQuestions;

public class FindMaxElementInRotatedArray {

	public static void main(String[] args) {
//		int[] arr = {100};
//		int[] arr = {100, 3};
//		int[] arr = {3,100};
		int[] arr = {8, 10, 20, 80, 100, 200, 400, 500, 1};
		int peak = findMaxElement(arr, 0, arr.length-1);
		System.out.println("peak element is " + peak);
	}
	/* Run time for this problem is O(n) */
//	private static void findMaxElement(int[] num){
//		for(int i = 0; i < num.length; i++){
//			if(i != num.length-1 && num[i] > num[i+1]){
//				System.out.println("The peak element is " + num[i]);
//				break;
//			}else if( i == num.length-1){
//				System.out.println(num[num.length-1]);
//				break;
//			}
//		}		
//	}
	
	/* Use binary search to improve run time to O(log n) */
	private static int findMaxElement(int[] arr, int low, int high){
		int mid_index =  (low + high)/2;
		/* if there is only one element */
		if(low == high){
		   return arr[low];	
		}
		
		/* if there are two elements */
		if( (low + 1== high)  && arr[low] > arr[high]){
			return arr[low];
		}
		
		if( (low + 1== high)  && arr[low] < arr[high]){
			return arr[high];
		}
		
		
		/* If mid index is the max val */
		if(arr[mid_index] > arr[mid_index-1] && arr[mid_index] > arr[mid_index + 1]){
			return  arr[mid_index];
		}
		
		if(arr[mid_index] < arr[mid_index + 1] && arr[mid_index] > arr[mid_index -1]){
			return findMaxElement(arr, mid_index+1, high);
		}else {
			return findMaxElement(arr, low, mid_index -1);
		}		
		
	}

}
