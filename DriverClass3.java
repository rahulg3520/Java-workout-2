class MathFunction
{
    void multiply(int a,int b)
    {
        int pro1=a*b;
        System.out.println("Product of integers "+a+" and "+b+" is "+pro1+"\n");
    }

    void multiply(float a,float b)
    {
        float pro2=a*b;
        System.out.println("Product of floating point numbers "+a+" and "+b+" is "+pro2+"\n");
    }

    void multiply(float a,int b)
    {
        float pro3=a*b;
        System.out.println("Product of float "+a+" and integer "+b+" is "+pro3);
    }
}

public class DriverClass3 {

    public static void main(String args[])
    {
        MathFunction m1=new MathFunction();
        m1.multiply(3,4);

        MathFunction m2=new MathFunction();
        m2.multiply(12.3f,3.5f);

        MathFunction m3=new MathFunction();
        m3.multiply(4.6f,7);
    }
}
