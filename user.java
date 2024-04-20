import java.util.*;

// Interface representing a user of the streaming website
interface WebsiteUser {
    String getName();
    String getType();
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
    public String getName() {
        return name;
    }

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
