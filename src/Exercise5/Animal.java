package Exercise5;

public abstract class Animal {
    String name;
    int runDistance;
    int swimDistance;
    float jumpHeight;

    public Animal(String name, int runDistance, int swimDistance, float jumpHeight){
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.jumpHeight = jumpHeight;
    }

    public void run (int distance){
        if (distance <= runDistance){
            System.out.println(name + " пробежал успешно!");
        }
        else {
            System.out.println(name + " не смог пробежать так далеко =(");
        }

    }

    public void swim (int distance){
        if (distance <= swimDistance){
            System.out.println(name + " проплыл успешно!");
        }
        else {
            System.out.println(name + " не смог проплыть так далеко =(");
        }

    }

    public void jump (float distance){
        if (distance <= jumpHeight){
            System.out.println(name + " перепрыгнул препятствие!");
        }
        else {
            System.out.println(name + " не смог прыгнуть так высоко =(");
        }

    }

}
