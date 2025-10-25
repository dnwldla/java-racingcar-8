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
        StringBuilder progress = new StringBuilder();

        while (count > 0) {
            progress.append(playRound()).append("\n");
            count--;
        }

        return progress.toString();


    }

    public String playRound() {
        StringBuilder sb = new StringBuilder();

        for (Car car : cars) {
            car.move();
            sb.append(car.toResultString());
        }

        return sb.toString();
    }

    public String findWinners() {
        Car winner = cars.stream().max(Car::compareTo).get();

        return cars.stream().filter(winner::isSameCount)
            .map(Car::getName)
            .collect(Collectors.joining(", "));

    }


}
