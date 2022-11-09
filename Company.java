import java.util.Scanner;

class Employee
{
    String Name;
    int EmpID;
    String result;
    int ass1;
    int ass2;
    int ass3;

    int tot;
    float per;

    void ReadAssesmentValues()
    {
        System.out.println("Enter Assesment 1 value out of 100: ");

        Scanner sc=new Scanner(System.in);
        this.ass1=sc.nextInt();

        System.out.println("Enter Assesment 2 value out of 100: ");
        this.ass2=sc.nextInt();

        System.out.println("Enter Assesment 3 value out of 100: ");
        this.ass3=sc.nextInt();

        if ((this.ass1 > 75) && (this.ass2 > 75) && (this.ass3 > 75))
        {
            this.result = "Promoted";
            System.out.println("Employee "+this.Name+" is "+this.result);

        }
        else
        {
            this.result = "Demoted";
            System.out.println("Employee "+this.Name+" is "+this.result);

        }

    }

    void Total()
    {
        this.tot=this.ass1+this.ass2+this.ass3;

        System.out.println("Total score of employees out of 300 is "+this.tot);
    }

    void Percentage()
    {
        this.per=(float)this.tot*100/300;

        System.out.println("Percentage of marks scored by employee is "+String.format("%.2f",this.per));
    }
}

public class Company {

    public static void main(String args[])
    {
        Employee e1=new Employee();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter employee name: ");
        e1.Name=sc.nextLine();

        System.out.println("Enter employee id: ");
        e1.EmpID= sc.nextInt();

        e1.ReadAssesmentValues();
        e1.Total();
        e1.Percentage();

    }
}
