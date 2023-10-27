
import java.util.*;

public class RomanToInteger {
	int value(char r)
	{
		if (r == 'I'|| r=='i')
			return 1;
		if (r == 'V' || r=='v')
			return 5;
		if (r == 'X' || r=='x')
			return 10;
		if (r == 'L' || r=='l')
			return 50;
		if (r == 'C' || r=='c')
			return 100;
		if (r == 'D' || r=='d')
			return 500;
		if (r == 'M' || r=='m')
			return 1000;
		return -1;
	}
	int convertRoman(String str)
	{
		// Initialize result
		int res = 0;

		for (int i = 0; i < str.length(); i++) {
			// Getting value of symbol s[i]
			int s1 = value(str.charAt(i));

			// Getting value of symbol s[i+1]
			if (i + 1 < str.length()) {
				int s2 = value(str.charAt(i + 1));

				// Comparing both values
				if (s1 >= s2) {
					res = res + s1;
				}
				else {
					// Value of current symbol is
					// less than the next symbol
					res = res + s2 - s1;
					//i++;
				}
			}
			else {
				res = res + s1;
			}
		}

		return res;
	}

	// Main block
	public static void main(String args[])
	{
		RomanToInteger ob = new RomanToInteger();
	    Scanner sc = new Scanner(System.in);
		String str = sc.nextLine() ;
		sc.close();
		String lowerstr = str.toLowerCase();
		System.out.println("Roman Number to Interger: " + ob.convertRoman(lowerstr));
	}
}
