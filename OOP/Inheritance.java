package OOP;

class Person{
    String name;
    int age;
    String skinColor;
    String weight;

    void canSpeak(){
        System.out.println(this.name + " can speak");
    }

    void canWalk(){
        System.out.println(this.name + " can walk");
    }

    void canLaugh(){
        System.out.println(this.name + " can laugh");
    }
}

class Student extends Person{

}

class Teacher extends Person{

}

public class Inheritance {
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Naman";
        s1.age = 19;

        Teacher t1 = new Teacher();
        t1.name = "Prabhakar";
        t1.age = 34;

        s1.canSpeak();
        s1.canLaugh();
        s1.canWalk();

        t1.canSpeak();
        t1.canLaugh();
        t1.canWalk();
    }

}
