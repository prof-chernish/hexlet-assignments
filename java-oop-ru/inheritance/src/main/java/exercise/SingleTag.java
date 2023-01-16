package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {

    public SingleTag(String name, Map<String, String> attributes) {
        super(name, attributes);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(getName());
        for (Map.Entry<String, String> pair: getAttributes().entrySet()) {
            sb.append(" ").append(pair.getKey()).append("=\"").append(pair.getValue()).append("\"");
        }
        sb.append(">");
        return sb.toString();
    }
}
// END
