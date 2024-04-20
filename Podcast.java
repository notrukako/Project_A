enum genre {
    dailyLife,
    Comedy,
    Commentary
}

public class Podcast extends Video {
    private String creatorName;
    private double duration;
    private genre genre;

    public Podcast(String title, String creatorName, double duration, genre genre, boolean isWatchable) {
        super(title, isWatchable);
        this.creatorName = creatorName;
        this.duration = duration;
        this.genre = genre;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public double getDuration() {
        return duration;
    }

    public genre getGenre() {
        return genre;
    }

    @Override
    public void displayMetaData() {
        super.displayMetaData();
        System.out.println("Genre: " + getGenre());
        System.out.println("duration: " + getDuration());
        System.out.println("By " + getCreatorName());
        System.out.println("Is avbailable? " + getIsWatchable());
    }
}
