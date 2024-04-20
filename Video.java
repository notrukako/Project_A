public class Video {
    private String title;
    protected boolean isWatchable;

    public Video(String title, boolean isWatchable) {
        this.title = title;
        this.isWatchable = true;
    }

    // Get the video's title
    public String getTitle() {
        return title;
    }

    // Get the video's availabilty status
    public boolean getIsWatchable() {
        return isWatchable;
    }

    // Check if the video is watchable or not
    public void checkVideo() {
        if (isWatchable = true) {
            System.out.println(title + " is available in your country!");
        } else {
            System.out.println(title + " isn't available in your country! Maybe check out some other videos :)");
        }
    }

    public void displayMetaData() {
        System.out.println("The " + title + ", is watchable?" + isWatchable);
    }
}
