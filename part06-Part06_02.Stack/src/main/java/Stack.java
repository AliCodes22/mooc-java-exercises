import java.util.ArrayList;

public class Stack {
    private ArrayList<String> strings;

    public Stack() {
        this.strings = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.strings.isEmpty();
    }

    public void add(String value) {
        this.strings.add(0, value);
    }

    public ArrayList<String> values() {
        return this.strings;
    }

    public String take() {
        return this.strings.remove(0);
    }
}