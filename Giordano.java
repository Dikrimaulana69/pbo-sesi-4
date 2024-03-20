class Clothing {
    String brand;

    Clothing(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("This is a " + brand + " clothing.");
    }
}

class Shirt extends Clothing {
    String size;

    Shirt(String brand, String size) {
        super(brand);
        this.size = size;
    }

    @Override
    void display() {
        System.out.println("This is a " + size + " size shirt from " + brand);
    }
}

class Pants extends Clothing {
    int waistSize;

    Pants(String brand, int waistSize) {
        super(brand);
        this.waistSize = waistSize;
    }

    // Overloading display method
    void display(String color) {
        System.out.println("This is a " + brand + " pants with waist size " + waistSize + " in " + color);
    }
}

public class Giordano {
    public static void main(String[] args) {
        Shirt shirt = new Shirt("Giordano", "Medium");
        Pants pants = new Pants("Giordano", 32);

        shirt.display(); // overriding
        pants.display("Blue"); // overloading
}
}
