public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public boolean equals(Object archive) {
        if (archive == this) {
            return true;
        }
        if (!(archive instanceof Archive)) {
            return false;
        }
        Archive compareArchive = (Archive) archive;
        return this.identifier.equals(compareArchive.identifier);
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
