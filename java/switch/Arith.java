import java.util.Scanner;
class Arith{
public static void main (String args[])
    {

            Scanner x=new Scanner(System.in);
            int num=x.nextInt();
            int a=x.nextInt();
            int b=x.nextInt();
          //  int num=x.nextInt();
            switch(num){
                    case(1):
                    System.out.println(a+b);
                    break;
                    case(2):
                    System.out.println(a-b);
                    break;
                    case(3):
                    System.out.println(a*b);
                    break;
                    case(4):
                    System.out.println(a/b);
                    break;
                  
                    default:
                    System.out.println("Enter a valid number");

             }

}

}
