public class Movie extends Video {
    private String yearReleased;
    private double duration;
    private String director;

    public Movie(String title, String director, String yearReleased, double duration, boolean isWatchable) {
        super(title, isWatchable);
        this.yearReleased = yearReleased;
        this.duration = duration;
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public double getDuration() {
        return duration;
    }

    public String getYearReleased() {
        return yearReleased;
    }

    @Override
    public void displayMetaData() {
        System.out.println("The " + getTitle() + " is Directed by " + getDirector() + ", was released in "
                + getYearReleased() + ", and is " + getDuration() + " minutes long!");
        System.out.println("is available? " + getIsWatchable());
    }
}
