package polimorfizam;

public class Dog extends Animal{

	public Dog(String name, int numLegs){
		super(name,"Pas",numLegs);
	}
	
	public int testAnimal(){
		return this.getNumLegs();
	}
    
	@Override
	public String toString(){
		return "Pas " +this.getName();
	}
	
}
