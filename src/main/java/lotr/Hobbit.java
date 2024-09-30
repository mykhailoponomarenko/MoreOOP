package lotr;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Hobbit extends Character {

    public Hobbit() {
        this.power = 0;
        this.hp = 3;
    }
    public void setHp(int value) {
        if (value < 0) {
            this.hp = 0;
        }
        else {
            this.hp = value;
        }
    }

    public void toCry() {

    }

    public void kick(Character c) {
        toCry();
    }

}
