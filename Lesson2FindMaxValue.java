
public class Lesson2FindMaxValue {

	public static void main(String[] args) {
		
		
		int[] numbersForTesting = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		int maxNumber = findMaxValue(numbersForTesting);
		
		System.out.println("Максимальное значение в массиве:" + maxNumber);
	}
	
	
	public static int findMaxValue(int[] number) {
		
		int max = number[0];
		
		for(int i = 0; i < number.length; i++) {
			
			if (max < number[i]) {
				max = number[i];
			}
			
		}
		
		return max;
	}
	
}
