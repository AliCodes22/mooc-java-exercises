import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if(this.jokes.isEmpty()) {
            return "Jokes are in short supply";
        }

        Random random = new Random();
        int randomIndex = random.nextInt(this.jokes.size());

        return jokes.get(randomIndex);
       
    } 

    public void printJokes() {
        for(String joke: this.jokes) {
            System.out.println(joke);
        }
    }

    public boolean isEmpty() {
        return this.jokes.isEmpty();
    }

    public int getJokesListLength() {
        return this.jokes.size();
    }

    public String getJoke(int index) {
        return this.jokes.get(index);
    }
}