//this program is Print odd elements present in even index of any array

class Arrayeven{//1
public static void main(String args[])
{//2   i 0,1,2,3,4,5   i means index of an array
int a[]={5,7,2,3,5,8};           //same time index value is 0 means thats not consider  annaikeah sonnappudi 0 even nuu illa odd illanu athunalayu athu eduthukathu
       //1,2,3,4,5,6
for(int i=1;i<a.length;i++)
{//3
if(a[i]%2==1) 
// filter to find odd elements 
{//4
if(i%2==0) 
// filter to find even index
{//5
System.out.println(a[i]);
}//4

}//5

}//3


}//2
         }//1
