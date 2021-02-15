package Exercise5;

import com.sun.source.util.SourcePositions;

import javax.swing.*;
import java.util.concurrent.Callable;

public class TheBremenTownMusicians {
    public static void main(String[] args){

        Horse horse1 = new Horse("Осёл");
        Dog dog1 = new Dog("Пёс");
        Cat cat1 = new Cat("Кот");
        Bird bird1 = new Bird("Петух");

        Horse horse2 = new Horse("Арабский скакун", 5000, 500, 7);
        Dog dog2 = new Dog("Пёс на стероидах", 1500, 150, 5);
        Cat cat2 = new Cat("Генномодифицированный кот", 1000, 0, 4);
        Bird bird2 = new Bird("Охотничий сокол", 100, 0, 1500);


        dog1.run(150);
        horse1.run(5000);
        cat1.jump(1);
        bird1.jump(0.8f);

        System.out.println("-------------");

        dog2.jump(5);
        horse2.swim(500);
        cat2.swim(40);
        bird2.jump(150);



    }
}
