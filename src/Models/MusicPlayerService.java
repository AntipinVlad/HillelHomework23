package Models;

public class MusicPlayerService {
    public static void playerManager(MusicStyles[] groups) {
        for (MusicStyles group : groups) {
            group.playMusic();
        }
    };
}
