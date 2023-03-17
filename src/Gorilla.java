//Gorilla class that is a subclass of Mammal to have energy levels
public class Gorilla extends Mammal {
	
	//method to throw something
	public void throwSomething() {
		System.out.println("Everyone look out the Gorilla threw a chair!");
		this.setEnergyLevel(this.getEnergyLevel() - 5);
	}
	//method to eat bananas
	public void eatBananas() {
		System.out.println("Ohhh I love bananas!");
		this.setEnergyLevel(this.getEnergyLevel() + 10);
	}
	//method to climb
	public void climb() {
		System.out.println("The gorilla is climing the empire state building!");
		this.setEnergyLevel(this.getEnergyLevel() - 10);
	}
}
