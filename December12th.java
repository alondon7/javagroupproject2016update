/*Ruben Tapia; Guilherme Maciel; Andrew London
 * CIS 3260 - 012 -- Professor Alan Yang
 * Due Date: December 12th, 2016
 * Group Project: Student/Teacher Account Creation, Modification, Access, & Display
 */
import java.util.Scanner;//import scanner for user input
import java.text.DecimalFormat;//import decimal format to be used to format GPA to two decimal places when output

public class December12th {//December 12th class begins
	public static DecimalFormat df1 = new DecimalFormat("#.00");//decimal formatter used for Dec12th class
	public static createStudent[] sObjArray= new createStudent[10];//student object array initialized at length of 10
	public static createEmployee[] eObjArray = new createEmployee[10];//employee object array initialized at length of 10
	
	
	public static void getGpaC1(createStudent[] z){//outputs GPA of student enrolled in CIS 3260
		double total=0;//to be used to sum all gpa's 
		double counter=0;//to be used as divisor when calculating GPA
		for(int i = 0;i<z.length;i++){//for loop initialized to iterate through each object of student object array
			if (z[i].getCourses().contains("CIS3260")==true){total+=z[i].getGPA();
			counter++;}//checks student object for "CIS3260" credentials and adds to total and post-increments counter
		}System.out.println("The average student GPA for the course \"CIS 3260\" is: "+df1.format(total/counter));
		//statement outputs statement for class average GPA, GPA formatted to 2 decimal places 
	}	
	
	public static void getGpaC2(createStudent[] z){//outputs GPA of student enrolled in CIS 2010
		double total=0;//to be used to sum all gpa's 
		double counter=0;//to be used as divisor when calculating GPA
		for(int i = 0;i<z.length;i++){//for loop initialized to iterate through each object of student object array
		if (z[i].getCourses().contains("CIS2010")==true){total+=z[i].getGPA();
		counter++;}//checks student object for "CIS2010" credentials and adds to total and post-increments counter
		}System.out.println("The average student GPA for the course \"CIS 2010\" is: "+df1.format(total/counter));
	}	//statement outputs statement for class average GPA, GPA formatted to 2 decimal places
	
	public static void getGpaC3(createStudent[] z){//outputs GPA of student enrolled in IB3090
		double total=0;//to be used to sum all gpa's
		double counter=0;//to be used as divisor when calculating GPA
		for(int i = 0;i<z.length;i++){//for loop initialized to iterate through each object of student object array
			//checks student object for "IB3090" credentials and adds to total and post-increments counter	
		if (z[i].getCourses().contains("IB3090")==true){total+=z[i].getGPA();
		counter++;}
		}System.out.println("The average student GPA for the course \"IB 3090\" is: "+df1.format(total/counter));
	}	//statement outputs statement for class average GPA, GPA formatted to 2 decimal places
	
	public static void displayTable(createStudent[] z){//displays table of information of students in Student Object array
		System.out.println("ID:\tName:\t\t\tGPA:\t\tGrad Year:\t\tCourses:\t");//Table header
		for(int i= 0; i<z.length;i++){//for loop initiates to cycle through each object in student array table
		System.out.print(z[i].getID()+"\t"+String.format("%-20s",(z[i].getName()))+"\t"+df1.format(z[i].getGPA())+"\t\t"+z[i].getGY()+"\t\t\t"+z[i].getCourses());
		System.out.println("");//5 different get methods used to return information per student attribute
		}					   //formatter adjusts Student name to be padded with spaces to fit table, GPA formatted to 2 decimal places
	}
	
	public static void allStudentGPA(createStudent[] x){//displays average GPA of all students in student object Array
		double total = 0;//total sums all values of gpa as for loop iterates
		double average = 0;//to be used as gpa average variable
		for(int i = 0;i<x.length;i++){
			total += x[i].getGPA();
		}//for loop iterates through each student object and method gets gpa of each student object
		average = total/x.length;//average calculated
		System.out.println("GPA of Entire Student Body: "+df1.format(average));
	}	//outputs GPA of entire student object array, formats average to two decimal places
	
