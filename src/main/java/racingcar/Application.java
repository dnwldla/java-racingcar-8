package racingcar;

import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        GameRunner gameRunner=new GameRunner(new InputView(),new OutputView());

        gameRunner.run();
    }
}
