package hw3JavaVariables;


public class AboutMe {

	
	public String name= "Anik"; // variable initialized
	public byte age = 55;
	public short myRent = 1800;
	public int myYearlySalary =32767;
	public long mySavings = 7890866600990l;
	public float myHeight =5.7f;
	public double myGrade = 2.0504994;
	public char mySex = 'M';
	public boolean usCitizen = true;
	
	
	public static void main(String[] args) {
	AboutMe aboutMe=new AboutMe(); //Variable declared
	
	
//	System.out.println(" My age is:"+aboutMe.age);	    //55
//	System.out.println(aboutMe.myRent);   //1800
	
	System.out.println("My Name : " + aboutMe.name +"\nMy age is : "+aboutMe.age +"\nMy Rent : "+aboutMe.myRent+ "\nMy Yearly Salary : " +aboutMe.myYearlySalary + " \nMy savings : " +aboutMe.mySavings + "\nMy Height : " +aboutMe.myHeight  + "\nMy Grade : "+aboutMe.myGrade + " \nMy Sex : " +aboutMe.mySex + "\nI am a US Citizen : " +aboutMe.usCitizen);
	
		}
	
	}






