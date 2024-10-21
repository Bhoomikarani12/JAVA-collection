import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main (String args[]){
        HashMap<String, Integer> map = new HashMap<>();

        // insertion
        map.put("India",120);
        map.put("China", 30);
        map.put("US",50);
        System.out.println(map);

        map.put("China", 130);
        System.out.println(map);

        //look-up

        if( map.containsKey("China")){
            System.out.println("key is present");
        }else{
            System.out.println("ket is not present");
        }

        System.out.println(map.get("China")); //key exists
        System.out.println(map.get("Indonesia"));// key doesnt exist

        //loop
        for(String i: map.keySet()){
            System.out.println(i);
        }

        //iterator

        for(Map.Entry<String, Integer>e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key+ " "+ map.get(key));
        }

        map.remove("India");
        System.out.println(map);





    }
}
