import java.util.LinkedList;
import java.util.List;

public class CollectionSample {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();

        names.add("folahan");
        names.add("malik");
        System.out.println(names);
        boolean b =names.contains("folahan");
        System.out.println(b);

        List<String> list = List.of("malik");
        boolean b1 = names.containsAll(list);
        System.out.println(b1);
    }
}
