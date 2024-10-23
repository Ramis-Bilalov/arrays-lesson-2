import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задача 1

        System.out.println("Задача 1");

        int[] salaryArray = {50_000, 65_000, 100_000, 45_000};
        int sum = 0;

        for (int k : salaryArray) {
            sum += k;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Задача 2

        System.out.println("Задача 2");

        int[] spendingArray = {5_000, 15_000, 7_000, 11_000};
        int maxSpending = 0;

        for (int i = 0; i < spendingArray.length - 1; i++) {
            if (spendingArray[i] > maxSpending) {
                maxSpending = spendingArray[i];
            }
        }

        int minSpending = Integer.MAX_VALUE;
        for (int i = 0; i < spendingArray.length - 1; i++) {
            if (spendingArray[i] < minSpending) {
                minSpending = spendingArray[i];
            }
        }


        System.out.println("Максимальная трата за неделю " + maxSpending + " рублей");
        System.out.println("Минимальная трата за неделю " + minSpending + " рублей");


        // Задача 3

        System.out.println("Задача 3");

        sum = 0;
        double averageSpending;

        for (int j : spendingArray) {
            sum += j;
        }

        averageSpending = (double) sum / spendingArray.length;

        System.out.println("Средняя сумма трат за неделю составила " + averageSpending + "рублей");

        // Задача 4

        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char symbol;

        for (int i = 0; i < reverseFullName.length/2; i++) {
            symbol = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = symbol;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}