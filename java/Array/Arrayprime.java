class Arrayprime    {//1
public static void main(String args[])
                    {//2
int a[]={3,2,17,6,13,8,10,15};
for(int i=0;i<a.length;i++)
   {//3
boolean flag=false;
for(int j=2;j<=a[i]/2;j++)
{//4
if(a[i]%j==0)
{//5
flag=true;
}//5
}//4
if(flag)
{//6
System.out.println(a[i]+"its not a prime number ");
}//6
else
{//7

System.out.println(a[i]+"prime number");
}//7

}//3
      
                           }//2
                           }//1
