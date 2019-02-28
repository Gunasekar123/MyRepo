import java.util.*; 
class Student {
    String name;
    int age;
    String branch;
    Student(String name,int age,String branch){
        this.name=name;
        this.age=age;
        this.branch=branch;
    }}
class AgeComparator implements Comparator<Student>{  

    public int compare(Student s1,Student s2){
        return s1.age - s2.age;
    }}
    class NameComparator implements Comparator<Student>{
        public int compare(Student s1,Student s2){
            return s1.name.compareTo(s2.name);
        } }
        public class TestComparator {
            public static void main(String arr[]){
                List<Student> s=new ArrayList<Student>();
                s.add(new Student("guna",27,"ECE"));
                s.add(new Student("sekar",21,"EEE"));
                s.add(new Student("Anudeep",25,"CSE"));
                Collections.sort(s,new NameComparator());
                for(Student st: s){  
System.out.println(st.name+" "+st.age+" "+st.branch);  
} 
            Collections.sort(s,new AgeComparator());
                for(Student st: s){  
System.out.println(st.name+" "+st.age+" "+st.branch);  
}
 
            }
        }
