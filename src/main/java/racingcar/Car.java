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

    public String move() {
        int number = numberGenerator.getNumber();

        if (number >= 4) {
            this.count++;
        }

        return getState();
    }

    public String getState() {
        return this.name + " : " + "-".repeat(this.count);
    }

}
