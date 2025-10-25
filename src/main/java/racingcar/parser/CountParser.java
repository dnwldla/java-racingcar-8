package racingcar.parser;

public class CountParser {

    private final String input;

    public CountParser(String input) {
        this.input = input;
    }

    public int createCount() {
        int count;

        try {
            count = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자를 입력해야 합니다");
        }

        if (count <= 0) {
            throw new IllegalArgumentException("0 이하의 숫자를 입력할 수 없습니다");
        }

        return count;

    }
}
