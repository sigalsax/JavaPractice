public class Occurances {
	
	public static void main (String [] args){
		String str= "I love compsci";
		String inputString= "I love compsci | she loves computers | she loves computer science | I love compsci they really do! ";
		System.out.println(appearanceRecursive(str, inputString));
		System.out.println(appearanceIterative(str, inputString));
	}


	public static int appearanceRecursive (String str, String inputString){
		int appearanceString= inputString.indexOf(str); 
		if (appearanceString < 0){
			return 0;
		} else {
			return appearanceRecursive(str, inputString.substring(appearanceString + str.length())) + 1;
		}
	}

	public static int appearanceIterative (String str, String inputString){

		int counter = 0;
		// substring from 1 character to next
		for (int i=0; i <= inputString.length() - str.length(); i++) {

			if (inputString.substring(i, i+str.length()).equals(str)) {
				System.out.println(inputString.substring(i, i+str.length()));
				counter++;
			}

		}

		return counter; 
	}

}