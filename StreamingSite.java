// Main class for the streaming website management system
public class StreamingSite {
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
