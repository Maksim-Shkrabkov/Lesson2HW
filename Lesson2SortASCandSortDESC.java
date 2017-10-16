import java.util.Arrays;

public class Lesson2SortASCandSortDESC {

	public static void main(String[] args) {
		
		int[] numbersForTesting = {45, 65, 78, 34, 56, 11, 46, 879, 435, 4564};
		
		System.out.println(Arrays.toString(SortACS(numbersForTesting)));
		
		System.out.println(Arrays.toString(SortDESC(numbersForTesting)));


	}
	
	public static int[] SortACS(int[] number) {
		
		for (int i = number.length - 1; i >= 0; i-- ) {
			
			for (int j = 0; j < i; j++) {
				
				if(number[j] > number[j + 1]) {
					
					int numberToReplace = number[j];
					number[j] = number[j+ 1];
					number[j + 1] = numberToReplace;
				}
				
			}
		}
		
		return number;
	} 
	
		public static int[] SortDESC(int[] number) {
		
			for (int i = number.length - 1; i >= 0; i-- ) {
			
				for (int j = 0; j < i; j++) {
				
					if(number[j] < number[j + 1]) {
					
						int numberToReplace = number[j];
						number[j] = number[j+ 1];
						number[j + 1] = numberToReplace;
				}
				
			}
		}
		
		return number;
	} 

}
