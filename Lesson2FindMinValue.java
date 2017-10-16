
public class Lesson2FindMinValue {

	public static void main(String[] args) {
		
		int[] numbersForTesting = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		int minNumber = findMinValue(numbersForTesting);

		System.out.println("Минимальное значение в массиве:" + minNumber);
	}
	
	public static int findMinValue (int[] number) {
		
		int min = number[0];
		
		for (int i = 0; i < number.length; i++) {
			
			if (min > number[i]) {
				
				min = number[i];
			}
			
		}
		
		return min;
		
	} 

}
