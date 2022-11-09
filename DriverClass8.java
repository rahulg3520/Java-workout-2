import java.util.Scanner;

class IntWrapper
{
    int value;
    IntWrapper(int val)
    {
        this.value=val;
    }
}
public class DriverClass8 {

    static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;

        System.out.println("After swapping by value in swap function");
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);

    }

    static void swapRef(IntWrapper A,IntWrapper B)
    {
        IntWrapper Temp=new IntWrapper(A.value);
        A.value=B.value;
        B.value= Temp.value;

        System.out.println("After swapping by reference in swapRef function");
        System.out.println("Value of A: "+A.value);
        System.out.println("Value of B: "+B.value);
    }

    public static void main(String args[])
    {
        int a=0;
        int b=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter integer value for variable a: ");
        a= sc.nextInt();

        System.out.println("Enter integer value for variable b: ");
        b= sc.nextInt();

        System.out.println("Swapping by value ");

        System.out.println("Original value of a and b:");
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);

        DriverClass8.swap(a,b);

        System.out.println("After Swapping by value in main function ");
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);

        System.out.println("Swapping by reference ");

        IntWrapper A=new IntWrapper(30);
        IntWrapper B=new IntWrapper(40);

        System.out.println("Original value of A and B");
        System.out.println("Value of A: "+A.value);
        System.out.println("Value of B: "+B.value);

        DriverClass8.swapRef(A,B);

        System.out.println("After Swapping by reference in main function");
        System.out.println("Value of A: "+A.value);
        System.out.println("Value of B: "+B.value);

    }

}
