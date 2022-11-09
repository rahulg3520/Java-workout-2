import java.util.Scanner;

class Faculty
{
    int facultyid;
    int salary;

}

class FullTimeFaculty extends Faculty
{
    int basic;
    int allowance;

    void input()
    {
        System.out.println("Reading input data for full time faculty");

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter full time faculty id");

        this.facultyid=sc.nextInt();

        System.out.println("Enter basic amount:");

        this.basic=sc.nextInt();

        System.out.println("Enter allowance amount:");

        this.allowance= sc.nextInt();

    }

    void FindSalary()
    {
        System.out.println("Finding salary for full time faculty");

        this.salary = this.basic+this.allowance;
        System.out.println("Salary of full time faculty:"+ this.salary);
    }

    void display()
    {
        System.out.println("Full time faculty data");

        System.out.println("Faculty id: "+ this.facultyid);
        System.out.println("Basic salary: "+ this.basic);
        System.out.println("Allowance: "+ this.allowance);
        System.out.println("Salary: "+ this.salary);

    }

}

class PartTimeFaculty extends Faculty
{
    int hour;
    int rate;

    void input()
    {
        System.out.println("Reading input data for part time faculty");

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter part time faculty id");

        this.facultyid=sc.nextInt();

        System.out.println("Enter number of hours worked:");

        this.hour=sc.nextInt();

        System.out.println("Enter rate per hour:");

        this.rate= sc.nextInt();
    }

    void FindSalary()
    {
        System.out.println("Finding salary for part time faculty");

        this.salary = this.hour * this.rate;
        System.out.println("Salary of part time faculty:"+ this.salary);
    }

    void display()
    {
        System.out.println("Part time faculty data");

        System.out.println("Faculty id: "+ this.facultyid);
        System.out.println("No of hours worked: "+ this.hour);
        System.out.println("Rate per hour: "+ this.rate);
        System.out.println("Salary: "+ this.salary);

    }

}



public class DriverClass {

    public static void main(String args[])
    {
        FullTimeFaculty ftf1=new FullTimeFaculty();

        ftf1.input();
        ftf1.FindSalary();
        ftf1.display();

        FullTimeFaculty ftf2=new FullTimeFaculty();

        ftf2.input();
        ftf2.FindSalary();
        ftf2.display();

        PartTimeFaculty ptf1=new PartTimeFaculty();

        ptf1.input();
        ptf1.FindSalary();
        ptf1.display();

        PartTimeFaculty ptf2=new PartTimeFaculty();

        ptf2.input();
        ptf2.FindSalary();
        ptf2.display();


    }

}
