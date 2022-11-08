package baseball;


import camp.nextstep.edu.missionutils.Randoms;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hitter {

    private List<Integer> number;

    public Hitter() {
        generateNumber();
    }

    public List<Integer> getNumber() {
        return number;
    }

    private void generateNumber() {
        Map<Integer, Integer> map = new HashMap<>();
        while (map.keySet().size() < 3) {
            int oneNum = Randoms.pickNumberInRange(1, 9);
            if (map.containsKey(oneNum)) {
                continue;
            }
            map.put(oneNum, 1);
        }
        number = List.copyOf(map.keySet());
    }

}
