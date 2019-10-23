package ee.itcollage.level5;

import java.util.List;
import java.util.stream.Collectors;

public class Squares {

    //todo fix tests

    /**
     * squares all numbers in a list, for example:
     * 1, 2, 3 => 1, 4, 9
     */
    public static List<Integer> square(List<Integer> integers){
        return integers.stream().map(i -> (int)Math.pow(i.doubleValue(), 2.0)).collect(Collectors.toList());
    }
}
