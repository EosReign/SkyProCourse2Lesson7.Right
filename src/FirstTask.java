import java.util.ArrayList;
import java.util.List;

public class FirstTask {
    public static void firstTask(String[] args) {
        //First Task
        // Интересно, почему выводится 4 при таком методе?... непонел.
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                nums.remove(i);
            }
        }
        System.out.println(nums);
        //Второй метод
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 1) {
                System.out.print(nums.get(i) + " ");;
            }
        }
    }
}
//..
