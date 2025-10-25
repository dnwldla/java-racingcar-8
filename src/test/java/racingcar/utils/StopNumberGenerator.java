package racingcar.utils;

import racingcar.domain.generator.NumberGenerator;

public class StopNumberGenerator implements NumberGenerator {

    @Override
    public int getNumber() {
        return 3;
    }
}
