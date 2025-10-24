package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class InputTest {

    @Test
    void inputWithInvalidCarLength() {
        CarFactory carFactory = new CarFactory("aaaaaa,bb,c");

        assertThatThrownBy(() -> carFactory.getCars())
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("자동차 이름은 최대 다섯글자입니다");
    }

    @Test
    void inputWithDuplicatedName(){
        CarFactory carFactory = new CarFactory("aa,aa,c");

        assertThatThrownBy(() -> carFactory.getCars())
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("자동차 이름은 중복일 수 없습니다");

    }

    @Test
    void inputWithValidCars() {
        CarFactory carFactory = new CarFactory("aaaaa,bb,c");

        assertThat(carFactory.getCars().size()).isEqualTo(3);
    }


    @Test
    void inputWithInvalidNumber() {
        CountParser parser = new CountParser("!");

        assertThatThrownBy(() -> parser.getCount())
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("숫자를 입력해야 합니다");


    }

    @Test
    void inputWithNegativeNumber() {
        CountParser parser = new CountParser("-1");

        assertThatThrownBy(() -> parser.getCount())
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("0 이하의 숫자를 입력할 수 없습니다");

    }


    @Test
    void inputWithValidNumber() {
        CountParser parser = new CountParser("1");

        assertThat(parser.getCount()).isEqualTo(1);
    }


}
