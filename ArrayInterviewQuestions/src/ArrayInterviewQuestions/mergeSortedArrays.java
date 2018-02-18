package ArrayInterviewQuestions;

public class mergeSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = {34,64,89,200,500};
		int[] arr2 = {2,25,37,78,150};
//		int[] arr1 = {1,5};
//		int[] arr2 ={2,3};
		int[] mergedSortedArray = mergeArray(arr1, arr2);
		printArray(mergedSortedArray);
	}
	
	private static int[] mergeArray(int[] nums1, int[] nums2){
		int[] result = new int[nums1.length + nums2.length];
		int i = 0;
		int j = 0;
		int m = 0;
		while(i < nums1.length && j < nums2.length){
			if(nums1[i] < nums2[j]){
				result[m] = nums1[i];
				i++;
				m++;
			}else {
				result[m] = nums2[j];
				j++;
				m++;
			}			
		}
		while(i < nums1.length ){
			result[m] = nums1[i];
			m++;
			i++;
		}
		while(j < nums2.length ){
			result[m] = nums1[i];
			m++;
			j++;
		}
	
		return result;
		
	}
	
	private static void printArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
