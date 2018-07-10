package Labs;

import java.util.ArrayList;

public class StudentAccounts {

	public static void main(String[] args) {
		StudentAccount stu1 = new StudentAccount("Jim Monk", "897541111");
		StudentAccount stu2 = new StudentAccount("Karl Strato", "789562222");
//		StudentAccount stu3 = new StudentAccount("Ray Comey", "879453333");
		
		stu1.setPhone("111-234-1111");
		stu1.setCity("Hackensack");
		stu1.setState("NJ");
		System.out.println(stu1.toString());
		
		stu1.courseEnroll("English");
		stu1.courseEnroll("History");
		stu1.courseEnroll("Math");
		
		stu1.showCourses();
		stu1.payBill(983.67);

		
		stu2.setPhone("222-567-2222");
		stu2.setCity("Manhattan");
		stu2.setState("NY");
		System.out.println(stu2.toString());
		
		stu2.courseEnroll("Astronomy");
		stu2.courseEnroll("Physics");
		stu2.courseEnroll("Geology");
		stu2.courseEnroll("Chemistry");
		
		stu2.showCourses();
		stu2.payBill(2407.89);
	}
}
		
	class StudentAccount {
		private String name;
		private String ssn;
		private static final String iD = "1234";
		private String email;
		private String studentID;
		private String phone;
		private String city;
		private String state;
		private static final double courseCost = 3000;
		private double balance;
		ArrayList<String> myCourses = new ArrayList<String>();	

		
		StudentAccount(String name, String ssn){
			this.name = name;
			this.ssn = ssn;
			setEmail();
			setUserID();
		}
			
		private void setEmail(){
			String[] splName = name.split(" ");
			email = splName[0].substring(0, 1) + splName[1] + "@lab2.tst";
		}
			
		private void setUserID() {
			int stuRand = (int) (Math.random() * 10000);
			studentID = iD + "" + stuRand + ssn.substring(ssn.length() - 4);	
		}		
			
		public void payBill(double amount){
			balance = balance - amount;
			System.out.println("Deposited: " + amount);
			checkBalance();
		}
			
		private void checkBalance (){
			System.out.println("Remaining Balance: " + balance);
		}
						
		public void courseEnroll(String course){
			myCourses.add(course);
			balance = balance + courseCost;
//			System.out.println("Add Course: " + course);
		}
			
		public void showCourses(){
			for (int i=0;i<myCourses.size();i++){
				System.out.println("***** " + myCourses.get(i) + " *****");
			}
		}
							
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
			
		@Override
		public String toString(){
			return "[Name: " + name + "]\n[Student ID: " + studentID + "]\n[SSN: " + ssn + "]\n[Email: " + email + "]\n[Phone: " + phone + "]\n[City: " + city + "]\n[State: " + state + "]"; 
		}	
	}