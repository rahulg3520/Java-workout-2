import java.util.Scanner;

public class LiveInstances {

    static int created=0;
    static int destroyed=0;

    LiveInstances()
    {
        created++;

        System.out.println("No of instances created till now: "+created);
    }

    public static void main(String args[])
    {
        LiveInstances a1=new LiveInstances();

        LiveInstances a2=new LiveInstances();

        a1=null;

        try {
            Runtime.getRuntime().gc();
        }
        catch (Throwable e) {
            System.out.println("Error message: "+e.toString());
        }
    }

    public void finalize() throws Throwable
    {
        System.out.println("Garbage collector called");
        System.out.println("Object collected as garbage: "+this);

        destroyed++;

        System.out.println("No of instances destroyed till now: "+destroyed);

        System.out.println("No of live instances: "+(created-destroyed));
    }
}
