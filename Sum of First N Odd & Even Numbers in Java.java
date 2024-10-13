
import java.io.*;

public class GFG {

	
	public static void main(String[] args)
	{
		int n = 8;
		int evenSum = 0;
		int oddSum = 0;

		for (int i = 1; i <= 2 * n; i++) {
			
			if ((i & 1) == 0)
				evenSum += i;
			else
				oddSum += i;
		}
	
		System.out.println("Sum of First " + n
						+ " Even numbers = " + evenSum);

		
		System.out.println("Sum of First " + n
						+ " Odd numbers = " + oddSum);
	}
}
