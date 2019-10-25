package ee.itcollage.level10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cardgame {

    public static List<Card> buildDeck() {
        Rank[] allRanks = Rank.values();
        Suit[] allSuits = Suit.values();

        return Arrays.stream(allRanks).flatMap(
            r -> Arrays.stream(allSuits).map(s -> new Card(r,s))
        ).collect(Collectors.toList());
    }

    private static List<Card> shuffle(List<Card> cards) {
        Collections.shuffle(cards);
        return cards;
    }

    public static void main(String[] args) {
        List<Card> cards = Cardgame.buildDeck();
        shuffle(cards);
        List<Card> newCards = cards.stream().limit(5).collect(Collectors.toList());
        System.out.println(newCards);
    }
}