	public static void displayStuRoll(createStudent[] z){//displays the students enrolled in a particular course
		System.out.println("Students enrolled in CIS 3260: ");//header statement
		for(int i = 0;i<z.length;i++){//for loop iterates through Student Object Array
			if(z[i].getCourses().contains("CIS3260")){System.out.println("\t"+z[i].getName());}
			}//if Student object contains "CIS3260" as part of enrolled courses, student's name is printed
		System.out.println("Students enrolled in CIS 2010: ");//header statement
		for(int j = 0;j<z.length;j++){//for loop iterates through Student Object Array
			if(z[j].getCourses().contains("CIS2010")){System.out.println("\t"+z[j].getName());}
		}//if Student object contains "CIS2010" as part of enrolled courses, student's name is printed
		System.out.println("Students enrolled in IB 3090: ");//header statement
		for(int k = 0;k<z.length;k++){//for loop iterates through Student Object Array
			if(z[k].getCourses().contains("IB3090")){System.out.println("\t"+z[k].getName());}
		}//if Student object contains "IB3090" as part of enrolled courses, student's name is printed
		System.out.println("Students not enrolled: ");//header statement
		for(int l = 0;l<z.length;l++){//if student is not enrolled then the student's name is printed out
			if(z[l].getCourses().contains("NONE")){System.out.println("\t"+z[l].getName());}
		}
	}
	
	public static void displayCoursesTaught(createEmployee[] h){//displays the employees listed teaching a particular course
		System.out.println("Instructors teaching CIS 3260: ");//header statement
		for(int i = 0;i<h.length;i++){//for loop iterates through Employee Object Array
			if(h[i].getTCourses().contains("CIS3260")){System.out.println("\t"+h[i].emName());}
			}//if Employee object contains "CIS3260" as part of teaching curriculum, teacher's name is printed
		System.out.println("Instructors teaching CIS 2010: ");//header statement
		for(int j = 0;j<h.length;j++){//for loop iterates through Employee Object Array
			if(h[j].getTCourses().contains("CIS2010")){System.out.println("\t"+h[j].emName());}
		}//if Employee object contains "CIS2010" as part of teaching curriculum, teacher's name is printed
		System.out.println("Instructors teaching IB 3090: ");//header statement
		for(int k = 0;k<h.length;k++){//for loop iterates through Employee Object Array
			if(h[k].getTCourses().contains("IB3090")){System.out.println("\t"+h[k].emName());}
		}//if Employee object contains "IB3090" as part of teaching curriculum, teacher's name is printed
	}
	
