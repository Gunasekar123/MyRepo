//Static method can not over ride
//static methods we can over load

//If method is identified at the time of run time then it is called method over riding
////If method is identified at the time of compile time then it is called method over riding




public class Parent{

public String  m1(int a,String b){

return null;
}

public int m1(String a,int b){

return 0;
}



}

class child extends Parent {

public int m1(String a,int b){

return 0;
}



}
