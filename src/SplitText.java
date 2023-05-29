import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SplitText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String[] words = scanner.nextLine().split("[\\s+.,]");
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        String mostFrequentWord = "";
        int mostFrequentWordCount = 0;
        String longestWord = "";

        for (String word : words) {
            int count = frequencyMap.getOrDefault(word, 0) + 1;
            frequencyMap.put(word, count);
            if (count > mostFrequentWordCount) {
                mostFrequentWord = word;
                mostFrequentWordCount = count;
            }
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Наиболее часто встречающееся слово: " + mostFrequentWord);
        System.out.println("Самое длинное слово: " + longestWord);
    }

}
