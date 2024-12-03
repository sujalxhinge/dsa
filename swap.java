import java.util.Scanner;

public class swap 
{
    public static void main(String []args)
    {
      Scanner sc = new Scanner(System.in);
      int a = 100;
      int b = 200;

      System.out.println("The value before swap of a is "+a);
      System.out.println("The value before swap of b is "+b);
      int temp = a;
      a = b;
      b = temp;
      System.out.println("The value after swap of a is "+a);
      System.out.println("The value after swap of b is "+b);

    }
}
