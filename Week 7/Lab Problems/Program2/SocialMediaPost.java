/*
 * Build a social media post system where different platforms display posts differently:
● Instagram posts show with hashtags and likes
● Twitter posts show with character count and retweets
● LinkedIn posts show with professional formatting and connections
All posts share common info (author, content, time) but display uniquely for each
platform.
Hint: Parent class defines the structure, child classes customize the display!
 */

class CommonInfo {
    protected String author;
    protected String content;
    protected int time;

    CommonInfo(String author, String content, int time) {
        this.author = author;
        this.content = content;
        this.time = time;
    }

    public void display() {
        System.out.println("=============COMMON INFO=============");
        System.out.println("Author --> " + author);
        System.out.println("Content --> " + content);
        System.out.println("Time --> " + time);
    }
}

class InstagramPost extends CommonInfo {
    private int hashtags;
    private int likes;

    InstagramPost(String author, String content, int time, int hashtags, int likes) {
        super(author, content, time);
        this.hashtags = hashtags;
        this.likes = likes;
    }

    public void showPosts() {
        display();
        System.out.println("Instagram Post --> " + hashtags + " hashtags and " + likes + " likes!");
    }
}

class TwitterPost extends CommonInfo {
    private int characterCount;
    private int retweets;

    TwitterPost(String author, String content, int time, int characterCount, int retweets) {
        super(author, content, time);
        this.characterCount = characterCount;
        this.retweets = retweets;
    }

    public void showPosts() {
        display();
        System.out.println("Twitter Post --> " + characterCount + " characters and " + retweets + " retweets!");
    }
}

class LinkedInPost extends CommonInfo {
    private int connections;

    LinkedInPost(String author, String content, int time, int connections) {
        super(author, content, time);
        this.connections = connections;
    }

    public void showPosts() {
        display();
        System.out.println("LinkedIn Post --> Professional formatting and " + connections + " connections!");
    }
}

public class SocialMediaPost {
    public static void main(String[] args) {
        InstagramPost ig = new InstagramPost("Ananya", "Enjoying the sunset!", 18, 5, 120);
        TwitterPost tw = new TwitterPost("Vijay", "Java is awesome!", 19, 50, 30);
        LinkedInPost ln = new LinkedInPost("Kareena", "Excited to join SRM!", 20, 500);

        ig.showPosts();
        System.out.println();
        tw.showPosts();
        System.out.println();
        ln.showPosts();
    }
}