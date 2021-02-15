package Exercise5;

public class Dog extends Animal{

    public Dog(String name){
        super(name, 500, 10, 0.5f);
    }

    public Dog(String name, int runDistance, int swimDistance, float jumpHeight){
        super(name, runDistance,swimDistance, jumpHeight);
    }

}
