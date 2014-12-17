package polimorfizam;

public class Animal {

	private String name;
	private String type;
	private int numLegs;
	
	
	public Animal(String name, String type, int numLegs){
		this.name = name;
		this.type=type;
		this.numLegs=numLegs;
	}
	public String toString(){
		String out = "Name: " +name +"\nType: " +type +"\nNumber of legs: " +numLegs;
		return out;
	}
	public boolean equals(Animal other){
		if(this.name.equalsIgnoreCase(other.name) && this.type.equalsIgnoreCase(other.type) && this.numLegs==other.numLegs )
			return true;
		return false;
	}
	
	public String getName() {
		return name;
	}
	
	private int test(){
		return -1;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNumLegs() {
		return numLegs;
	}
	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}
	
}
