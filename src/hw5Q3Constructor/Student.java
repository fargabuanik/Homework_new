package hw5Q3Constructor;

public class Student {
	public String stname;
	public int stID;
	public char stSex;
	public float stgrade;
	public boolean stProgrammer;

	public Student() {
		System.out.println("This is default constructor is form Student Class");
			
}
	public Student(String stname){
		this.stname=stname;
		System.out.println("My name is " + stname );
		}
	
	public Student( String stname, int stID, char stSex,  float stgrade, boolean stProgrammer){
		this.stname = stname;
		this.stID = stID;
		this.stSex = stSex;
		this.stProgrammer = stProgrammer;
		this.stgrade = stgrade;
		System.out.println( "This Student name is:"+ stname + " Student stID is: " + stID + "Student sex is: " + stSex +  "Student stgrade" + stgrade + "stProgrammer: " + stProgrammer ); 
		
		}
}
