package lotr;

import java.util.Random;

public class Noble extends Character {
    public Noble(int num) {
super(new Random().nextInt(num, num + 11), new Random().nextInt(num, num + 11), new NobleKick());
        // Random rand = new Random();
        // int a = rand.nextInt(11);
        // this.hp = num + a;
        // int b = rand.nextInt(11);
        // this.power = num + b;
    }
    
}
