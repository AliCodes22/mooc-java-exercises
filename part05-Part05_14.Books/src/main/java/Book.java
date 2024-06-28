
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override 
    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }

        if(!(compared instanceof Book)) {
            return false;
        }
        
        Book otherBook = (Book) compared;

        if(otherBook.name.equals(this.name) && otherBook.publicationYear == this.publicationYear) {
            return true;
        }

        return false;
    }

}
