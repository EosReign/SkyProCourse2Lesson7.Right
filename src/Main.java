import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("mashroom", "stone", "rock", "pickaxe", "mashroom", "ore", "dig it" ));
        for (int i = 0; i < words.size(); i++) {
            int countWord = 0;
            for (int I = i; I < words.size(); I++) {
                if (words.get(i) == words.get(I)) {
                    countWord++;
                }
            }
            if (countWord != 1) {
                System.out.println(words.get(i) + " : " + countWord);
            }
        }
    }

}