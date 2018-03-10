// return a repeating number in ArrayList
import java.util.*;
public class Repeating {
	public static void main (String [] args){
		// initalize array with values
		List <Integer> a = Arrays.asList(0, 4, 1, 9, 1);
		System.out.println(repeatedNumber(a));
	}
	public static int repeatedNumber(List<Integer> a) {
		List <Integer> valueHolder= new ArrayList <Integer> ();
		int maxNumA=Collections.max(a);
		// populate with 0's
		for (int i=0; i <=maxNumA; i++){
			valueHolder.add(0);
		}
		for (int i=0; i < a.size(); i++){
			valueHolder.set(a.get(i), valueHolder.get(a.get(i))+1);
			if (valueHolder.get(a.get(i))>1){
				return (a.get(i));
			}
		}
		return -1;

	}

}