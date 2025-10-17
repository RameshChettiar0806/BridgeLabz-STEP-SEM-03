public class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Video is now playing.");
    }

    @Override
    public void pause() {
        System.out.println("Video is paused.");
    }
}