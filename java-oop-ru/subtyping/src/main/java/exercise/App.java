package exercise;

import java.util.Map;

// BEGIN
public class App {

    public static void swapKeyValue(KeyValueStorage db) {
        Map<String, String> map = db.toMap();

        for (Map.Entry<String, String> pair: map.entrySet()) {
            db.unset(pair.getKey());
            db.set(pair.getValue(), pair.getKey());
        }
    }
}
// END
