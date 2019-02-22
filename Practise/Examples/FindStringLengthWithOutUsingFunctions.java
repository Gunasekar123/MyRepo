public class FindStringLengthWithOutUsingFunctions{

     public static void main(String []args){
        System.out.println("Hello World");
      String name="guna";
      String name1="myname";
      int j=0;
      try{
     for(int i=0;;i++){
        name.charAt(i);
        j++;
     }
      }
      catch(Exception e){
      }
       int p=0;
      for(char c1:name1.toCharArray()){
          p++;
      }
       System.out.println("String length " + j);
       System.out.println("String length1 is " + p);
     }
}
