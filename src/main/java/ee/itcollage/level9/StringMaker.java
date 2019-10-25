package ee.itcollage.level9;

public class StringMaker {

    //todo fix tests
    /**
     * Gives you a text containing of x times of string c.
     * @param s the string to repeat
     * @param x how many times you want the string
     */
    public static String make(String s, int x) {
        if(x <= 0) {
            return "";
        }
        return s.repeat(x);
    }

    /**
     * Gives you a text containing of x times of string c plus y times of string c.
     */
    public static String make(String s1, int x1, String s2, int x2) {
        return make(s1,x1) + make(s2, x2);
    }
}
