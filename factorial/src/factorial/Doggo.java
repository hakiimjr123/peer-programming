package factorial;
import java.util.Arrays;

public class Doggo {
	
	
	public static void main(String[] args) {
	
		System.out.println(pupPlace(31));
		System.out.println(String.valueOf(6).length());
	}
	
	public static String pupPlace(int place) {
		
		String original = "1st, 2nd, 3rd, 4th, 5th, 6th, 7th, "
				+ "8th, 9th, 10th, 11th, 12th, 13th, 14th, 15th, 16th, "
				+ "17th, 18th, 19th, 20th, 21st, 22nd, 23rd, 24th, 25th, "
				+ "26th, 27th, 28th, 29th, 30th, 31st, 32nd, 33rd, 34th, "
				+ "35th, 36th, 37th, 38th, 39th, 40th, 41st, 42nd, 43rd, 44th, "
				+ "45th, 46th, 47th, 48th, 49th, 50th, 51st, 52nd, 53rd, 54th, "
				+ "55th, 56th, 57th, 58th, 59th, 60th, 61st, 62nd, 63rd, 64th, "
				+ "65th, 66th, 67th, 68th, 69th, 70th, 71st, 72nd, 73rd, 74th, "
				+ "75th, 76th, 77th, 78th, 79th, 80th, 81st, 82nd, 83rd, 84th, "
				+ "85th, 86th, 87th, 88th, 89th, 90th, 91st, 92nd, 93rd, 94th, "
				+ "95th, 96th, 97th, 98th, 99th, 100th​";
		
		String exceptions = "1st, 2nd, 3rd, 21st, 22nd, 23rd, 31st, 32nd, 33rd, "
				+ "41st, 42nd, 43rd,  51st, 52nd, 53rd, 61st, 62nd, 63rd,  71st, "
				+ "72nd, 73rd, 81st, 82nd, 83rd, 91st, 92nd, 93rd,";
		
		String placeAsAString = String.valueOf(place);
		
		System.out.println(exceptions.regionMatches(exceptions.indexOf(placeAsAString), placeAsAString + "st", 0, 4));
		
		if (exceptions.contains(placeAsAString) && (exceptions.regionMatches(exceptions.indexOf(placeAsAString), placeAsAString + "st", 0, 4) || exceptions.regionMatches(exceptions.indexOf(placeAsAString), placeAsAString + "st", 0, 2))) {
			String res = original.replace(placeAsAString + "st, ", "");
			return res;
		} else if (exceptions.contains(placeAsAString) && (exceptions.regionMatches(exceptions.indexOf(placeAsAString), placeAsAString + "nd", 0, 4) || exceptions.regionMatches(exceptions.indexOf(placeAsAString), placeAsAString + "nd", 0, 2))) {
			String res = original.replace(placeAsAString + "nd, ", "");
			return res;
		} else if (exceptions.contains(placeAsAString) && (exceptions.regionMatches(exceptions.indexOf(placeAsAString), placeAsAString + "rd", 0, 4) || exceptions.regionMatches(exceptions.indexOf(placeAsAString), placeAsAString + "rd", 0, 2))) {
			String res = original.replace(placeAsAString + "rd, ", "");
			return res;
		} else if (original.contains(placeAsAString) ) {
			String res = original.replace(" " + placeAsAString + "th,", "");
			return res;
		} else {
			return original;
		}
		
}

	public static int pupPlaceNormal(int place) {
		
		int[] numbers = new int[100];
		
		for (int i = 0; i <= 100; i++) {
			numbers[i] = i;
		}
		
		for (int i = 0; i <= numbers.length; i++) {
			if (place % numbers[i] == 0) {
				numbers = Array.remove(numbers, i);
				return 0;
				
			} 
		}
	}
}