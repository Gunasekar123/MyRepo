public class AnnonymusInner{
     public static void main(String []args){
        AnnonymusInner h=new AnnonymusInner();
       Thread t1=new Thread(){
           public void run(){
             System.out.println("This is t1 thread"); 
             h.multiply(5);
           }
       };
         Thread t2=new Thread(){
           public void run(){
             System.out.println("This is t2 thread");  
             h.multiply(6);
           }
       };
         Thread t3=new Thread(){
           public void run(){
             System.out.println("This is t3 thread");  
             h.multiply(7);
           }
       };
       t1.start();
       t2.start();
       t3.start();
     }
     synchronized void multiply(int num){
         for(int i=1;i<=10;i++){
             System.out.println(num*i);
         }
     }
}
