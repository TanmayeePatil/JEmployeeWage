import java.util.Random;


public class EmployeeWage{

 public static void main (String args[]){
      System.out.println("WELCOME TO EMPLOYEE WAGE PROBLEM");

      int empWagePerHrs=20;
      int empSalary,TotalEmpSalary=0;
      int empHrs=0;
      int daysPerMonth=20;
      int i;

    for(i=1;i<=daysPerMonth;i++)
    {
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
        empSalary=empWagePerHrs * empHrs;
        System.out.println("DAY"+i+" : Salary of employee: "+empSalary);
        TotalEmpSalary=empSalary + TotalEmpSalary;
     }
    System.out.println("----------------------------------------------");
    System.out.println("Total Monthly Salary: "+ TotalEmpSalary);
 }
}
