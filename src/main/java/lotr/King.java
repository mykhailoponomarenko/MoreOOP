package lotr;

import java.util.Random;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class King extends Character {

    public King() {
        Random rand = new Random();
        int a = rand.nextInt(11);
        this.hp = 5 + a;
        int b = rand.nextInt(11);
        this.power = 5 + b;

    }

    public void kick(Character c) {
        c.hp -= this.power;
    }

}
