package racingcar;

import racingcar.generator.NumberGenerator;

public class Car {

    private final String name;
    private final NumberGenerator numberGenerator;
    private int count;


    public Car(String name, NumberGenerator numberGenerator) {
        this.name = name;
        this.numberGenerator = numberGenerator;
    }

    public void move() {
        int number = numberGenerator.getNumber();

        if (number >= 4) {
            this.count++;
        }
    }

    public String getState() {
        return this.name + " : " + "-".repeat(this.count);
    }

}
