package lotr;

import java.util.Random;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Knight extends Character {

    public Knight() {
        Random rand = new Random();
        int a = rand.nextInt(11);
        this.hp = 2 + a;
        int b = rand.nextInt(11);
        this.power = 2 + b;

    }

    public void kick(Character c) {
        c.hp -= this.power;
    }

}
