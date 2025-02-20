
public class LiskovSubstitutionViolation {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        sparrow.eat();

        FlyingBird flyingBird = new Sparrow(); 
        flyingBird.fly();

        Bird ostrich = new Ostrich();
        ostrich.eat();
    }
}


class Bird {
    public void eat() {
        System.out.println("Bird is eating");
    }
}

interface FlyingBird {
    void fly();
}


class Sparrow extends Bird implements FlyingBird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}


class Ostrich extends Bird {

}
