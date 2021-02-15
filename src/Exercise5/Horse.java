package Exercise5;

public class Horse extends Animal{

    public Horse(String name){
        super(name, 1500, 100, 3);
    }

    public Horse(String name, int runDistance, int swimDistance, float jumpHeight){
        super(name, runDistance,swimDistance, jumpHeight);
    }
}
