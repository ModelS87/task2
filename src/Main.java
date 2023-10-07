import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] array = {"green", "yellow", "green", "pink", "red", "pink"};
        StringBuilder stringBuilder = new StringBuilder();

        Set<String> uniqueElements = new HashSet<>(Arrays.asList(array));
        stringBuilder.append(uniqueElements.stream()
                .collect(Collectors.joining(" ")));

        System.out.println(stringBuilder);
    }
}