package co.lessons;

import java.util.Arrays;

public class TypeDataArray {
    public static void main(String[] args) {
        // Type Data Array
        String[] name = {
            "Kusuma", "Jihan", "Eka", "Oness"
        };
        long[] salary = {
            2000000L, 32000000000L, 5000000L, 6000000
        };

        // Print Out to the Terminal
        // All of member Array
        System.out.println("\nName\t:" + Arrays.toString(name));
        System.out.println("\nSalary\t:" + Arrays.toString(salary));

        // Find the specific Data by Index
        System.out.println(salary[0]);

        // Multidimentional Array
        String[][] teammate = {
            {"Mochammad Jihan Isfalana", "Eka", "Tyo"},
            {"Alifasya Fahrizy Tamher", "Nisabya", "Eko"},
            {"Rafen", "Rasya", "Ira"}
        };

        // If we want to know the length of the array
        System.out.println(teammate.length);

        System.out.println(Arrays.deepToString(teammate)); // --> if the array is multidimention use this function helper

        System.out.println("\nMember of Team 1\t: " + Arrays.deepToString(teammate[0])); // If we want to search a specific member

        

    }

}
