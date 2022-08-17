package hw8Inheritance;

public class AnimalTest {
public static void main(String[] args) {
	BullDog bullDog = new BullDog();
	bullDog.bullDogInfo();
	bullDog.dogInfo();
	
	System.out.println("\n----------------------------\n");
	Mammal mammal = new Mammal();
	mammal.mammalInfo();
	mammal.animalInfo();
	
	System.out.println("\n----------------------------\n");
	Reptile reptile = new Reptile();
	reptile.reptileInfo();
	reptile.animalInfo();
	
	
	System.out.println("\n----------------------------\n");
	Birds birds = new Birds();
	birds.birdsInfo();
	birds.animalInfo();
	
	
	System.out.println("\n----------------------------\n");
	Dog dog =new Dog();
	dog.dogInfo();
	dog.animalInfo();
	dog.mammalInfo();
	
	System.out.println("\n----------------------------\n");
	Snake snake = new Snake();
	snake.snakeInfo();
	snake.reptileInfo();
	snake.animalInfo();
	
	System.out.println("\n----------------------------\n");
	Robin robin = new Robin();
	robin.robinInfo();
	
	System.out.println("\n----------------------------\n");
	BullDog  bullDog2 = new BullDog();
	bullDog.bullDogInfo();
	
	System.out.println("\n----------------------------\n");
	Cobra cobra = new Cobra();
	cobra.cobraInfo();



	


	
	
}
}
