package exercise;

import java.util.Comparator;
import java.util.List;

// BEGIN
public class App {

    public static List<String> buildApartmentsList(List<Home> list, int n) {
        return list.stream().sorted(Comparator.comparing(x -> x.getArea())).limit(n).map(x -> x.toString()).toList();

    }
}
// END
