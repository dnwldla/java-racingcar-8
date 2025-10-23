package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import racingcar.utils.MoveNumberGenerator;
import racingcar.utils.StopNumberGenerator;

public class RacingTest {

    @Test
    void stop() {
        Car car = new Car("ab", new StopNumberGenerator());

        car.move();

        assertThat(car.getState()).isEqualTo("ab" + " : ");
    }

    @Test
    void move() {
        Car car = new Car("ab", new MoveNumberGenerator());

        car.move();

        assertThat(car.getState()).isEqualTo("ab" + " : " + "-");
    }

}
