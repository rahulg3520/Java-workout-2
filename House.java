import java.util.Scanner;

class Tile
{
    float edgeLength;
}


class Floor
{
    float length;
    float width;

    int totalTiles(Tile t)
    {
        float FloorArea = length*width;
        float TileArea = t.edgeLength*t.edgeLength;

        int TileNo = (int) (FloorArea / TileArea);

        return TileNo;
    }
}


public class House {

    public static void main(String args[])
    {
        Tile t1=new Tile();

        System.out.println("Enter edge length for tile: ");

        Scanner sc =new Scanner(System.in);

        t1.edgeLength= sc.nextFloat();

        Floor f1=new Floor();

        System.out.println("Enter the length of floor: ");
        f1.length=sc.nextFloat();

        System.out.println("Enter the width of floor: ");
        f1.width= sc.nextFloat();

        int TilesRequired=f1.totalTiles(t1);

        System.out.println("Number of tiles required to cover floor is "+TilesRequired);

    }
}





