package racingcar.domain;

import racingcar.domain.generator.NumberGenerator;

public class Car implements Comparable<Car> {

    private final String name;
    private final NumberGenerator numberGenerator;
    private int count;

    public Car(String name, NumberGenerator numberGenerator) {
        this.name = name;
        this.numberGenerator = numberGenerator;
    }

    @Override
    public int compareTo(Car other) {
        return this.count - other.count;
    }

    public void move() {
        int number = numberGenerator.getNumber();

        if (number >= 4) {
            this.count++;
        }

    }

    public boolean isSameCount(Car other) {
        return this.count == other.count;
    }

    public String getName() {
        return this.name;
    }

    public String toResultString() {
        return this.name + " : " + "-".repeat(this.count)+ "\n";
    }


}
