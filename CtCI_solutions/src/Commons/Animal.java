package Commons;

public class Animal {

	private String name;
	private int index;
	
	public Animal() {
		
	}
	
	public Animal (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getIndex() {
		return index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
