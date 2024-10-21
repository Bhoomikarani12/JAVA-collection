import java.util.LinkedList;

class LL {

    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("Bhoomi");
        list.add("The");
        list.addLast("Great");
        list.addFirst("$$$");
        list.add("/-");

        System.out.println(list);

        System.out.println(list.size());

        for(int i=0;i<list.size(); i++){
            System.out.print(list.get(i)+" ->");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

    }
}