	public static void empTable(createEmployee[] z){//displays table of information of employees in employee Object array
		System.out.println("ID:\tName:\t\t\tJob Title:\t\tHire Date:\t\tCourses Taught:\t");//Table header
		for(int i= 0; i<z.length;i++){//for loop initiates to cycle through each object in teacher array table
		System.out.print(z[i].emID()+"\t"+String.format("%-20s",(z[i].emName()))+"\t"+String.format("%-15s",(z[i].emJob()))+"\t\t"+z[i].emStartDate()+"\t\t"+z[i].getTCourses());
		System.out.println("");//5 different get methods used to return information per teacher attribute
		}					   //formatter used to pad spacing per teacher entry for name and job title
	}
	public static void main(String[] args) {
	//employees created first with argument constructor
		createEmployee e1 = new createEmployee("Joe Bloom", "Instructor",1,2,1982,"CIS2010, CIS3260");
		createEmployee e2 = new createEmployee("Sarah Wake", "Accountant",2,24,1990,"NONE");
		createEmployee e3 = new createEmployee("Robert Ford", "Instructor",1,23,1999,"CIS3260");
		createEmployee e4 = new createEmployee("William Jackson", "Instructor",12,12,2011,"CIS2010");
		createEmployee e5 = new createEmployee("Margret Thatcher", "Provost",02,24,2014,"NONE");
		createEmployee e6 = new createEmployee("Nicholas Werner", "Instructor",1,2,1982,"CIS2010, CIS3260, IB3090");
		createEmployee e7 = new createEmployee("Sasha Blom", "Groundskeeper",2,24,1990,"NONE");
		createEmployee e8 = new createEmployee("Richard Silva", "Instructor",1,23,1999,"CIS3260");
		createEmployee e9 = new createEmployee("Elma Lupin", "Accountant",12,12,2011,"NONE");
		createEmployee e10 = new createEmployee("Carter Gunderson", "Instructor",02,24,2014,"NONE");
		eObjArray[0]=e1;
		eObjArray[1]=e2;
		eObjArray[2]=e3;
		eObjArray[3]=e4;
		eObjArray[4]=e5;
		eObjArray[5]=e6;
		eObjArray[6]=e7;
		eObjArray[7]=e8;
		eObjArray[8]=e9;
		eObjArray[9]=e10;
	//10 Employee Objects Constructed and assigned to a specific element in Employee Object Array Above
		displayCoursesTaught(eObjArray);//Displays Instructors assigned as a teacher per course
		empTable(eObjArray);//Displays Table representing information on each employee in Array
		
		
	//Student Section created with argument Constructor	
		createStudent s1 = new createStudent("Jane Axle",3.6,2017,"CIS3260, CIS2010");
		createStudent s2 = new createStudent("Rod Stars",2.7,2018,"CIS2010");
		createStudent s3 = new createStudent("Jake Ford",3.2,2016,"CIS3260");
		createStudent s4 = new createStudent("Mary Brown",3.3,2019,"NONE");
		createStudent s5 = new createStudent("Paula Rice",3.8,2017,"CIS2010");
		createStudent s6 = new createStudent("Rick White",3.6,2017,"IB3090");
		createStudent s7 = new createStudent("Clarence Wood",2.7,2018,"CIS2010, IB3090");
		createStudent s8 = new createStudent("Alex Noon",3.2,2016,"CIS3260");
		createStudent s9 = new createStudent("Quincy Archer",3.3,2019,"NONE");
		createStudent s10 = new createStudent("Catherine Harris",3.8,2017,"CIS2010");
		sObjArray[0]=s1;
		sObjArray[1]=s2;
		sObjArray[2]=s3;
		sObjArray[3]=s4;
		sObjArray[4]=s5;
		sObjArray[5]=s6;
		sObjArray[6]=s7;
		sObjArray[7]=s8;
		sObjArray[8]=s9;
		sObjArray[9]=s10;
	//10 Student Objects Constructed and assigned to a specific element in Student Object Array Above	
		getGpaC1(sObjArray);//method Outputs value of class average GPA for "CIS 3260"
		getGpaC2(sObjArray);//method Outputs value of class average GPA for "CIS 2010"
		getGpaC3(sObjArray);//method Outputs value of class average GPA for "IB 3090"
		allStudentGPA(sObjArray);//method Outputs GPA of all Students in Student Object Array
		displayStuRoll(sObjArray);//method Outputs list of students enrolled in all available classes
		displayTable(sObjArray);//table Outputs list of information per student
	
	//createStudent Class Methods
		createStudent s11 = new createStudent();//default Constructor used to create Student
		s11.displayStuBasInfo();//displays info from default Constructor on particular Student
		s11.setUpStuAcct();//allows Teacher/Administrator to set up a student account information
		s11.displayStuBasInfo();//changes displayed
		s11.setGPA();//change gpa of student
		s11.displayStuBasInfo();//changes displayed
		s11.setGY();//change graduation year of student
		s11.displayStuBasInfo();//changes displayed
		s11.setCourses();//changes courses of student
		s11.displayStuBasInfo();//changes displayed
		s11.setCourses();//changes courses of student
		s11.displayStuBasInfo();//changes displayed
	
	//createEmployee default constructor	
		createEmployee e11 = new createEmployee();//default Constructor used to create Employee
		e11.displayEmpInfo();//display information on employee
	//Modify pre-existing employee and display information about employee
		e1.setJob();//job title of employee changed via user input
		e1.displayEmpInfo();//displays information on particular employee
		e1.getCoursesInstructed();//outputs courses a particular employee teaches
		e1.displayEmpInfo();//displays information on particular employee
		
	
		
		
		}//main end


	}//Dec12th End


class createStudent{
	public static DecimalFormat ff1 = new DecimalFormat("#.00");//Decimal Formatter to be used for GPA double
	public static DecimalFormat ff2 = new DecimalFormat("0000");
	private static int studentCounter = 9000;//Counter variable to be used for employee ID
	private int stuID;//Student ID assigned to Student
	private String stuName;//Name of Student
	private double gpa;//GPA of Student
	private int gradYear;//Graduation Year of Student
	private String Courses;//Courses Student is taking

