package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {

		System.out.println("\n----------------------\n"); 
		Animal animal = new Animal(); //Here is Animal class single inheritance parent class 
		animal.animalInfo();
	
System.out.println("\n---------------------\n");
		BullDog bullDog = new BullDog(); //Multilevel inheritance class
		bullDog.bullDogInfo();
		bullDog.animalInfo();
		bullDog.mammalInfo();

		System.out.println("\n--------------------\n");
		Mammal mammal = new Mammal();  //Multilevel inheritance and hierarchical
		mammal.mammalInfo();
		mammal.animalInfo();



		System.out.println("\n--------------------\n");
		Reptile reptile = new Reptile(); // Multilevel  inheritance and hierarchical
		reptile.reptileInfo();
		reptile.animalInfo();


		System.out.println("\n------------------------\n");
		Birds birds = new Birds(); // Multilevel  inheritance and hierarchical
		birds.birdsInfo();
		birds.animalInfo();


		System.out.println("\n------------------------\n");
		Dog dog =new Dog(); // Multilevel inheritance 
		dog.dogInfo();
		dog.animalInfo();
		dog.mammalInfo();

		System.out.println("\n-------------------------\n");
		Snake snake = new Snake(); // Multilevel inheritance 
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("\n-------------------------\n");
		Robin robin = new Robin(); // Multilevel  inheritance 
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();



		System.out.println("\n-------------------------\n");
		Cobra cobra = new Cobra(); // Multilevel inheritance 
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();



	}
}
