package racingcar;

import java.util.ArrayList;
import java.util.List;
import racingcar.generator.RandomGenerator;

public class CarFactory {

    private final String input;

    public CarFactory(String input) {
        this.input = input;
    }

    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();

        String[] names = validateInput(input);

        for (String name : names) {
            cars.add(new Car(name,new RandomGenerator()));
        }

        return cars;
    }

    private String[] validateInput(String input) {
        String[] names = input.split(",");

        for (String name : names) {
            if (name.length() >= 6) {
                throw new IllegalArgumentException("자동차 이름은 최대 다섯글자입니다");
            }
        }

        return names;
    }

}
