
public class BinaryGap{
	public static void main (String [] args){
		int num=529;
		//1 0 0 1
		String binary= Integer.toBinaryString(num);
		char [] c= binary.toCharArray();
		int countOnes=0;
		int countZeros=0;
		int max=0;
		boolean boolOnes = false;
		boolean boolZeros = false;
		int countGap=0;
		
		System.out.println(Integer.toBinaryString(num));
		for (int i=0; i <c.length; i++){
			if (c[i]=='1'){
				boolOnes=true;
			}
			if (boolOnes==true && c[i]=='0'){
				countZeros++;
				boolZeros=true;
			}
			else if (boolOnes==true && boolZeros==true && c[i]=='1'){
				countGap++;
				boolZeros=false;
				if (countZeros>max){
					max=countZeros;
				}
				countZeros=0;
			}
			else{

				}			
		}
		System.out.println(countGap);
		System.out.println(max);
	}
}

// if this is 1
	// count ++
// if 1 is in hashtable and this is 1
	// decrement 1 count value
// if 1 is in hashtable and this is zero
	// add 0 to hash


// if 1 is already in hash
	// count++ 
// 1001  01001
// countgap= 1;
// countOnes=1;
// 1 --> 1
// 
// if 1 is in hashmap, decrement countOnes

// add first element to hashMap
// 0
// traverse array
	// if this element is 1 
		// if 0 is not in hashmap and this element is a 1, 
			// do NOT increment countGaps countOnes
		//else 
			// 	add it map and increment countOnes
	
	// if 1 is in hashmap, and this element is 0, 
		// countgap increment
		// countOnes, decrements
	// if last elemnt is a 0, decrement countGap

// traverse array
	// if see a 1
		// count ++, to count gaps

		// increment count, 
	// if count 

	// 1 --> count

// if doesnt end with a 1, decrement count