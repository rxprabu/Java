class Arrayrotate{
public static void main(String args[])
          {
int a[]={7,3,1,4,9};
int search=7;                        //      7,3,1,4,9
//int replace=3;                       //      3,1,4,9,7
for(int i=0+1;i<a.length;i++)
{

if(a[i]==search)
{
int temp=a[1];
a[1]=a[4];
a[4]=temp;
}

System.out.print(a[i]);

}
System.out.print(temp);

           }
               }
