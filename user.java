// Import statements
import java.util.Map;
import java.util.HashMap;

// Interface representing a website user
interface WebsiteUser {
    String getName();
    String getType();
}

// Interface representing a media item
interface MediaItem {
    String getTitle();
    String getGenre();
    double getDuration();
}

// Enum representing different types of media
enum MediaType {
    MOVIE,
    ANIME,
    PODCAST
}

// Define a class to represent a media item
class Media implements MediaItem {
    private String title;
    private String genre;
    private double duration;
    private MediaType type;

    public Media(String title, String genre, double duration, MediaType type) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.type = type;
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

    public MediaType getType() {
        return type;
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

    // Getter for watchedItems
    public Map<String, MediaItem> getWatchedItems() {
        return watchedItems;
    }

    // Getter for favoriteItems
    public Map<String, MediaItem> getFavoriteItems() {
        return favoriteItems;
    }
}

// Main class for the streaming website management system
public class user {
    public static void main(String[] args) {
        // Create media items
        MediaItem movie1 = new Media("The Matrix", "Action", 120.0, MediaType.MOVIE);
        MediaItem movie2 = new Media("Inception", "Science Fiction", 150.0, MediaType.MOVIE);
        MediaItem anime1 = new Media("Naruto", "Shounen", 25.0, MediaType.ANIME);
        MediaItem anime2 = new Media("Attack on Titan", "Action", 30.0, MediaType.ANIME);
        MediaItem podcast1 = new Media("The Joe Rogan Experience", "Talk", 60.0, MediaType.PODCAST);
        MediaItem podcast2 = new Media("The Tim Ferriss Show", "Self-Help", 45.0, MediaType.PODCAST);

        // Create a subscriber
        Subscriber subscriber = new Subscriber("Alice");

        // Subscriber watches media items
        subscriber.watchMedia("M1", movie1);
        subscriber.watchMedia("M2", movie2);
        subscriber.watchMedia("A1", anime1);
        subscriber.watchMedia("A2", anime2);
        subscriber.watchMedia("P1", podcast1);
        subscriber.watchMedia("P2", podcast2);

        // Subscriber adds media items to favorites
        subscriber.addFavorite("M1", movie1);
        subscriber.addFavorite("A1", anime1);
        subscriber.addFavorite("P1", podcast1);

        // Display watched media items
        System.out.println(subscriber.getName() + "'s watched media items:");
        subscriber.getWatchedItems().forEach((id, media) ->
                System.out.println("- " + media.getTitle() + " (" + media.getGenre() + ", " + media.getGenre() + "), Duration: " + media.getDuration() + " minutes"));

        // Display favorite media items
        System.out.println("\n" + subscriber.getName() + "'s favorite media items:");
        subscriber.getFavoriteItems().forEach((id, media) ->
                System.out.println("- " + media.getTitle() + " (" + media.getGenre() + ", " + media.getGenre() + "), Duration: " + media.getDuration() + " minutes"));

        // Subscriber removes media item from favorites
        subscriber.removeFavorite("M1");

        // Display updated favorite media items
        System.out.println("\n" + subscriber.getName() + "'s favorite media items after removal:");
        subscriber.getFavoriteItems().forEach((id, media) ->
                System.out.println("- " + media.getTitle() + " (" + media.getGenre() + ", " + media.getGenre() + "), Duration: " + media.getDuration() + " minutes"));
    }
}
