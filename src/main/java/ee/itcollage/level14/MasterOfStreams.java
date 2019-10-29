package ee.itcollage.level14;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MasterOfStreams {

    private static List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


    public static List<Integer> convertMe() {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 1) {
                result.add(num * 2);
            }
        }
        return result;
    }

    public static List<Integer> converted() {
        return nums.stream().filter(n -> n % 2 == 1).map(n -> n * 2).collect(Collectors.toList());
    }

    public static Map<Integer, List<String>> mapWordsByLength(List<String> words)  {
        return words.stream().collect(Collectors.groupingBy(String::length));
    }
}
