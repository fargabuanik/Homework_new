package hw4JavaVaribles;


public class AboutMetest {
	
	public static void main(String[] args) {
		AboutMe aboutme = new AboutMe(); // Constructor Initialized
		aboutme.name = "anik"; // Variables initialized
		aboutme.age =55;
		aboutme.myRent =1800;
		aboutme.myYearlySalary =32767;
		aboutme.mySaving =789066600990l;
		aboutme.myHeight =5.7f;
		aboutme.myGrade =2.0504994;
		aboutme.mySex ='M';
		aboutme.usCitizen =true;
		aboutme.Aboutme(); //method initialized
		
	System.out.println("\n-------------------------------------------\n");
	AboutMe aboutme2 = new AboutMe();
	aboutme2.name ="Alex";
	aboutme2.age =18;
	aboutme2.myRent =1500;
	aboutme2.myYearlySalary=34567;
	aboutme2.mySaving = 789012l;
	aboutme2.myHeight = 5.6f;
	aboutme2.myGrade = 6.1;
	aboutme2.mySex = 'M';
	aboutme2.usCitizen = true;
	aboutme2.Aboutme(); //method declared
	
	}
	

}
