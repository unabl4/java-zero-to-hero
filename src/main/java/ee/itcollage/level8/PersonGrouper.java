package ee.itcollage.level8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class PersonGrouper {

    //todo fix tests
    public static Map<String, Person> groupPeopleByIdCode(List<Person> people){
        Map<String, List<Person>> h = people.stream().collect(groupingBy(Person::getIdCode));

        return h.entrySet().stream().collect(
            Collectors.toMap(
                Map.Entry::getKey,
                e -> e.getValue().get(0)
            )
        );
    }

}
