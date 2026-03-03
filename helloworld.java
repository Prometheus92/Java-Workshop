import java.awt.Point;
import java.util.Date;

public class helloworld {
    public static void main(String[] args)
    // public - this method is accessible any where in the program
    {
        String intro = "Hello World1";
        byte age = 17;
        long viewCount = 3_123_456_789L;
        float price = 10.99f;
        char letter = 'A';
        boolean isEligible = true;
        Date now = new Date();
        System.out.println(now);
        Point point1 = new Point(1,2);


        System.out.println(intro);
    }
}
