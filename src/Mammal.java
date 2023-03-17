//Mammal class to hold energy level
public class Mammal {
	private int energyLevel;
	
	//constructor 
	public Mammal() {
		setEnergyLevel(100);
	}
	
	//get current Energy level
	public int getEnergyLevel() {
		return energyLevel;
	}
	//setter for Energy level to be able to read it in sub classes
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
