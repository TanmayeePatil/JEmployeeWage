import java.util.Random;


public class EmployeeWage{

 public static void main (String args[]){
      System.out.println("WELCOME TO EMPLOYEE WAGE PROBLEM");

      int empWagePerHrs=20;
      int empSalary,totalEmpSalary=0;
      int i=0,empHrs=0,totalHr=0;
      int daysPerMonth=20;
      int totalMaxHr=100;

    while(totalHr <= totalMaxHr)
    {
      Random myRan=new Random();
      int myRanVar=myRan.nextInt(3);
      //System.out.println("Random Integers: "+myRanVar);

      switch(myRanVar){
          case 2 : //System.out.println("Employee Present Full Time");
                          empHrs=8;
                          break;
          case 1 : //System.out.println("Employee Present Part Time");
                          empHrs=4;
                          break;
          case 0 : //System.out.println("Employee Absent");
                          empHrs=0;
                          break;
          default : System.out.println("Invalid");
      }
        totalHr=totalHr + empHrs;
        empSalary=empWagePerHrs * totalHr;
        totalEmpSalary=empSalary + totalEmpSalary;
    }
    System.out.println("----------------------------------------------");
    System.out.println("Total Salary for 100 Hours: "+ totalEmpSalary);
    System.out.println("----------------------------------------------");
 }
}
