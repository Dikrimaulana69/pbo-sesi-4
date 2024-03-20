class Clothing {
    String brand;

    Clothing(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("This is a " + brand + " clothing.");
    }
}

class Jacket extends Clothing {
    String style;

    Jacket(String brand, String style) {
        super(brand);
        this.style = style;
    }

    @Override
    void display() {
        System.out.println("This is a " + style + " style jacket from " + brand);
    }
}

class Jeans extends Clothing {
    int length;

    Jeans(String brand, int length) {
        super(brand);
        this.length = length;
    }

    // Overloading display method
    void display(String color) {
        System.out.println("This is a " + brand + " jeans with length " + length + " in " + color);
    }
}

public class Rucas {
    public static void main(String[] args) {
        Jacket jacket = new Jacket("Rucas", "Leather");
        Jeans jeans = new Jeans("Rucas", 34);

        jacket.display(); // overriding
        jeans.display("Black"); // overloading
}
}
