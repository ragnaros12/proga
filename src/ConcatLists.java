import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);
        List<Integer> result = new ArrayList<>();

        int i = 0;
        while (i < list1.size() && i < list2.size()) {
            result.add(list1.get(i));
            result.add(list2.get(i));
            i++;
        }

        result.addAll(list1.subList(i, list1.size()));
        result.addAll(list2.subList(i, list2.size()));

        System.out.println(result);
    }

}
