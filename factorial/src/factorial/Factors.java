package factorial;

public class Factors { 
	
	public static void main(String[] args) {
		System.out.println(fact(18));
		
	}

	public static int fact(int a) {
		int initialA = a;
		int iteration = 2;
		int b = 1;
	
		while (a /iteration != 1 && a / iteration > 1) {
			a= a/iteration;
			iteration++;
		}
	
		for (int i = iteration; i >= 1; i--) {
			b = b * i;
		}

		if (b == initialA) {
			System.out.println(iteration);
			return iteration;
		}
		else  {
			return 0;
	}

	
}
}
