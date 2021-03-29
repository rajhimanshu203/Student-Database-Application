package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private int tuitionBalance = 0;
	private String courses = "";
	private static int costOfTuition = 600;
	private static int id = 1000;
	
	// Constructor :prompt user to enter student's name and year
	
	public Student(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student firstName:");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student lastName:");
		this.lastName = in.nextLine();
		
		System.out.println("1 -Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior \nEnter student class level:");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		//System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);
		
		
		
		
	}
	
	//Generate Id
	private void setStudentID() {
		id++;
		this.studentId = gradeYear + "" + id;
	}
	
	
	
	//Enroll in courses 
	
	public void enroll(){
		//Get inside a loop,user hits 0
		
		do{
		System.out.print("Enter course to enroll (Q to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(!course.equals("Q")){
			courses = courses + "\n " + course;
			tuitionBalance = tuitionBalance + costOfTuition;
			
		}
		else{break;}
		
		} while(1 != 0);
		
		//System.out.println("ENROLLED IN: " + courses);
		//System.out.println("TUITION BALANCE: " + tuitionBalance);
	}
	
	//View Balance
	
	public void viewBalance(){
		System.out.println("YOUR BALANCE IS $" + tuitionBalance);
	}
	
	
	//Pay tuition
	
	public void payTuition(){
		 viewBalance();
		System.out.println("Enter your payment:$");
		Scanner in = new Scanner(System.in);
		 int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank You for your payment of $" + payment);
		viewBalance();
		
	}
	
	
	//Show status
	public String showInfo() {
		return "Name: " + firstName + " " + lastName +
				"\n Grade Level " + gradeYear +
				"\n Student Id " + studentId +
				"\nCources Enrolled:" + courses +
				"\nBalance: $" + tuitionBalance;
	}
	
	

}
