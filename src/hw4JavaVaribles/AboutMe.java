package hw4JavaVaribles;

public class AboutMe {

	public String name; //variables declared
	public byte age ;
	public short myRent;
	public int myYearlySalary;
	public long mySaving;
	public float myHeight; 
	public double myGrade ;
	public char mySex;
	public boolean usCitizen;

	//Constructor declared
	public AboutMe() {
		System.out.println("this all about us"); 
	}	
	// method implemented
	public void aboutMe() {
		System.out.println("My Name is: "+ name + "\nMy age: " +age + "\nMy Rent: " +myRent +"\nMyYearlySalary: " +myYearlySalary + "\nMy Savaing: " +mySaving + "\nmy Height: " +myHeight + "\nmy Grade: " +myGrade + "\nmy: Sex " +mySex + "\nuscitizean " +usCitizen);

	}
}

