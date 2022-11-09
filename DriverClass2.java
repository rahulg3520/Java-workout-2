class OneBHK
{
    int roomArea;
    int hallArea;
    int price;

    static int counter1=0;

    OneBHK()
    {
        this.roomArea=9;
        this.hallArea=15;
        this.price=8000;

        counter1++;

    }

    OneBHK(int rA,int hA,int pr)
    {
        this.roomArea=rA;
        this.hallArea=hA;
        this.price=pr;

        counter1++;
    }

    void show()
    {
        System.out.println("Printing details of One BHK");

        System.out.println("Room area: "+ this.roomArea);
        System.out.println("Hall area: "+ this.hallArea);
        System.out.println("Price: "+ this.price);

    }


}

class TwoBHK extends OneBHK
{
    int room2Area;

    static int counter2=0;

    TwoBHK()
    {
        //this.roomArea=9;
        //this.hallArea=15;
        //this.price=8000;
        super();
        this.room2Area=10;

        counter2++;
    }

    TwoBHK(int rA,int hA,int pr,int r2A)
    {
        //this.roomArea=rA;
        //this.hallArea=hA;
        //this.price=pr;
        super(rA,hA,pr);
        this.room2Area=r2A;

        counter2++;
    }

    void show()
    {
        System.out.println("Printing details of Two BHK");

        System.out.println("Room 1 area: "+ this.roomArea);
        System.out.println("Hall area: "+ this.hallArea);
        System.out.println("Price: "+ this.price);
        System.out.println("Room 2 area: "+ this.room2Area);

    }
}

public class DriverClass2 {

    public static void main(String args[])
    {
        TwoBHK t1=new TwoBHK();
        t1.show();

        TwoBHK t2=new TwoBHK(20,50,15000,15);
        t2.show();

        TwoBHK t3=new TwoBHK(15,20,12000,14);
        t3.show();

        OneBHK O1=new OneBHK();
        O1.show();

        OneBHK O2=new OneBHK(10,30,13000);
        O2.show();

        System.out.println("Total number of One BHK flats: "+(OneBHK.counter1- TwoBHK.counter2));

        System.out.println("Total number of Tow BHK flats: "+ TwoBHK.counter2);

    }
}
