package ee.itcollage.level11;

import java.util.List;
import java.util.stream.Collectors;

public class WordFilter {

    //todo fix tests

    public List<Word> getNouns(List<Word> words) {
        return words.stream().filter(w -> w.getWordType() == Word.WordType.NOUN).collect(Collectors.toList());
    }

    public Word getFirstVerb(List<Word> words) {
        return getFirstOfType(words, Word.WordType.VERB);   // re-use
    }

    public Word getFirstOfType(List<Word> words, Word.WordType type) {
        return words.stream().filter(w -> w.getWordType() == type).findFirst().get();
    }

    public List<Word> getAllNotNouns(List<Word> words) {
        return words.stream().filter(w -> w.getWordType() != Word.WordType.NOUN).collect(Collectors.toList());
    }

    public List<String> getNounStrings(List<Word> words){
        return getNouns(words).stream().map(Word::getWord).collect(Collectors.toList());
    }

    public String getFirstVerbString(List<Word> words) {
        return getFirstVerb(words).getWord();
    }

    public String getFirstStringOfType(List<Word> words, Word.WordType type) {
        return getFirstOfType(words, type).getWord();
    }
}
