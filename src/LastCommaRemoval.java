import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LastCommaRemoval {
    private static final int START = 10;
    private static final int END = 20;

    public static void main(String[] args){
        List<Integer> numbers = IntStream.rangeClosed(START, END)
                .boxed().collect(Collectors.toList());
        System.out.println(numbers);

        oldFashionedWay(numbers);
        modernWay(numbers);

    }

    private static void modernWay(List<Integer> numbers) {
        numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
    }

    private static void oldFashionedWay(List<Integer> numbers) { //accidental complexity
        StringBuilder joined = new StringBuilder();

        for (int i = 0; i < numbers.size(); i++){
            joined.append(numbers.get(i));
            if(i != numbers.size() - 1){
                joined.append(",");
            }
        }
        System.out.println(joined.toString());
    }
}
