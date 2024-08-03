
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ringkasanBilang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();

        // Memasukkan bilangan ke dalam list
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // Menggabungkan bilangan yang berdekatan dan sama
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < numbers.size()) {
            int start = numbers.get(i);
            int end = start;

            while (i < numbers.size() - 1 && numbers.get(i).equals(numbers.get(i + 1))) {
                end = numbers.get(++i);
            }

            if (start == end) {
                result.add(String.valueOf(start));
            } else {
                result.add(start + "-" + end);
            }

            i++;
        }

        // Menampilkan hasil
        System.out.println(String.join(", ", result));
    }
}
