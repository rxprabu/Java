//this program is Print even elements present in odd index of any array

class Arrayodd{//1
public static void main(String args[])
{//2   i 0,1,2,3,4,5,6  i means index of an array
int a[]={5,8,2,3,6,6,7};  
//       1,2,3,4,5,6,7   elements of an array
for(int i=0;i<a.length;i++)
{//3
if(a[i]%2==0)
{//4
if(i%2==1)
{//5

System.out.println(a[i]);
}//5
}//4
}//3
/*{
int count = 0;
for(int j=1;j<a[i];j++){
if(a[i]%j ==0){
count=count+j;
}
}
if(count==a[i]){
System.out.println("perfect number"+a[i]);
}
else
{
System.out.println("not pn"+a[i]);
}
}
}//2
         }//1
