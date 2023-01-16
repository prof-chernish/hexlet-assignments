package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String body;
    private List<Tag> children;

    public String getBody() {
        return body;
    }

    public List<Tag> getChildren() {
        return children;
    }

    public PairedTag(String name, Map<String, String> attributes, String body, List<Tag> children) {
        super(name, attributes);
        this.body = body;
        this.children = children;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(getName());
        for (Map.Entry<String, String> pair: getAttributes().entrySet()) {
            sb.append(" ").append(pair.getKey()).append("=\"").append(pair.getValue()).append("\"");
        }
        sb.append(">").append(body);

        for (Tag tag: children) {
            sb.append(tag.toString());

        }
        sb.append("</").append(getName()).append(">");
        return sb.toString();
    }
}
// END
