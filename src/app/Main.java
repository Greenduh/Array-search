package app;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[20];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(-100, 100);
        }

        System.out.println("Елементи масиву: " + Arrays.toString(numbers));

        int negativeSum = 0;
        for (int num : numbers) {
            if (num < 0) {
                negativeSum += num;
            }
        }
        System.out.println("Сума від'ємних чисел: " + negativeSum);

        int evenCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Кількість парних чисел: " + evenCount);

        int oddCount = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Кількість непарних чисел: " + oddCount);

        int min = 100;
        int minIndex = 0;
        int count = 0;
        for (int num : numbers) {
            if (num < min) {
                min = num;
                minIndex = count;
            }
            count++;
        }
        System.out.println("Найменший елемент: " + min + " (з індексом " + minIndex + ")");

        int max = -100;
        int maxIndex = 0;
        count = 0;
        for (int num : numbers) {
            if (num > max) {
                max = num;
                maxIndex = count;
            }
            count++;
        }
        System.out.println("Найбільший елемент: " + max + " (з індексом " + maxIndex + ")");

        int firstNegativeIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }
        if (firstNegativeIndex == -1) {
            System.out.println("Від'ємні числа не знайдено.");
        } else {
            int sum = 0;
            for (int i = firstNegativeIndex + 1; i < numbers.length; i++) {
                    sum += numbers[i];
                }
            double avgAfterNegative = (double) sum / (numbers.length - (firstNegativeIndex + 1));
            System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f", avgAfterNegative);
        }
    }
}