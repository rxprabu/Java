class Arraysplit{
public static void main(String args[]){
int array[]={8,7,6,5,4,3,9};
int oddnum=0;
int evennum=0;
for(int i=0;i<array.length;i++){
if(array[i]%2==0){
evennum+=1;
}
else{
oddnum+=1;
}}
int j=0;int k=0;
int x[]=new int[evennum];
int y[]=new int[oddnum];
for(int i=0;i<array.length;i++){
if(array[i]%2==0){
x[j++]=array[i];
}
else
{
y[k++]=array[i];
}}
System.out.println("even elements");
for(int i=0;i<evennum;i++){
System.out.println(x[i]+"");
}
System.out.println("odd elements");
for(int i=0;i<oddnum;i++){
System.out.println(y[i]+"");
}
}
}


