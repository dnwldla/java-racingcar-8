package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private final String name;
    private int count;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        int randomNum = Randoms.pickNumberInRange(1, 9);

        if (randomNum >= 4) {
            this.count++;
        }
    }

}