	createStudent(){//default constructor
		stuID = studentCounter++;//each time a student object is constructed a Student ID is assigned and counter postincrements
		stuName = "Note: Default Student";//default Student Name
		gpa = 0.0;//default gpa value
		gradYear = 0001;//default year of graduation
		Courses = "NONE";//default courses enrolled
		}
	createStudent(String x, double y, int z, String a){//constructor with parameters
		stuID = studentCounter++;////each time a student object is constructed a Student ID is assigned and counter postincrements
		stuName = x;//student name assigned the value of x from parameter
		gpa = y;//gpa assigned the value of y parameter
		gradYear = z;//graduation year assigned the value of z
		Courses = a;//courses assigned the value of String a
		
	}
	void setUpStuAcct(){//User friendly method to setup a Student Account by Teacher
		Scanner input = new Scanner(System.in);//Scanner object input initialized for user input
		Scanner course = new Scanner(System.in);//Scanner object course initialized for user input
		System.out.println("Enter Student Name: ");//prompts user to enter name
			stuName = input.nextLine();//Student Name stored from user input
		System.out.println("Enter GPA: ");//prompts user to enter gpa of student
			gpa = input.nextDouble();//gpa stored from user input
			int b = 1;//to be used as a constraint @for loop
			for(int a=0;a<b;a++){//for loop used to qualify entry of teacher
		if (gpa>4.3 || gpa<0.0){System.out.println("Error: Invalid GPA. Please Re-enter appropriate GPA for this student.");
			gpa = input.nextDouble();a--;}}//if entry is a valid double for GPA code continues to execute otherwise RE-ENTER
		System.out.println("Enter Graduation Year: ");//prompts user to enter Graduation Year
			gradYear = input.nextInt();//graduation year stored as an integer
			int j = 1;//constraint used in for loop
			for(int i=0;i<j;i++){//for loop used to qualify entry of user/teacher
			if (gradYear>2099 || gradYear<2016){System.out.println("Error: Please enter appropriate Graduation Year.");
			gradYear = input.nextInt();i--;}}//if graduation year is not within constraints, user is prompted to RE-ENTER value until conditions met
		System.out.println("Please enter course(s) for this student separated by a comma: ");//prompts user to select from courses
		System.out.println("You may select from this list: NONE, CIS3260, CIS2010, IB3090");//choice list presented
			Courses = course.nextLine().toUpperCase();//user input is stored in Courses
			int z = 1;//constraint used in for loop
			for(int p=0;p<z;p++){//for loop used to qualify entry of user/teacher
			if (Courses.contains("CIS3260")||Courses.contains("CIS2010")||Courses.contains("IB3090")||Courses.contains("NONE")){}
			else {System.out.println("Error: Please enter appropriate course from selection.");
				Courses = course.nextLine().toUpperCase();p--;}}//if user enters incorrect courses, user is prompted to RE-ENTER
		System.out.println("ID: "+stuID+" Name: "+stuName+" GPA: "+ff1.format(gpa)+" Graduation Year: "+gradYear+" Courses: "+Courses);
		System.out.println("");//prints out representation of student account information for teacher with formatted GPA value @two decimals
		
	}
	void displayStuBasInfo(){//displays student account information, GPA formatted to two decimal places
		System.out.println("ID: "+stuID+" Name: "+stuName+" GPA: "+ff1.format(gpa)+" Graduation Year: "+ff2.format(gradYear)+" Courses: "+Courses);
	}	
	public void setGPA(){System.out.println("Set Student's GPA:");//set method for modifying GPA
		Scanner inputgpa = new Scanner(System.in);//Scanner object created for user input
			gpa = inputgpa.nextDouble();//gpa stored as a result from user input
			int b = 1;//constraint used in for loop
			for(int a=0;a<b;a++){//for loop used to qualify validity of user input
		if (gpa>4.3 || gpa<0.0){System.out.println("Error: Invalid GPA. Please Re-enter appropriate GPA for this student.");
			gpa = inputgpa.nextDouble();a--;}}//if user input does not fit parameters, user is prompted to RE-ENTER
			}
	public void setGY(){System.out.println("Set Student's Graduation Year: ");//method used to set Graduation Year
		Scanner inputGY = new Scanner(System.in);//input Scanner object initialized of for user input
			gradYear = inputGY.nextInt();//graduation year entered by user
			int j = 1;//to be used as constraint in for loop
			for(int i=0;i<j;i++){//for loop used to qualify validity of user input
			if (gradYear>2099 || gradYear<2016){System.out.println("Error: Please enter appropriate Graduation Year.");
			gradYear = inputGY.nextInt();i--;}}//if user input for graduation year is invalid, user prompted to RE-ENTER
	}
	public void setCourses(){//set method for courses per student
		Scanner inputCourse = new Scanner(System.in);//Scanner object for user input
		System.out.println("Please enter courses for this student separated by a comma: ");//user prompted
		System.out.println("You may select from this list: NONE, CIS3260, CIS2010, IB3090");//select from list
			Courses = inputCourse.nextLine().toUpperCase();//user input CAPITALIZED
			int j = 1;//used as constraint in for loop
			for(int i=0;i<j;i++){//for loop used to qualify validity of user input
			if (Courses.contains("CIS3260")||Courses.contains("CIS2010")||Courses.contains("IB3090")||Courses.contains("NONE")){}
			else {System.out.println("Error: Please enter appropriate course from selection.");
				Courses = inputCourse.nextLine().toUpperCase();i--;}}//if user input is invalid, user is prompted to RE-ENTER
	}
	public double getGPA(){return gpa;}//get Method returns gpa
	public String getName(){return stuName;}//get method returns Student Name
	public int getID(){return stuID;}//get method returns Student ID
	public int getGY(){return gradYear;}//get method returns Graduation Year
	public String getCourses(){return Courses;}//get method returns Courses

}
class createEmployee{//Employee Class Begins
		
