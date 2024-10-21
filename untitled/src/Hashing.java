import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String aregs[]){
        HashSet<String> cars= new HashSet<String>();

        //insert
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        System.out.println(cars);

        //size
        System.out.println("Size:"+ cars.size());

        //print all el
        System.out.println(cars);

        //search-contains
        if(cars.contains("BMW")){
            System.out.println("Yes");
        }
        if(!cars.contains("mazada")){
            System.out.println("doesn not");
        }


        //delete

        cars.remove("BMW");
//        if(!cars.contains("BMW")){
//            System.out.println("does not have BMW");
//        }
        System.out.println(cars);

        //loop
        for (String i : cars) {
            System.out.println(i);
        }

        //Iterator
        Iterator it = cars.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        cars.clear();
        System.out.println(cars);

    }
}
