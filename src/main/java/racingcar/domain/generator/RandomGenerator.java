package racingcar.domain.generator;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomGenerator implements NumberGenerator {

    @Override
    public int getNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
