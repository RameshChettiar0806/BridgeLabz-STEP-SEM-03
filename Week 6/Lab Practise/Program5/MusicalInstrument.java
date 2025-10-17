/*
 * Create Instrument base class. Create Piano, Guitar, and Drum classes that all extend
Instrument.
Hints:
● Base class has common fields like name, material
● Each child adds specific fields (strings, keys, etc.)
● Test using array of Instrument references
 */

class Instrument {
    String name;
    String material;

    Instrument(String name, String material) {
        this.name = name;
        this.material = material;
    }

    void display() {
        System.out.println("Instrument: " + name + ", Material: " + material);
    }
}

class Piano extends Instrument {
    int keys;

    Piano(String name, String material, int keys) {
        super(name, material);
        this.keys = keys;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Piano has " + keys + " keys.");
    }
}

class Guitar extends Instrument {
    int strings;

    Guitar(String name, String material, int strings) {
        super(name, material);
        this.strings = strings;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Guitar has " + strings + " strings.");
    }
}

class Drum extends Instrument {
    int diameter;

    Drum(String name, String material, int diameter) {
        super(name, material);
        this.diameter = diameter;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Drum diameter: " + diameter + " cm.");
    }
}

public class MusicalInstrument {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Piano("Grand Piano", "Wood", 88);
        instruments[1] = new Guitar("Acoustic Guitar", "Maple", 6);
        instruments[2] = new Drum("Bass Drum", "Metal", 22);

        for (Instrument inst : instruments) {
            inst.display();
            System.out.println();
        }
    }
}