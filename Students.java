package studentManagementSystem;

import java.util.Scanner;

public class Students {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String course;
	private int costOfCourse = 500;
	private static int id = 1000;
	private static int totalBalance = 0;
	String courses;
	
//	Constructor: Ask for the name and grade year
	public Students(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name : ");
		this.firstName = sc.nextLine();

		System.out.println("Enter the last name : ");
		this.lastName = sc.nextLine();
		
		System.out.println("Enter your grade year: ");
		this.gradeYear  = sc.nextInt();
		
		setStudentId();
		System.out.println(firstName + " \n" + lastName + "\n" + studentId);
		
	}
	
//	Generate an unique Id that begin with grade year
	private void setStudentId(){
		id++;
		this.studentId  = gradeYear + "" + id;
	}
	
	
//	Enrolling in by students
	public void enrollIn(){
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("Enter the course:- (Press Q to Quit)");
			
			course = sc.nextLine();
			if(!course.equals("Q")) {
				courses = courses + " " + course;
				totalBalance = totalBalance + costOfCourse;
			}else {
				break;
			}
		}while(true);
		System.out.println("The total Balance is "  + totalBalance);
	}
	
	
//	View their balance
	public void viewBalance() {
		System.out.println("The total balance is :- " + totalBalance);
	}
//	Payment
	public void pay() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Now Remaining balance:- " + totalBalance  + "\nEnter the payment:- ");
		int payment =  sc.nextInt();
		totalBalance = totalBalance - payment;
		viewBalance();
		
	}
	
//	See the status
	public String showStatus() {
		return "Name:- " + firstName + " " + lastName +
				"\n Grade Year :- " + gradeYear + 
				"\n Courses :- " + courses +
				"\n StudentID :- " + studentId +
				"\n Remaining Balance :- " + totalBalance;
	}
//	
	
}
