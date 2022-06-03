
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

    public boolean equals(Object book) {
        if (book == this) {
            return true;
        } if (!(book instanceof Book)){
            return false;
        }
        Book comparedBook = (Book) book ;
        return (comparedBook.getName().equals(this.getName()) &&
                comparedBook.getPublicationYear() == this.getPublicationYear());
    }
}
