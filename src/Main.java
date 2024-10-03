import static java.lang.System.out;

import java.util.Arrays;
import java.util.Scanner;
import java.math.*;
import java.util.Random;

public class Main {
    // Задание 1
    public static int sumLastNumbs(int x) {
        int lastDigit = x % 10;
        int secondLast = (x / 10) % 10;
        return Math.abs(lastDigit + secondLast);
    }

    public static boolean isPositive (int x) {
        return x >= 0;
    }

    public static boolean isUpperCase (char x) {
        return Character.isUpperCase(x);
    }

    public static boolean isDivisor (int a, int b) {
        return a % b == 0;
    }

    public static int lastNumbsSum (int a, int b) {
        return (a % 10 + b % 10) % 10;
    }

    // Задание 2
    public static double safeDiv (int x, int y) {
        if (y == 0) {
            return 0.0;
        }
        return (double) x / y;
    }

    public static String makeDecision(int x, int y) {
        if (x > y) {
            return x + " > " + y;
        } else if (x < y) {
            return x + " < " + y;
        } else {
            return x + " == " + y;
        }
    }

    public static boolean sum3 (int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    public static String age (int x) {
        int lastDigit = x % 10;
        int lastTwoDigits = x % 100;

        if (lastDigit == 1 && lastTwoDigits != 11) {
            return x + " год";
        } else if ((lastDigit == 2 || lastDigit == 3 || lastDigit == 4) && (lastTwoDigits < 12 || lastTwoDigits > 14)) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    public static void printDays() {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        x = x.toLowerCase();
        switch (x) {
            case "понедельник":
                out.println("Понедельник");
            case "вторник":
                out.println("Вторник");
            case "среда":
                out.println("Среда");
            case "четверг":
                out.println("Четверг");
            case "пятница":
                out.println("Пятница");
            case "суббота":
                out.println("Суббота");
            case "воскресенье":
                out.println("Воскресенье");
                break;
            default:
                out.println("Это не день недели");
                break;
        }
    }

    public static String reverseListNumbs (int x) {
        StringBuilder result = new StringBuilder();

        for (int i = x; i >= 0; i--) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    public static int pow (int x, int y) {
        if (y == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    public static boolean equalNum(int x) {
        int lastDigit = x % 10;

        while (x > 0) {
            if (x % 10 != lastDigit) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    public static void leftTriangle (int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void guessGame() {
        Random random = new Random();
        int guessedNumber = random.nextInt(10);

        int tries = 0;
        Scanner scanner = new Scanner(System.in);
        int userGuess = -1;
        while (userGuess != guessedNumber) {
            System.out.print("Введите число от 0 до 9: ");
            userGuess = scanner.nextInt();
            tries++;

            if (userGuess == guessedNumber) {
                out.println("Вы угадали число");
            } else {
                out.println("Вы не угадали число, попробуйте снова");
            }
        }
        out.println("Количество попыток: " + tries);
    }

    public static int findLast (int [] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int[] add (int [] arr, int x, int pos) {
        int [] newArr = new int[arr.length + 1];

        for (int i=0; i < pos; i++) {
            newArr[i] = arr [i];
        }
        newArr[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr [i];
        }
        return newArr;
    }

    public static void reverse (int [] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static int [] concat (int [] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }

    public static int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num >= 0) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num >= 0) {
                newArr[index++] = num;
            }
        }
        return newArr;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Задание 1 \nМетоды\n" + "-----------------");
        out.print("Задача 2 \nСумма цифр\nВведите x: ");
        int x = scanner.nextInt();
        out.println(sumLastNumbs(x) + "\n");

        out.print("Задача 4 \nОпределение положительного числа\nВведите x: ");
        x = scanner.nextInt();
        out.println(isPositive(x) + "\n");

        out.print("Задача 6 \nОпределение заглавной буквы\nВведите x: ");
        char character = scanner.next().charAt(0);
        out.println(isUpperCase(character) + "\n");

        out.print("Задача 8 \nОпределение целого деления\nВведите a: ");
        int a = scanner.nextInt();
        out.print("Введите b: ");
        int b = scanner.nextInt();
        out.println(isDivisor(a, b) + "\n");

        out.print("Задача 10 \nСумма разряда единиц\nВведите a: ");
        a = scanner.nextInt();
        out.print("Введите b: ");
        b = scanner.nextInt();
        out.println(lastNumbsSum(a, b) + "\n");

        out.println("Задание 2 \n" + "-----------------");
        out.print("Задача 2 \nБезопасное деление\nВведите x: ");
        x = scanner.nextInt();
        out.print("Введите y: ");
        int y = scanner.nextInt();
        out.println(safeDiv(x, y) + "\n");

        out.print("Задача 4 \nСтрока сравнения\nВведите x: ");
        x = scanner.nextInt();
        out.print("Введите y: ");
        y = scanner.nextInt();
        out.println(makeDecision(x, y) + "\n");

        out.print("Задача 6 \nТройная сумма\nВведите x: ");
        x = scanner.nextInt();
        out.print("Введите y: ");
        y = scanner.nextInt();
        out.print("Введите z: ");
        int z = scanner.nextInt();
        out.println(sum3(x, y, z) + "\n");

        out.print("Задача 8 \nОпределение года\nВведите x: ");
        x = scanner.nextInt();
        out.println(age(x) + "\n");

        out.print("Задача 10 \nДень недели\nВведите s: ");
        printDays();

        out.println("\nЗадание 3 \nЦиклы\n" + "-----------------");
        out.print("Задача 2 \nЧисла наоборот\nВведите x: ");
        x = scanner.nextInt();
        out.println(reverseListNumbs(x) + "\n");

        out.print("Задача 4 \nВозведение в степень\nВведите x: ");
        x = scanner.nextInt();
        out.print("Введите y: ");
        y = scanner.nextInt();
        out.println(pow(x, y) + "\n");

        out.print("Задача 6 \nОдинаковость\nВведите x: ");
        x = scanner.nextInt();
        out.println(equalNum(x) + "\n");

        out.print("Задача 8 \nЛевый треугольник\nВведите x: ");
        x = scanner.nextInt();
        leftTriangle(x);

        out.print("\nЗадача 10 \nУгадайка\n");
        guessGame();

        out.println("\nЗадание 4 \nМассивы\n" + "-----------------");
        int [] array = {5, 4, 7, 2, 1, 2};
        out.println(Arrays.toString(array) + "\n");

        out.print("Задача 2 \nПоиск последнего значения\nВведите x: ");
        x = scanner.nextInt();
        int index = findLast(array, x);
        out.println("Индекс последнего вхождения " + x + " в массив: " + index + "\n");

        out.print("Задача 4 \nДобавление в массив\nВведите x: ");
        x = scanner.nextInt();
        out.print("Введите pos: ");
        int pos = scanner.nextInt();
        int[] newArr = add(array, x, pos);
        out.println("Новый массив: " + Arrays.toString(newArr) + "\n");

        out.print("Задача 6 \nРеверс\n");
        reverse(array);
        out.println("Реверс массива: " + Arrays.toString(array) + "\n");

        out.print("Задача 8 \nОбъединение\n");
        int [] array1 = {1, 2, 3, 4};
        int [] array2 = {8, 6, 7};
        out.println("Массив 1: " + Arrays.toString(array1) + "\n Массив 2: " + Arrays.toString(array2));

        int[] result = concat(array1, array2);
        out.println("Объединенный массив: " + Arrays.toString(result) + "\n");

        out.print("Задача 10 \nУдалить негативный\n");
        array = new int[]{1, 2, -2, 3, -4, 7};
        out.println("Массив с негативными значениями: " + Arrays.toString(array));
        result = deleteNegative(array);
        out.println("Массив без негативных значений: " + Arrays.toString(result));
    }
}
