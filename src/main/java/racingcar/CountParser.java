package racingcar;

public class CountParser {

    private final String input;

    public CountParser(String input) {
        this.input = input;
    }

    public int getCount() {
        int count;

        try {
            count = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalStateException("숫자를 입력해야 합니다");
        }

        return count;

    }
}
