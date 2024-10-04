package lotr;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Elf extends Character {

    // public void toCry() {

    // }
    public Elf() {
        super(10, 10, new ElfKick());
    }
    
    public void setHp(int value) {
        if (value < 0) {
            this.hp = 0;
        } else {
            this.hp = value;
        }
    }

    // public void kick(Character c) {
    //     if (c.power < this.power) {
    //         c.hp = 0;
    //     } else {
    //         c.power -= 1;
    //     }
    // }
}
