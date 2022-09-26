import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        words.add("Mashroom");
        words.add("Mashroom");
        words.add("Mashroom2");
        words.add("Mashroom3");
        words.add("Mashroom2");
        System.out.println(words);
    }
}