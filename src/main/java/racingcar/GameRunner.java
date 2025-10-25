package racingcar;

import racingcar.domain.Game;
import racingcar.parser.CarParser;
import racingcar.parser.CountParser;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class GameRunner {

    private final InputView inputView;
    private final OutputView outputView;

    public GameRunner(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        String carNames = inputView.readRawCarNames();
        String count = inputView.readRawAttemptCount();

        Game game = prepareGame(carNames, count);

        String progress = game.playAllRounds();
        outputView.printProgress(progress);

        String winners = game.findWinners();
        outputView.printWinner(winners);

    }

    private Game prepareGame(String carNames, String count) {
        CarParser carParser = new CarParser(carNames);
        CountParser countParser = new CountParser(count);

        return new Game(countParser.createCount(), carParser.createCars());


    }

}
