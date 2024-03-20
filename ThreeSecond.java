class Clothing {
    String brand;

    Clothing(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("This is a " + brand + " clothing.");
    }
}

class TShirt extends Clothing {
    String design;

    TShirt(String brand, String design) {
        super(brand);
        this.design = design;
    }

    @Override
    void display() {
        System.out.println("This is a " + design + " design T-shirt from " + brand);
    }
}

class Shorts extends Clothing {
    String material;

    Shorts(String brand, String material) {
        super(brand);
        this.material = material;
    }

    // Overloading display method
    void display(int size) {
        System.out.println("This is a " + brand + " shorts made of " + material + ", Size: " + size);
    }
}

public class ThreeSecond {
    public static void main(String[] args) {
        TShirt tShirt = new TShirt("3Second", "Graphic");
        Shorts shorts = new Shorts("3Second", "Cotton");

        tShirt.display(); // overriding
        shorts.display(32); // overloading
}
}
