
import java.util.ArrayList;

import javax.xml.crypto.dsig.SignatureMethod;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
       

        if(this.elements.isEmpty()) {
           return "The collection " + this.name + " is empty.";
        } else if(this.elements.size() == 1) {
           return "The collection " + this.name + " has 1 element:\n" + this.elements.get(0);
        } else {
            String output = "The collection " + this.name + " has " + this.elements.size() + " elements:\n"; 
            for(String element: this.elements) {
                output += element + "\n";
            }

            return output.trim();
        }

       

    }

    
    
}
