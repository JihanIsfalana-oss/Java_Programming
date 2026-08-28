package co.course;
import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        // For Each
        char star = '*';
        String[][] name = {
            {"Mochammad Jihan Isfalana", "Alifasya", "Syammil"},
            {"Nisrina", "Fabian", "Arsanti"},
            {"Ade Putri", "Eko", "Muhaemin"}
        };

        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print(" " + star);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j <= i; ++j) {
                for (int k = 10; j < k; --k) {
                    System.out.print(" " + star);
                }
                System.out.println();
            }
            System.out.println();
        }

        for (int i = 0; i < name.length; ++i) {
                System.out.println(Arrays.deepToString(name[i]));
        }

        for (var value : name) {
            System.out.println(Arrays.deepToString(value));
        }
    }
}
