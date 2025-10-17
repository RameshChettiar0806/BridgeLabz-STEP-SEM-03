public class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Music is now playing.");
    }

    @Override
    public void pause() {
        System.out.println("Music is paused.");
    }
}