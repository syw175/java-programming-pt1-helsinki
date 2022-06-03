public class Film {
    private String filmName;
    private int filmAgeRating;

    public Film(String name, int rating) {
        this.filmName = name;
        this.filmAgeRating = rating;
    }

    public String name() {
        return this.filmName;
    }

    public int ageRating() {
        return this.filmAgeRating;
    }
}
