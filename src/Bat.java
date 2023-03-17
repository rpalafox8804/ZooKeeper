//Bat class that is a subclass of Mammal to have energy levels
public class Bat extends Mammal{
	public Bat() {
		this.setEnergyLevel(300);
	} 
	//method to throw something
	public void fly() {
		System.out.println("I'm Batman!");
		this.setEnergyLevel(this.getEnergyLevel() - 50);
	}
	//method to eat humans
	public void eatHumans() {
		System.out.println("I am Vengeance!");
		this.setEnergyLevel(this.getEnergyLevel() + 25);
	}
	//method to attackTown
	public void attackTown() {
		System.out.println("Let the games begin!!");
		this.setEnergyLevel(this.getEnergyLevel() - 100);
	}
	
}
