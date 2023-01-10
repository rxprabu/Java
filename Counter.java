public class Counter{
public static void main(String args[]){
    int b=20;
    int counter=0;
 for(int a=1;a<b;a=a+1)
{

  if(b%a==0){

counter=counter+a;
}
}
System.out.println(counter);
if( b==counter)
{
System.out.println("pn");
}
else
{
System.out.println("npn");

}
}
}



