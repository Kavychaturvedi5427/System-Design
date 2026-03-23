package OOP;

// Dynamic Polymorphism
abstract class Car {
    abstract void engine();

    abstract void accelarate();
}

class manualCar extends Car {
    @Override
    void engine() {
        System.out.println("I'm the engine of manual car.");
    }

    @Override
    void accelarate() {
        System.out.println("Accelarator of manual car.");
    }

}

class electricCar extends Car {
    @Override
    void engine() {
        System.out.println("Motor of electric car.");
    }

    @Override
    void accelarate() {
        System.out.println("Accelarator of electric car.");
    }
}


// Static Polymorphism
class Add{
    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        manualCar mc = new manualCar();
        electricCar ec = new electricCar();

        mc.engine();
        mc.accelarate();

        ec.engine();
        ec.accelarate();

        Add a = new Add();
        System.out.println(a.add(3, 3));
        System.out.println(a.add(1, 2 , 3));

    }
}
