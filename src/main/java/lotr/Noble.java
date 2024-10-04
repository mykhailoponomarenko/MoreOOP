package lotr;

import java.util.Random;

public class Noble extends Character {
    public Noble(int num) {
        super(new Random().nextInt(11) + num, new Random().nextInt(11) + num, new NobleKick());
        // Random rand = new Random();
        // int a = rand.nextInt(11);
        // this.hp = num + a;
        // int b = rand.nextInt(11);
        // this.power = num + b;
    }

}
