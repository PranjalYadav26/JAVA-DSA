import java.util.*;
public class ClassRoom{
    public static void main(String[] args) {
        HashMap<String,Integer>hs=new HashMap<>();


        //INSERT -O(1)
        hs.put("India",100);
        hs.put("china",150);
        hs.put("us", 50);
        hs.put("indonesia", 6);
        hs.put("nepal", 5);
        System.out.println(hs);
        
        //GET -O(1)
       System.out.println( hs.get("India"));
       
        //containsKey
       System.out.println( hs.containsKey("us"));
        System.out.println(hs.containsKey("eminem"));
       
        //size
       System.out.println(hs.size());  


       //iteraTion of hashmaps
       Set<String> Keys=hs.keySet();
       System.out.println(Keys);

       for (String k : Keys) {
        System.out.println("key="+ k +",value=" + hs.get(k));
        
       }
System.out.println(Keys.size());
    }
}