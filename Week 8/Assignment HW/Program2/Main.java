public class Main {
    public static void main(String[] args) {
        // Demonstrate polymorphism with a Playable reference for a MusicPlayer object
        Playable player1 = new MusicPlayer();
        System.out.println("--- Using MusicPlayer ---");
        player1.play();
        player1.pause();
        System.out.println(); // Newline for readability

        // Reuse the same Playable reference for a VideoPlayer object
        Playable player2 = new VideoPlayer();
        System.out.println("--- Using VideoPlayer ---");
        player2.play();
        player2.pause();
    }
}