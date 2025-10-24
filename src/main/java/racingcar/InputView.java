package racingcar;


import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    private Game game;

    public void printInputGuide(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
        CarFactory carFactory=new CarFactory(readLine());

        System.out.println("시도할 회수는 몇회인가요?");
        CountParser countParser=new CountParser(readLine());

        this.game=new Game(countParser.getCount(),carFactory.getCars());

    }

    public void runGame(){
       String progress= game.getProgress();
       String winners=game.getWinner();

        System.out.printf("실행 결과\n%s",progress);
        System.out.printf("최종 우승자 : %s",winners);
    }

}
