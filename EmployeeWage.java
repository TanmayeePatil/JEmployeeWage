import java.util.Random;


public class EmployeeWage{

 public static void main (String args[]){
      System.out.println("WELCOME TO EMPLOYEE WAGE PROBLEM");

      //USE CASE 2: Calculate Daily Wages
       int empWagePerHrs=20;
       double empSalary=0;
       int empHrs=0;

      //USE CASE 1: Employee Absent or Present using renadom function
      Random myRan=new Random();
      int myRanVar=myRan.nextInt(3);
      System.out.println("Random Integers: "+myRanVar);

      switch(myRanVar){
          case 2 : System.out.println("Employee Present Full Time");
                          empHrs=8;
                          break;
          case 1 : System.out.println("Employee Present Part Time");
                          empHrs=4;
                          break;
          case 0 : System.out.println("Employee Absent");
                          empHrs=0;
                          break;
          default : System.out.println("Invalid");
      }

     //Calculating Salary
     empSalary=empWagePerHrs * empHrs;

     System.out.println("Salary of the employee:" + empSalary);

 }
}
