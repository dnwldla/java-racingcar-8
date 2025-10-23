package racingcar;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    public List<Car> getCars(String input) {
        List<Car> cars=new ArrayList<>();

        String[] names=validateInput(input);

        for (String name:names){
            cars.add(new Car(name));
        }

        return cars;
    }

    private String[] validateInput(String input) {
        String[] names=input.split(",");

        for (String name:names){
            if (name.length()>=6){
                throw new IllegalStateException("자동차 이름은 최대 다섯글자입니다");
            }
        }

        return names;
    }

}
