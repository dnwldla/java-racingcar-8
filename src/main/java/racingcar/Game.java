package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class Game {

    private int count;
    private final List<Car> cars;

    public Game(int count, List<Car> cars) {
        this.count = count;
        this.cars = cars;
    }

    public String start() {
        StringBuilder result = new StringBuilder();

        while (count > 0) {
            StringBuilder sb = new StringBuilder();
            for (Car car : cars) {
                sb.append(car.move()).append("\n");
            }
            result.append(sb).append("\n");
            count--;
        }

        return result.toString();


    }

    public String getWinner() {
        Car winner = cars.stream().max(Car::compareTo).get();

        return cars.stream().filter(winner::isSameCount)
            .map(Car::getName)
            .collect(Collectors.joining(", "));

    }


}
