import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Mary");
        set.add("Mercy");
        set.add("Jane");
        set.add("Mercy");
        set.add("Mary");
        set.add("MeSrcy");
        set.add("Sam");
        System.out.println(set);

        Iterator <String> itr= set.iterator();
        while(itr.hasNext()){
            String  str= itr.next();
            System.out.println(str);
        }
        if (set.contains("Mary")){
            System.out.println("Mary is present");
        }
    }
}
