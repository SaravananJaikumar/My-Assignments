package week1.assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int len = arr.length;
		System.out.println("Duplicate number in given array:");
		for (int i = 0; i < len; i++) {
			for (int j = i+1; j < len-1; j++) {
				if (arr[i]==arr[j]) {
				
					System.out.println(arr[i]);
				}
			}
			
		}

	}

}
