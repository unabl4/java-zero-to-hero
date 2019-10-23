package ee.itcollage.level7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateRemover {

    //todo fix tests
    static ArrayList removeDuplicates(List<Integer> numbers){
        HashSet hs = new HashSet(numbers);
        return new ArrayList<>(hs);
    }
}
