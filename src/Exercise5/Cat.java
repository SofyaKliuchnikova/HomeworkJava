package Exercise5;

public class Cat extends Animal{

    public Cat(String name){
        super(name, 200, 0, 2);
    }

    public Cat(String name, int runDistance, int swimDistance, float jumpHeight){
        super(name, runDistance,swimDistance, jumpHeight);
    }

    @Override
    public void swim (int distance){
        System.out.println(name + " не умеет плавать.");
    }
}
