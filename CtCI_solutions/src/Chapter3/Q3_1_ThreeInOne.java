package Chapter3;



public class Q3_1_ThreeInOne {

	/*
	 * 
	 * 
	 * Array [     |     |     ]    size = 9
	 * 		  0 1 2 3 4 5 6 7 8 
	 * 
	 * 
	 * 
	 * */
	private int numStacks = 3;
	private int range;
	private int stacks[];
	private int topStacks[] = {-1, -1, -1};
	
	
	public Q3_1_ThreeInOne(int size) {
		
		stacks = new int [size];
		range = size / numStacks;
		
	}
	public void push(int value, int numStack) {
		
		if(numStack == 1) {
			pushInStack(value, 0);
		}
		if(numStack == 2) {
			pushInStack(value, 1);
		}
		if(numStack == 3) {
			pushInStack(value, 2);
		}
	}
	public int pop(int numStack) {
		
		int value = Integer.MIN_VALUE;
		
		if(numStack == 1) {
			value = popOutStack(0);
		}
		if(numStack == 2) {
			value = popOutStack(1);
		}
		if(numStack == 3) {
			value = popOutStack(2);
		}
		return value;
	}
	public int peek(int numStack) {
		
		int value = Integer.MIN_VALUE;
		
		if(numStack == 1) {
			value = peekOutStack(0);
		}
		if(numStack == 2) {
			value = peekOutStack(1);
		}
		if(numStack == 3) {
			value = peekOutStack(2);
		}
		return value;
	}
	public boolean isEmpty(int numStack) {
		
		boolean value = false;
		
		if(numStack == 1) {
			value = isEmptyStack(0);
		}
		if(numStack == 2) {
			value = isEmptyStack(1);
		}
		if(numStack == 3) {
			value = isEmptyStack(2);
		}
		return value;
	}
	private boolean isEmptyStack(int numStack) {
		if(topStacks[numStack] != 1) {
			return true;
		}
		return false;
	}
	private int peekOutStack(int numStack) {
		int value = Integer.MIN_VALUE;
		
		if(topStacks[numStack] != -1) {
			int index = geIndexGeneral(numStack); 
			value = stacks[index];
		}
		
		return value;
	}
	private int popOutStack(int numStack) {
		
		int value = Integer.MIN_VALUE;
		
		if(topStacks[numStack] != -1) {
			int index = geIndexGeneral(numStack); 
			value = stacks[index];
			topStacks[numStack]--;
		}
		
		return value;
	}
	
	private void pushInStack(int value, int numStack) {
		
		if(topStacks[numStack] < range) {
			topStacks[numStack]++;
			int index = geIndexGeneral(numStack); 
			stacks[index] = value;
		}
	}

	private int geIndexGeneral(int numStack) {
		return (range * numStack) + topStacks[numStack];
	}
	
	public void print() {
		for(int i = 0; i <stacks.length; i++) {
			System.out.print(stacks[i] + " ");
		}
	}
}








