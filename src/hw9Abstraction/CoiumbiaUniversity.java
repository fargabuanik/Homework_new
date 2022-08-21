package hw9Abstraction;

/*A regular class can inherit only one regular class or one abstract class by extends keyword
*A regular class can't inherit an Interface by extends keyword
implements keyword is used to inherit Interface in regular class.
*a regular class can inherit more than one Interface
*a regular class cannot inherit a regular class or abstract class by implements keyword*/

public class CoiumbiaUniversity extends Medicalschool {
	public void biology() {
		System.out.println("this not abstract method");
	}
	public CoiumbiaUniversity() {
		
		// Default methods are allowed only in interfaces, not in regular class
	}
	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}

}


