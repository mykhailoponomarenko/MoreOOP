package lotr;

public class NobleKick extends KickStrategy{
    @Override
    public void kick(Character first, Character second) {
        second.hp -= first.power;

        
    }
}
