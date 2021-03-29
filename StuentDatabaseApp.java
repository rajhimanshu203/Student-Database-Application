package studentdatabaseapp;

import java.util.Scanner;

public class StuentDatabaseApp {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		 //Ask how many new users we want to add
		
		System.out.println("Enter number of new students to be enroll");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		//Create n number opf students
		for(int n = 0 ;n < numOfStudents; n++){
			students[n] = new Student();
			
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].showInfo());
			
		}

	}

}
