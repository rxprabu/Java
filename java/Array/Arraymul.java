class Arraymul{
public static void main(String args[])
{
int a[]={6,9,4,5,1,15};
for(int i=0;i<a.length;i++)
{
for( int j=i+1;j<a.length;j++)
{
if(a[i]+a[j]==10)
{
System.out.println(a[i]+"       "+a[j]);

}

}
}

}




}
