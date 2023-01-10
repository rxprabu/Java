class Repeatarray{
public static void main(String args[])
              {
int a[]={10,5,6,10,7,8,2,1,4,5};
 for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]!=a[j])
{
System.out.println(a[j]);
break;
}
//break ;
}
}


                 }
               }
