class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    // No need to override add method as it's inherited from Arithmetic class
}

public class Main {
    public static void main(String[] args) {
        // Create an Adder object
        Adder adder = new Adder();

        // Call the add method on Adder object
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());
        System.out.print(adder.add(42, 13) + " ");
        System.out.print(adder.add(13, 20));
    }
}