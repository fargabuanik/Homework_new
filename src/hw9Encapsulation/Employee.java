package hw9Encapsulation;


public class Employee {
	private String name;
	private int age;
	private char sex;
	private boolean usCitizen;
	public String getName() { // getter is return type method
		return name;
	}
	public void setName(String name) {   //setter is void type parameterized method
		this.name = name;
	}
	public int getAge() { 
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public boolean isUsCitizen() {
		return usCitizen;
	}
	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}


}
