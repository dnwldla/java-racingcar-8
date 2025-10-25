package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import racingcar.parser.CarParser;
import racingcar.parser.CountParser;

public class InputTest {

    @Test
    void inputWithInvalidCarLength() {
        CarParser carParser = new CarParser("aaaaaa,bb,c");

        assertThatThrownBy(() -> carParser.createCars())
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("자동차 이름은 최대 다섯글자입니다");
    }

    @Test
    void inputWithDuplicatedName(){
        CarParser carParser = new CarParser("aa,aa,c");

        assertThatThrownBy(() -> carParser.createCars())
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("자동차 이름은 중복일 수 없습니다");

    }

    @Test
    void inputWithValidCars() {
        CarParser carParser = new CarParser("aaaaa,bb,c");

        assertThat(carParser.createCars().size()).isEqualTo(3);
    }


    @Test
    void inputWithInvalidNumber() {
        CountParser parser = new CountParser("!");

        assertThatThrownBy(() -> parser.createCount())
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("숫자를 입력해야 합니다");


    }

    @Test
    void inputWithNegativeNumber() {
        CountParser parser = new CountParser("-1");

        assertThatThrownBy(() -> parser.createCount())
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("0 이하의 숫자를 입력할 수 없습니다");

    }


    @Test
    void inputWithValidNumber() {
        CountParser parser = new CountParser("1");

        assertThat(parser.createCount()).isEqualTo(1);
    }


}
