package ArrayInterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;


public class ConsecutiveNumbers {

	public static void main(String[] args) {
		int[] arr = {9,1,2,2,2,9,8,8};
		int count = 1;
		ArrayList<Integer> result = new ArrayList<Integer>();		
		for(int i = 0; i < arr.length;i++ ){
			if( i != arr.length-1 && arr[i] == arr[i+1]){
				count++;
			}else{			
				result.add(count);
				result.add(arr[i]);
				System.out.println(result);
				count = 1;
			}
		}		
        System.out.println(result);
	}

}
