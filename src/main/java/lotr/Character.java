package lotr;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Character {
    int power;
    int hp;

    public void kick(Character c) {

    }

    public boolean isAlive() {
        return hp > 0;

    }

    @Override
    public String toString() {
        if(this instanceof Elf) {
        return "Elf{hp="+this.hp + ", power="+ this.power + "}";}
        if(this instanceof Hobbit) {
            return "Hobbit{hp="+this.hp + ", power="+ this.power + "}";}
        if(this instanceof King) {
            return "King{hp="+this.hp + ", power="+ this.power + "}";}
        else {
            return "Knight{hp="+this.hp + ", power="+ this.power + "}";}
    }


}
