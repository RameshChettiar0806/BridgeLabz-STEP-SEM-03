/*
 * Create Box class with pack() and unpack() methods. Create GiftBox that overrides these
methods but still uses parent functionality.
Hints:
● Call super.pack() in overridden method first
● Add gift-specific functionality after super call
 */

class Box {
    void pack() {
        System.out.println("Packing the box.");
    }

    void unpack() {
        System.out.println("Unpacking the box.");
    }
}

class GiftBox extends Box {
    @Override
    void pack() {
        super.pack();
        System.out.println("Adding gift wrapping to the box.");
    }

    @Override
    void unpack() {
        super.unpack();
        System.out.println("Removing gift wrapping from the box.");
    }
}

public class BoxGiftBox {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println("Box:");
        box.pack();
        box.unpack();

        System.out.println("\nGiftBox:");
        GiftBox giftBox = new GiftBox();
        giftBox.pack();
        giftBox.unpack();
    }
}