package Objects;

public class Genre {

    private String genreName;
    private long id;

    public Genre(String genreName, long id) {
        this.genreName = genreName;
        this.id = id;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
