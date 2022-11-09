import java.util.Scanner;

class Medicine
{
    String Name;
    String address;

    void displayLabel()
    {
        System.out.println("Name of Medicine: "+this.Name);
        System.out.println("Address of company: "+this.address);
    }
}

class Tablet extends Medicine
{
    void displayLabel() {
        super.displayLabel();
        System.out.println("store in a cool dry place\n");
    }
}

class Syrup extends Medicine
{
    void displayLabel() {
        super.displayLabel();
        System.out.println("consume in 2 spoons of water\n");
    }
}

class Ointment extends Medicine
{
    void displayLabel() {
        super.displayLabel();
        System.out.println("For external use only\n");
    }
}

public class TestMedicine {

    public static void main(String args[])
    {
        int min = 1;
        int max = 3;

        //Generate random int value from 1 to 3
        System.out.println("Random value of type int between "+min+" to "+max+ ":");
        int b = (int)(Math.random()*(max-min+1)+min);
        System.out.println("Random number: "+b);

        Scanner sc=new Scanner(System.in);

        switch (b)
        {
            case 1: Tablet t1=new Tablet();
                    System.out.println("Enter name of tablet: ");
                    t1.Name=sc.nextLine();
                    System.out.println("Enter address of company: ");
                    t1.address=sc.nextLine();
                    t1.displayLabel();
                    break;

            case 2: Syrup s1=new Syrup();
                    System.out.println("Enter name of syrup: ");
                    s1.Name=sc.nextLine();
                    System.out.println("Enter address of company: ");
                    s1.address=sc.nextLine();
                    s1.displayLabel();
                    break;

            case 3: Ointment o1=new Ointment();
                    System.out.println("Enter name of ointment: ");
                    o1.Name=sc.nextLine();
                    System.out.println("Enter address of company: ");
                    o1.address=sc.nextLine();
                    o1.displayLabel();
                    break;

            default: System.out.println("Random number not within range 1 to 3\n");
                     break;

        }
    }
}


