package ee.itcollage.level13;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PalindromeWordsTest {
    private PalindromeWords palindromeWords = new PalindromeWords();

    @Test
    public void noPalindromes() {
        List<String> words = Arrays.asList("foo", "bar", "baz");
        AnalysisResult result = palindromeWords.analyzePalindromes(words);

        assertTrue(result.getPalidromes().isEmpty());   // there are no palindromes
        assertEquals(result.getOthers(), words);
    }

    @Test
    public void allPalindromes() {
        List<String> words = Arrays.asList("aaa", "bbb", "ccc");
        AnalysisResult result = palindromeWords.analyzePalindromes(words);

        assertEquals(result.getPalidromes(), words);
        assertTrue(result.getOthers().isEmpty());
    }

    @Test
    public void mixedBagOfWords() {
        List<String> words = Arrays.asList("aaa", "bbb", "cat");
        AnalysisResult result = palindromeWords.analyzePalindromes(words);

        assertEquals(result.getPalidromes(), Arrays.asList("aaa", "bbb"));
        assertEquals(result.getOthers(), Collections.singletonList("cat"));
    }
}