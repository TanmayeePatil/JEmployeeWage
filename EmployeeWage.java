import java.util.Random;


public class EmployeeWage{

 public static void main (String args[]){
      System.out.println("WELCOME TO EMPLOYEE WAGE PROBLEM");

       int empWagePerHrs=20;
       double empSalary=0;
       int empHrs=0;

      Random myRan=new Random();
      int myRanVar=myRan.nextInt(3);
      System.out.println("Random Integers: "+myRanVar);

      switch(myRanVar){
          case 2 : System.out.println("Employee Present Full Time");
                          empHrs=12;
                          break;
          case 1 : System.out.println("Employee Present Part Time");
                          empHrs=8;
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
