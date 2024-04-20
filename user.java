// Define a class to represent a media item
class MediaItem {
    private String title;
    private String genre;
    private double duration;

    public MediaItem(String title, String genre, double duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    // Getters for title, genre, and duration
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getDuration() {
        return duration;
    }
}

// Main class for the streaming website management system
public class StreamingSite {
    public static void main(String[] args) {
        // Create media items
        MediaItem movie1 = new MediaItem("The Matrix", "Action", 120.0);
        MediaItem movie2 = new MediaItem("Inception", "Science Fiction", 150.0);
        MediaItem series1 = new MediaItem("Stranger Things", "Science Fiction", 45.0);
        MediaItem series2 = new MediaItem("Breaking Bad", "Drama", 60.0);

        // Create a subscriber
        Subscriber subscriber = new Subscriber("Alice");

        // Subscriber watches media
        subscriber.watchMedia("M1", movie1);
        subscriber.watchMedia("S1", series1);

        // Subscriber adds media to favorites
        subscriber.addFavorite("M1", movie1);
        subscriber.addFavorite("S1", series1);

        // Display watched media
        System.out.println(subscriber.getName() + "'s watched media:");
        for (MediaItem media : subscriber.watchedItems.values()) {
            System.out.println("- " + media.getTitle() + " (" + media.getGenre() + "), Duration: " + media.getDuration() + " minutes");
        }

        // Display favorite media
        System.out.println("\n" + subscriber.getName() + "'s favorite media:");
        for (MediaItem media : subscriber.favoriteItems.values()) {
            System.out.println("- " + media.getTitle() + " (" + media.getGenre() + "), Duration: " + media.getDuration() + " minutes");
        }

        // Subscriber removes media from favorites
        subscriber.removeFavorite("M1");

        // Display updated favorite media
        System.out.println("\n" + subscriber.getName() + "'s favorite media after removal:");
        for (MediaItem media : subscriber.favoriteItems.values()) {
            System.out.println("- " + media.getTitle() + " (" + media.getGenre() + "), Duration: " + media.getDuration() + " minutes");
        }
    }
}
