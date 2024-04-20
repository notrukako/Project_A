import java.util.*;

// Interface representing a media item
interface MediaItem {
    String getTitle();
    String getGenre();
    double getDuration();
}

// Enum representing different types of media
enum MediaType {
    MOVIE,
    SERIES,
    DOCUMENTARY
}

// Define a class to represent a movie
class Movie implements MediaItem {
    private String title;
    private String genre;
    private double duration;

    public Movie(String title, String genre, double duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public double getDuration() {
        return duration;
    }
}

// Define a class to represent a subscriber of the streaming website
class Subscriber implements WebsiteUser {
    private String name;
    private Map<String, MediaItem> watchedItems;
    private Map<String, MediaItem> favoriteItems;

    public Subscriber(String name) {
        this.name = name;
        this.watchedItems = new HashMap<>();
        this.favoriteItems = new HashMap<>();
    }

    // Getters for name and type (implements from WebsiteUser interface)
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "Subscriber";
    }

    // Add media item to watched list
    public void watchMedia(String mediaId, MediaItem media) {
        watchedItems.put(mediaId, media);
    }

    // Add media item to favorites
    public void addFavorite(String mediaId, MediaItem media) {
        favoriteItems.put(mediaId, media);
    }

    // Remove media item from favorites
    public void removeFavorite(String mediaId) {
        favoriteItems.remove(mediaId);
    }
}

// Main class for the streaming website management system
public class StreamingSite {
    public static void main(String[] args) {
        // Create movies
        MediaItem movie1 = new Movie("The Matrix", "Action", 120.0);
        MediaItem movie2 = new Movie("Inception", "Science Fiction", 150.0);

        // Create a subscriber
        Subscriber subscriber = new Subscriber("Alice");

        // Subscriber watches movies
        subscriber.watchMedia("M1", movie1);
        subscriber.watchMedia("M2", movie2);

        // Subscriber adds movies to favorites
        subscriber.addFavorite("M1", movie1);
        subscriber.addFavorite("M2", movie2);

        // Display watched movies
        System.out.println(subscriber.getName() + "'s watched movies:");
        for (MediaItem media : subscriber.watchedItems.values()) {
            System.out.println("- " + media.getTitle() + " (" + media.getGenre() + "), Duration: " + media.getDuration() + " minutes");
        }

        // Display favorite movies
        System.out.println("\n" + subscriber.getName() + "'s favorite movies:");
        for (MediaItem media : subscriber.favoriteItems.values()) {
            System.out.println("- " + media.getTitle() + " (" + media.getGenre() + "), Duration: " + media.getDuration() + " minutes");
        }

        // Subscriber removes movie from favorites
        subscriber.removeFavorite("M1");

        // Display updated favorite movies
        System.out.println("\n" + subscriber.getName() + "'s favorite movies after removal:");
        for (MediaItem media : subscriber.favoriteItems.values()) {
            System.out.println("- " + media.getTitle() + " (" + media.getGenre() + "), Duration: " + media.getDuration() + " minutes");
        }
    }
}
