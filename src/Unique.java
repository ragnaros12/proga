import java.util.HashSet;

public class Unique {
    public static void main(String[] args) {
        int[] sequence = {1,2,3,4,4};

        HashSet<Integer> set = new HashSet<>();
        for (int num : sequence) {
            if (!set.add(num)) {
                System.out.println("Последовательность не уникальна");
                return;
            }
        }
        System.out.println("Последовательность уникальна");
    }
}
