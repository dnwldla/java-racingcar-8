package racingcar;

public class CountParser {

    public int getCount(String input) {
        int count;

        try {
            count = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalStateException("숫자를 입력해야 합니다");
        }

        return count;

    }
}
