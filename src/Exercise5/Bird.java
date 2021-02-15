package Exercise5;

public class Bird extends Animal{

    public Bird(String name){
        super(name, 5, 0, 0.2f);
    }

    public Bird(String name, int runDistance, int swimDistance, float jumpHeight){
        super(name, runDistance,swimDistance, jumpHeight);
    }

    @Override
    public void swim (int distance){
        System.out.println(name + " не умеет плавать.");
    }
}
