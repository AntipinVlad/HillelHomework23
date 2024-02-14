import Models.*;

public class Homework23Program {
    public static void main(String[] args) {
        MusicStyles[] groups = new MusicStyles[]{ new PopMusic(), new RockMusic(), new ClassicMusic() };
        MusicPlayerService.playerManager(groups);
    }
}
