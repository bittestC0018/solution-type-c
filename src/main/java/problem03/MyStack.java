package problem03;

public class MyStack {

	private String[] buffer;

	public MyStack( int size ) {
		buffer=new String[size+1];
	}

	public void push(String item) {
		buffer[size()]=item;
		
	}

	public String pop() {
		return buffer[size()-1];
	}

	public boolean isEmpty() {
		for(int i=0; i<size(); i++) {
			if(buffer[size()]==null) {
				return false;
			}
		}
		return true;
	}

	public int size() {
		for(int i=0; i<buffer.length; i++) {
			if(buffer[i]==null) {
				return i;
			}
		}
		return 0;
	}
}