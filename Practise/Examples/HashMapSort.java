import java.util.*; 

class TestMap {
    public static HashMap<String ,Integer> sortByValues(HashMap<String ,Integer> hm){
        List<Map.Entry<String,Integer>> li=new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
        Collections.sort(li,new Comparator<Map.Entry<String,Integer>> () {
            public int compare(Map.Entry<String ,Integer> o1 ,
            Map.Entry<String,Integer> o2){
                return o1.getValue()-o2.getValue();
            }
            
        });
         System.out.println(li);
        HashMap<String,Integer> temp=new HashMap<String,Integer>();
        for(Map.Entry<String,Integer> map:li){
            temp.put(map.getKey(),map.getValue());
             System.out.println(map.getKey()+"  map "+map.getValue());
        }
        System.out.println(temp);
        return temp;
    }
}
public class TestComp {
    public static void main (String arr[]){
    HashMap<String ,Integer> map=new HashMap<String ,Integer>();
    map.put("Guna",4);
    map.put("Sekar",2);
    map.put("murali",1);
    Map<String,Integer> m=TestMap.sortByValues(map);
     System.out.println(m);
    for(Map.Entry<String,Integer> mp:m.entrySet()){
        System.out.println(mp.getKey()+ " and " +mp.getValue());
    }
}
}
            
