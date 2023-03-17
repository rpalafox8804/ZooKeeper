
public class ZooKeeperTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Testing Mammal
		Mammal monkey = new Mammal();
		System.out.println("The Monkey energy level is " + monkey.getEnergyLevel());
		
		//testing gorilla class with throwing
		Gorilla charlie = new Gorilla();
		charlie.throwSomething();
		charlie.throwSomething();
		charlie.throwSomething();

		System.out.println("The Gorilla energy level is " + charlie.getEnergyLevel());
		System.out.println("The Monkey level is " + monkey.getEnergyLevel());
		
		//testing gorilla class with eating a banana
		charlie.eatBananas();
		charlie.eatBananas();
		System.out.println("The Gorilla energy level is " + charlie.getEnergyLevel());
		
		//testing the climb method for a gorilla class
		charlie.climb();
		System.out.println("The Gorilla energy level is " + charlie.getEnergyLevel());

		//testing Bat class
		Bat bruceWayne = new Bat();
		System.out.println("The Bat energy level is " + bruceWayne.getEnergyLevel());
		
		//attack three towns
		bruceWayne.attackTown();
		bruceWayne.attackTown();
		bruceWayne.attackTown();
		System.out.println("The Bat energy level is " + bruceWayne.getEnergyLevel());


		//eat two humans
		bruceWayne.eatHumans();
		bruceWayne.eatHumans();
		System.out.println("The Bat energy level is " + bruceWayne.getEnergyLevel());

		
		//test Bat Fly method
		bruceWayne.fly();
		bruceWayne.fly();
		System.out.println("The Bat energy level is " + bruceWayne.getEnergyLevel());
		System.out.println("The Gorilla energy level is " + charlie.getEnergyLevel());
		System.out.println("The Monkey level is " + monkey.getEnergyLevel());

	}
	

}
