import main.java.animals.Kotik;

import java.util.Arrays;

public class Application {

    static boolean compareVoice(Kotik cat1, Kotik cat2){
        return cat1.getVoice().equals(cat2.getVoice());
    }
    public static void main(String[] args) {
        Kotik Tom = new Kotik();
        Tom.setName("Tom");
        Tom.setVoice("Meow-meow");
        Tom.setSatiety(5);
        Tom.setWeight(8);
        Kotik Garfild = new Kotik("Garfild", "i want lasagna", 2, 12);
        System.out.println(Arrays.toString(Tom.liveAnotherDay()));
        System.out.println(Tom.getName());
        System.out.println(Garfild.getWeight());
        System.out.println(compareVoice(Tom,Garfild));
        System.out.println(Garfild.getSatiety());
        Garfild.eat();
        System.out.println(Garfild.getSatiety());
        System.out.println(Kotik.getCount());

    }
}
