public class MyStack{

	int maxSize;
	int minTop;
	int stackTop;
	int [] stackArray;
	int [] minElement;

	public MyStack(int size){
		maxSize=size;
		stackTop=0;
		minTop=0;
		stackArray= new int [maxSize];
		minElement= new int [maxSize];
	}
	
	// add element at top of stack
	public int push(int number){
		if (stackTop<maxSize){
			if ((minTop==0) || (number <= minElement[minTop-1])){
				minElement[minTop++]=number;
			}
			return stackArray[stackTop++]=number;
		}
		else{
			throw new RuntimeException("Stack Overflow");
		}		
	}
	// remove first element at top of stack
	public int pop(){
		if (stackTop>=0){
			if (stackArray[stackTop-1] == minElement[minTop-1]){
				minElement[--minTop]=0;
			} else if (stackArray[stackTop-1] > minElement[stackTop-1]){
				return stackArray[--stackTop];
			}
			return stackArray[--stackTop];
		}else{
			 throw new RuntimeException("Stack Underflow");
		}
	}
	// look at top element
	public int peek(){
		if (stackTop>0){
			System.out.println("stacktop:" + stackTop);
			return (stackArray[stackTop-1]);
		}else{
			// supposedly will never get here because caught my pop and push methods
			 throw new RuntimeException("Stack Underflow");
		}
	}

	public int min(){
		if (stackTop>0){
			System.out.println("minTop " + minTop);
			System.out.println("stacktop " + stackTop);
			return minElement[minTop-1];

		} else{
			return 0;
		}
	}

	public String toString(){
		String stackString="";
		for (int i=0; i <stackTop; i++){
			stackString+=(stackArray[i] + " ");
		}
		return stackString;
	}
}
