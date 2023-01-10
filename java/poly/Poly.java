 class Polyoverloading{

       void sum(){
        
            System.out.println("its works");
       }
       void sum(int a,int b){
   
            System.out.println("The result is"+(a-b));
       }
      void sum (int a,int b,int c){

           System.out.println("the result is"+a*b*c);
             }

      void sum(int a,int b,int c,int d){

       System.out.println("the result is"+a/b/c/d);

       }
       void sum(int a,int b,int c,int d,int e){
     System.out.println("The result is "+a%b%c%d%e);
     }
       public static void main(String args[])
{
            
              Polyoverloading done=new Polyoverloading();
                   done.sum();
                   done.sum(7,8);
                   done.sum(2,4,5);
                   done.sum(112,85,40,2);
                   done.sum(96,43,25,12,3);
       }
}