		private static int employeeCounter = 2000;//to be used for creating an Employee ID within Constructor
		private int empID;//used in constructor, gives each employee object an ID#
		private String empName;//name of the employee used in constructor
		private int month = 01;//default month value
		private int day = 01;//default day value
		private int year = 0001;//default year value
		private StringBuilder dateOfEmp = new StringBuilder();//String Builder used to generate hire date for an employee
		private String hireDate;//will be used within Constructor, represents the hiring date of an employee
		private String job;//Job Title of employee
		private String tCourses;//Courses taught by employee if any

		createEmployee(){//default constructor
			empID = employeeCounter++;//employee ID is generated as a result ID Counter
			empName = "Note: Default Employee";//empName is generated as a result of post-incrementing employee counter
			job = "";//default value for job is left blank
			String mm = String.format("%02d", month);//new string is generated by converting an "int" to String value with 2 placeholders
			String dd = String.format("%02d", day);//new string is generated by converting an "int" to String value with 2 placeholders
			String yyyy = String.format("%04d", year);//new string is generated by converting an "int" to String value with 4 placeholders
			dateOfEmp.append(mm+dd+yyyy);//StringBuilder used to concatenate months, days, & years
			dateOfEmp.insert(2, "/");//separates months from days in string builder
			dateOfEmp.insert(5, "/");//separates days from years in string builder
			hireDate = dateOfEmp.toString();//converts string builder to a string
			tCourses = "NONE";//default value for courses being taught is none
			}
		createEmployee(String x, String y, int m, int d, int yr, String z){//creates new employee with parameters entered in by administrator
			empID = employeeCounter++;//same as default constructor
			empName = x;//name
			job = y;//job title
			String mm = String.format("%02d", m);//new string is generated by converting an "int" to String value with 2 placeholders
			String dd = String.format("%02d", d);//new string is generated by converting an "int" to String value with 2 placeholders
			String yyyy = String.format("%04d", yr);//new string is generated by converting an "int" to String value with 4 placeholders
			dateOfEmp.append(mm+dd+yyyy);//StringBuilder used to concatenate months, days, & years
			dateOfEmp.insert(2, "/");//separates months from days in string builder
			dateOfEmp.insert(5, "/");//separates days from years in string builder
			hireDate = dateOfEmp.toString();//converts string builder to a string type
			if (job.toUpperCase().contains("INSTRUCTOR")){//if else statement qualifies if employee is an Instructor
				tCourses = z;}//assigns value of parameter in header if qualified
			else{tCourses="NONE";}//otherwise no courses are instructed
			
		}
		void setJob(){//method to modify employee's job title
			Scanner inJob = new Scanner(System.in);//input Scanner object
			System.out.println("Please Enter Employee's Job Title: ");//prompt user
			job = inJob.nextLine().toUpperCase();//Job title stored in "job" variable and uppercased
			if(job.contains("INSTRUCTOR")){//if statement qualifies whether employee is an instructor
				;}
			else{tCourses="NONE";}//else the employee's courses that are instructed are reset 
		}
		void displayEmpInfo(){//outputs employee information
			System.out.println("Employee ID: "+empID+" Name: "+empName+" Job: "+job+" Hire Date: "+hireDate+" Courses Taught: "+tCourses);
		}
		void getCoursesInstructed(){//outputs job title & name of employee and the courses taught
			if(job.contains("INSTRUCTOR")){
			System.out.println(job+" "+empName+" teaches: "+tCourses);}
			else{System.out.println("Employee is not an Instructor.");}//else an employee is not an instructor
		}
		public int emID(){return empID;}//get method employee ID
		public String emName(){return empName;}//get method employee name
		public String emJob(){return job;}//get method employee job
		public String emStartDate(){return hireDate;}//get method employee Hire Date
		public String getTCourses(){return tCourses;}//get method employee Courses taught
		
	}

	

	

