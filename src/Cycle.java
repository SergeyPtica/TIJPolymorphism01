/**
 * Created by Serg on 24.03.2017.
 */
public class Cycle {
    public void move() {
        System.out.println("Cycle.move()");
    }
}

class Unicycle extends Cycle {
    @Override public void move() {
        super.move();
        System.out.println("Unicycle.move()");
    }
}

class Bicycle extends Cycle {
    @Override public void move(){
        System.out.println("Bicycle.move()");
    }
}
