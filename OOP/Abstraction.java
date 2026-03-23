package OOP;

abstract class card { // this is an abstract class means it can have abstract methods which will
                      // define the signature of the methods (partial abstraction)...
    /*
     * But it does not means that we can't define the methods with default
     * implementation --> this here is calld partial abstraction
     * 
     * But when we define all methods without any implementationn then it's called
     * full abstraction... can be acheived via interface but before java 8 after
     * that we can provide implementation to any method using default keyword...
     * 
     */

    // if we want to achieve full abstraction then we need to define all the method
    // signatures as abstract with no implementation...
    abstract void greet();

    abstract void avoid();

    void noAbstract() {
        System.out.println("this is not an abstract method");
    }

}

class abstractImpl extends card {
    @Override
    void greet() {
        System.out.println("This is abstract method to greet.");
    }

    @Override
    void avoid() {
        System.out.println("This is abstract method to avoid");
    }

}

public class Abstraction {
    public static void main(String[] args) {
        // being an abstract class we can't create an object of it... so we use subclass
        abstractImpl abs = new abstractImpl();
        abs.greet();
        abs.avoid();
        abs.noAbstract();
    }

}
