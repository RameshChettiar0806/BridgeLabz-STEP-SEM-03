/*
 * Build a streaming service that handles different content types:
● Movies have ratings, duration, and subtitle options
● TV Series have seasons, episodes, and next episode suggestions
● Documentaries have educational tags and related content
Sometimes you need to access specific features based on what the user is actually
watching.
Hint: Go from general to specific - but be careful, not everything is what it seems!
*/

abstract class Content {
    String title;
    Content(String title) {
        this.title = title;
    }
    void displayInfo() {
        System.out.println("Title: " + title);
    }
}

class Movie extends Content {
    double rating;
    int duration; // in minutes
    boolean hasSubtitles;

    Movie(String title, double rating, int duration, boolean hasSubtitles) {
        super(title);
        this.rating = rating;
        this.duration = duration;
        this.hasSubtitles = hasSubtitles;
    }

    void showMovieFeatures() {
        System.out.println("Movie Rating: " + rating);
        System.out.println("Duration: " + duration + " mins");
        System.out.println("Subtitles Available: " + (hasSubtitles ? "Yes" : "No"));
    }
}

class TVSeries extends Content {
    int seasons;
    int episodes;
    String nextEpisodeSuggestion;

    TVSeries(String title, int seasons, int episodes, String nextEpisodeSuggestion) {
        super(title);
        this.seasons = seasons;
        this.episodes = episodes;
        this.nextEpisodeSuggestion = nextEpisodeSuggestion;
    }

    void showSeriesFeatures() {
        System.out.println("Seasons: " + seasons);
        System.out.println("Episodes: " + episodes);
        System.out.println("Next Episode: " + nextEpisodeSuggestion);
    }
}

class Documentary extends Content {
    String[] educationalTags;
    String relatedContent;

    Documentary(String title, String[] educationalTags, String relatedContent) {
        super(title);
        this.educationalTags = educationalTags;
        this.relatedContent = relatedContent;
    }

    void showDocumentaryFeatures() {
        System.out.print("Educational Tags: ");
        for (String tag : educationalTags) {
            System.out.print(tag + " ");
        }
        System.out.println();
        System.out.println("Related Content: " + relatedContent);
    }
}

public class MovieStreamingPlatform {
    public static void main(String[] args) {
        Content[] watchList = new Content[3];
        watchList[0] = new Movie("Inception", 8.8, 148, true);
        watchList[1] = new TVSeries("Stranger Things", 4, 34, "Season 4, Episode 2");
        watchList[2] = new Documentary("Planet Earth", new String[]{"Nature", "Wildlife"}, "Blue Planet");

        for (Content content : watchList) {
            content.displayInfo();
            // Access specific features based on actual type
            if (content instanceof Movie) {
                ((Movie) content).showMovieFeatures();
            } else if (content instanceof TVSeries) {
                ((TVSeries) content).showSeriesFeatures();
            } else if (content instanceof Documentary) {
                ((Documentary) content).showDocumentaryFeatures();
            }
            System.out.println("---------------------------");
        }
    }
}
