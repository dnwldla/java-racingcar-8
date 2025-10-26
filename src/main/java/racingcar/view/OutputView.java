package racingcar.view;

public class OutputView {

    public void printResultPrompt(){
        System.out.println("\n실행 결과");
    }

    public void printProgress(String progress){
        System.out.printf(progress);
    }

    public void printWinner(String winners){
        System.out.printf("최종 우승자 : %s",winners);

    }

}
