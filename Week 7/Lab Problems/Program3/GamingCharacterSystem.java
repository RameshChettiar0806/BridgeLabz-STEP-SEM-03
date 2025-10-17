/*
 * Create a battle system with different character types:
● Warriors attack with weapons and have high defense
● Mages cast spells and use mana
● Archers shoot arrows with long-range damage
Design it so the same "attack" command produces different results based on the
character type, even when stored in a mixed army array.
Hint: Same reference, different objects - let runtime decide the behavior!
*/

abstract class Character {
    String name;
    Character(String name) {
        this.name = name;
    }
    abstract void attack();
}

class Warrior extends Character {
    Warrior(String name) {
        super(name);
    }
    void attack() {
        System.out.println(name + " swings a sword with high defense!");
    }
}

class Mage extends Character {
    Mage(String name) {
        super(name);
    }
    void attack() {
        System.out.println(name + " casts a powerful spell using mana!");
    }
}

class Archer extends Character {
    Archer(String name) {
        super(name);
    }
    void attack() {
        System.out.println(name + " shoots a long-range arrow!");
    }
}

public class GamingCharacterSystem {
    public static void main(String[] args) {
        Character[] army = new Character[3];
        army[0] = new Warrior("Thor");
        army[1] = new Mage("Merlin");
        army[2] = new Archer("Robin");

        for (Character c : army) {
            c.attack();
        }
    }
}