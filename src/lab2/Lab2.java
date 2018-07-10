package lab2;

public class Lab2 {
	public static void main(String[] args){
		//Create new student
		Student stu1 = new Student("Hobbs", "111782233");
		//Student stu2 = new Student("Thomas", "222984455");
		//Student stu3 = new Student("Elizabeth", "333566677");
		
		stu1.setPhone("2013421111");
		stu1.setCity("Hackensack");
		stu1.setState("NJ");
		
		stu1.enroll("Math151");
		stu1.enroll("Eng255");
		stu1.enroll("His211");
		stu1.showCourse();
		stu1.checkBalance();
		stu1.payTuition(900);
		stu1.checkBalance();
		System.out.println(stu1.toString());
	}

}

class Student {
	//properties
	private String name;
	private String ssn;
	private String email;
	private static int iD = 1000;
	private String studentID;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	private int amount;
	private String phone;
	private String city;
	private String state;
	
	public Student(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		iD++;
		setEmail();
		setStudentID();
		
	}

	// Should be placed after Constructors
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getPhone(){
		return phone;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return city;
	}
	
	public void setState(String state){
		this.state = state;
	}
	public String getState(){
		return state;
	}	
	
	private void setEmail() {
		email = name.toLowerCase() + "." + iD + "@sdetuniversity.com";
		//System.out.println("Email: " + email);
	}
	
	private void setStudentID(){
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * (max + min));
		randNum = randNum + min;
		if (randNum > 10000){
			randNum = randNum - min;
		}
		studentID = iD + "" + randNum + "" + ssn.substring(5);
		//System.out.println(studentID);
	}
	
	public void enroll(String course){
		this.courses = this.courses + "\n" + course;
		//System.out.println(courses);
		balance = balance + costOfCourse;
		//System.out.println("Balance: " + balance);
	}
	
	public void checkBalance(){
		System.out.println("Balance due: $" + balance);
	}
	
	public void showCourse(){
		System.out.println(courses);
	}
	
	public void payTuition(int amount){
		balance = balance - amount;
		System.out.println("Made payment: $" + amount);
	}
	
	@Override
	public String toString(){
		return "[NAME: "+name+"]\n[COURSES: "+courses+"]\n[BALANCE: "+balance+"]\n[PHONE: "+phone+"]\n[CITY: "+city+"]\n[STATE: "+state+"]";
	}
	
}
