 class Constructer{
// instance variable
 int rollno;
String  name;
double  percentage;
void print()
{
if(percentage > 70) {
System.out.println("good");
                   }
else if(percentage > 40){
System.out.println("average");
                  
}
else {
System.out.println("poor");
                  
}
}
// constructer
Constructer(int a,String b,double c)
  {
rollno=a;                     //  also we put like this also   this.rollno=a;
name=b;                                                     // this.name=b;
percentage=c;                                               // this.percentage=c; because this is a keyword of constructer
  }
public static void main(String args[])
       {
Constructer s1=new Constructer( 6,"jack",80.7);
Constructer s2=new Constructer( 7,"mani",50.8);
Constructer s3=new Constructer(8,"kumar",36);
s1.print();
s2.print();
s3.print();
       }
                        }
