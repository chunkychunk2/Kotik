package main.java.animals;

import java.util.ArrayList;

public class Kotik {
    private final int METHODS = 5;
    private static int count;
    private String name;
    private String voice;
    private int satiety;

    public static void setCount(int count) {
        Kotik.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMETHODS() {
        return METHODS;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public int getWeight() {
        return weight;
    }

    private int weight;

    public Kotik() {
        count++;
    }

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    public boolean play() {
        if (getSatiety() > 0) {
            this.setSatiety(this.getSatiety() - 1);
            return true;
        }

        return false;
    }

    public boolean sleep() {
        if (getSatiety() > 0) {
            this.setSatiety(this.getSatiety() - 1);
            return true;
        }
        return false;
    }

    public boolean wash() {
        if (getSatiety() > 0) {
            this.setSatiety(this.getSatiety() - 1);
            return true;
        }

        return false;
    }

    public boolean walk() {
        if (getSatiety() > 0) {
            this.setSatiety(this.getSatiety() - 1);
            return true;
        }

        return false;
    }

    public boolean hunt() {
        if (getSatiety() > 0) {
            this.setSatiety(this.getSatiety() - 1);
            return true;
        }

        return false;
    }

    public void eat(int satietyCount) {
        this.setSatiety(this.getSatiety() + satietyCount);
    }

    public void eat(int satietyCount, String foodName) {
        this.setSatiety(this.getSatiety() + satietyCount);
    }

    public void eat() {

        eat(3, "fish");

    }

    public String[] liveAnotherDay() {
        ArrayList<String> catsDay = new ArrayList<String>();
        for (int i = 0; i < 24; i++) {
            String doingsForAnHour = i + " - ";
            int doSomething = (int) (Math.random() * METHODS) + 1;
            switch (doSomething) {
                case 1:
                    if (!play()) {
                        this.eat();
                        doingsForAnHour += "ел";
                    } else doingsForAnHour += "играл";
                    break;
                case 2:
                    if (!sleep()) {
                        this.eat();
                        doingsForAnHour += "ел";
                    } else doingsForAnHour += "спал";
                    break;
                case 3:
                    if (!wash()) {
                        this.eat();
                        doingsForAnHour += "ел";
                    } else
                        doingsForAnHour += "мылся";
                    break;
                case 4:
                    if (!walk()) {
                        this.eat();
                        doingsForAnHour += "ел";
                    } else
                        doingsForAnHour += "гулял";
                    break;
                case 5:
                    if (!hunt()) {
                        this.eat();
                        doingsForAnHour += "ел";
                    } else doingsForAnHour += "охотился";
                    break;
            }
            catsDay.add(doingsForAnHour);
        }

        String[] result = new String[catsDay.size()];
        for (int i = 0; i < catsDay.size(); i++) {
            result[i] = catsDay.get(i);
        }
        return result;
    }


}