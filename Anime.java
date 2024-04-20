enum genre {
    shojo,
    thriller,
    sliceofLife,
    Action,
    Comedy,
    isekai
}

public class Anime extends Video {
    private genre genre;
    private double seasons;
    private double episodes;
    private String studio;

    public Anime(String title, genre genre, double seansons, double episodes, String studio, boolean isWatchable) {
        super(title, isWatchable);
        this.genre = genre;
        this.seasons = seansons;
        this.episodes = episodes;
        this.studio = studio;
    }

    public genre getGenre() {
        return genre;
    }

    public double getSeason() {
        return seasons;
    }

    public double getEpisode() {
        return episodes;
    }

    public String getStudio() {
        return studio;
    }

    @Override
    public void displayMetaData() {
        super.displayMetaData();
        System.out.println("Genre: " + getGenre());
        System.out.println("Seasons: " + getSeason() + ", Episodes: " + getEpisode());
        System.out.println("By studio " + getStudio());
        System.out.println("Is avbailable? " + getIsWatchable());
    }
}
