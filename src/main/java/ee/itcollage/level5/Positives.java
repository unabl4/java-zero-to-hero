package ee.itcollage.level5;

import java.util.List;
import java.util.stream.Collectors;

public class Positives {

    //todo fix tests

    /**
     * returns only positives. zero is not positive
     * For example:
     * 1, -2, -3 => 1
     */
    static List<Integer> analyze(List<Integer> integers){
        return integers.stream().filter(i -> i > 0).collect(Collectors.toList());
    }
}
