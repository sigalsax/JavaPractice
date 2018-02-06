public class MyQueue{

	int maxSize;
	int [] q;
	int numOfElements;
	int top;

	public MyQueue(int size){
		top=0;
		maxSize=size;
		numOfElements=0;
		q= new int [maxSize];
	}
	// adds item to back of queue
	public void enqueue(int number){	
		if (numOfElements < maxSize){
			q[numOfElements++]=number;
		} else {
			throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
		}
		
	}
	// removes item from beginning of queue
	public void dequeue(){
		if (top <= maxSize){
			q[top++]=0;
		} 
		else{
			throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
		}
	}

	public String toString(){
		String queue="";
		for (int i=0; i <q.length; i++){
			queue+= (q[i]+ " ");
		}
		return queue;
	}
}