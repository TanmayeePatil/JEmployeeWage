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
      int myRanVar=myRan.nextInt(2);
      System.out.println("Random Integers: "+myRanVar);

      if(myRanVar==0)
       {
         System.out.println("Employee Absent");
         empHrs=0;
       }
      else
       {
         System.out.println("Employee Present");
         empHrs=8;
       }

     //Calculating Salary
     empSalary=empWagePerHrs * empHrs;

     System.out.println("Salary of the employee:" + empSalary);

 }
}
