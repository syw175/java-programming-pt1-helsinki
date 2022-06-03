public class Books {
    private String name;
    private String pages;
    private String publication;

    public Books(String name, String pages, String publication) {
        this.name = name;
        this.pages = pages;
        this.publication = publication;
    }

    public String getName() { return this.name; }
    public String getPages() { return this.pages; }
    public String getPublication() { return this.publication; }

    @Override
    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.publication;
    }

}
