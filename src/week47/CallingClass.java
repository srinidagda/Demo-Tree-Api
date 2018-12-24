package week47;

public class CallingClass {
	void process(int day) {
		if (day >= 1 && day <= 5) {
			System.out.print("Time to wake up early. We have work today.");
			if (day == 5) {
				System.out.println("Don't forget to bring snacks for co-workers");
			}
		}
		else if (day == 6 || day == 7) {
			System.out.println("Time to sleep in. No work today");
		}
	}
	
	public static void main(String args[]) {
		MathematicalOperations mathematicalOperations = new MathematicalOperations();
		int sum = mathematicalOperations.addition(9,5);
		CallingClass callingClass = new CallingClass();
		callingClass.process(5);
		int count = 2;
		int [] input = {1,2,3,4,5};
		for(int i=1;i<=count;i++)
			arrayOperation(input);
		for(int i=0;i<input.length; i++)
			System.out.print(input[i]+" ");
	}
	public static void arrayOperation(int[] input) {
		int temp = input[0];
		for(int i=0;i<input.length-1;i++)
			input[i] = input[i+1];
		input[input.length-1] = temp;
	}
}
