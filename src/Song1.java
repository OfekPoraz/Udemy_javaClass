public class Song1 {

    private String title;
    private double duration;

    public Song1(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return (this.title + ": "+ this.duration);
    }
}
