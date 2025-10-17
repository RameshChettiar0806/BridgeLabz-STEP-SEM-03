class SocialMediaPost {
    protected String content;
    protected String author;
    public SocialMediaPost(String content, String author) {
        this.content = content;
        this.author = author;
    }
    /*  TODO: Create 'share()' method that prints 
    "Sharing: [content] by [author]" */
    public void share() {
        System.out.println("Sharing: " + content + " by " + author);
    }
}

class InstagramPost extends SocialMediaPost {
    private int likes;

    public InstagramPost(String content, String author, int likes) {
        super(content, author);
        this.likes = likes;
    }
    /*TODO: Override 'share()' to print " Instagram: [content] 
    by @[author] - [likes] likes " */
    @Override
    public void share() {
        System.out.println("Instagram: " + content + " by @" + author + " - " + likes + " likes");
    }
}

class TwitterPost extends SocialMediaPost {
    private int retweets;
    public TwitterPost(String content, String author, int retweets) {
        super(content, author);
        this.retweets = retweets;
    }
    // TODO: Override 'share()' to print "Tweet: [content] by @[author] - [retweets] retweets "
    @Override
    public void share() {
        System.out.println("Tweet: " + content + " by @" + author + " - " + retweets + " retweets");
    }
}

public class SocialMediaDemo {
    public static void main(String[] args) {
        // TODO: Social Media Feed Simulation:
        // 1. Create array of SocialMediaPost references
        // 2. Add InstagramPost("Sunset vibes!", "john_doe", 245)
        // 3. Add TwitterPost("Java is awesome!", "code_ninja", 89)
        // 4. Add regular SocialMediaPost("Hello world!", "beginner")
        // 5. Loop through and call share() on each - observe different behaviors!

        SocialMediaPost[] obj = new SocialMediaPost[3];
        obj[0] = new InstagramPost("Sunset vibes!", "john_doe", 245);
        obj[1] = new TwitterPost("Java is awesome!", "code_ninja", 89);
        obj[2] = new SocialMediaPost("Hello world!", "beginner");

        for (int i = 0; i < 3; i++) {
            obj[i].share();
        }
    }
}
