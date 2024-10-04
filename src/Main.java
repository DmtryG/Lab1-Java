import static java.lang.System.out;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.math.*;
import java.util.Random;

public class Main {
    private static int getIntInput(Scanner scanner, String message) {
        while (true) {
            out.print(message);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                out.println("Введите число");
                scanner.next();
            }
        }
    }

    private static char getCharInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.next().charAt(0);
            } catch (InputMismatchException e) {
                out.println("Введите символ.");
                scanner.next();
            }
        }
    }

    // Задание 1
    public int sumLastNumbs(int x) {
        int lastDigit = x % 10;
        int secondLast = (x / 10) % 10;
        return Math.abs(lastDigit + secondLast);
    }

    public boolean isPositive (int x) {
        return x >= 0;
    }

    public boolean isUpperCase (char x) {
        return Character.isUpperCase(x);
    }

    public boolean isDivisor (int a, int b) {
        if (b == 0) {
            return false;
        }
        return a % b == 0;
    }

    public int lastNumbsSum (int a, int b) {
        return Math.abs((a % 10 + b % 10) % 10);
    }

    // Задание 2
    public double safeDiv (int x, int y) {
        if (y == 0) {
            return 0.0;
        }
        return (double) x / y;
    }

    public String makeDecision(int x, int y) {
        if (x > y) {
            return x + " > " + y;
        } else if (x < y) {
            return x + " < " + y;
        } else {
            return x + " == " + y;
        }
    }

    public boolean sum3 (int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    public String age (int x) {
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

    public void printDays() {
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

    // Задание 3
    public String reverseListNumbs (int x) {
        StringBuilder result = new StringBuilder();

        for (int i = x; i >= 0; i--) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    public int pow (int x, int y) {
        if (y == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    public boolean equalNum(int x) {
        int lastDigit = x % 10;

        while (x > 0) {
            if (x % 10 != lastDigit) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    public void leftTriangle (int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void guessGame() {
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

    // Задание 4
    public int findLast (int [] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int[] add (int [] arr, int x, int pos) {
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

    public void reverse (int [] arr) {
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

    public int [] concat (int [] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }

    public int[] deleteNegative(int[] arr) {
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
        Main methods = new Main();

        out.println("Задание 1 \nМетоды\n" + "-----------------");

        int x = getIntInput(scanner, "Задача 2 \nСумма цифр\nВведите x: ");
        out.println(methods.sumLastNumbs(x) + "\n");

        x = getIntInput(scanner, "Задача 4 \nОпределение положительного числа\nВведите x: ");
        out.println(methods.isPositive(x) + "\n");

        out.print("Задача 6 \nОпределение заглавной буквы\nВведите x: ");
        char character = getCharInput(scanner);
        out.println(methods.isUpperCase(character) + "\n");

        int a = getIntInput(scanner, "Задача 8 \nОпределение целого деления\nВведите a: ");
        int b = getIntInput(scanner, "Введите b: ");
        out.println(methods.isDivisor(a, b) + "\n");

        a = getIntInput(scanner, "Задача 10 \nСумма разряда единиц\nВведите a: ");
        b = getIntInput(scanner, "Введите b: ");
        out.println(methods.lastNumbsSum(a, b) + "\n");

        out.println("Задание 2 \n" + "-----------------");

        x = getIntInput(scanner, "Задача 2 \nБезопасное деление\nВведите x: ");
        int y = getIntInput(scanner, "Введите y: ");
        out.println(methods.safeDiv(x, y) + "\n");

        x = getIntInput(scanner, "Задача 4 \nСтрока сравнения\nВведите x: ");
        y = getIntInput(scanner, "Введите y: ");
        out.println(methods.makeDecision(x, y) + "\n");

        x = getIntInput(scanner, "Задача 6 \nТройная сумма\nВведите x: ");
        y = getIntInput(scanner, "Введите y: ");
        int z = getIntInput(scanner, "Введите z: ");
        out.println(methods.sum3(x, y, z) + "\n");

        x = getIntInput(scanner, "Задача 8 \nОпределение года\nВведите x: ");
        out.println(methods.age(x) + "\n");

        out.print("Задача 10 \nДень недели\nВведите s: ");
        methods.printDays();

        out.println("\nЗадание 3 \nЦиклы\n" + "-----------------");

        x = getIntInput(scanner, "Задача 2 \nЧисла наоборот\nВведите x: ");
        out.println(methods.reverseListNumbs(x) + "\n");

        x = getIntInput(scanner, "Задача 4 \nВозведение в степень\nВведите x: ");
        y = getIntInput(scanner, "Введите y: ");
        out.println(methods.pow(x, y) + "\n");

        x = getIntInput(scanner, "Задача 6 \nОдинаковость\nВведите x: ");
        out.println(methods.equalNum(x) + "\n");

        x = getIntInput(scanner, "Задача 8 \nЛевый треугольник\nВведите x: ");
        methods.leftTriangle(x);

        out.print("\nЗадача 10 \nУгадайка\n");
        methods.guessGame();

        out.println("\nЗадание 4 \nМассивы\n" + "-----------------");

        int[] array = new int[6];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
        out.println(Arrays.toString(array) + "\n");

        x = getIntInput(scanner, "Задача 2 \nПоиск последнего значения\nВведите x: ");
        int index = methods.findLast(array, x);
        out.println("Индекс последнего вхождения " + x + " в массив: " + index + "\n");

        x = getIntInput(scanner, "Задача 4 \nДобавление в массив\nВведите x: ");
        int pos = getIntInput(scanner, "Введите pos: ");
        int[] newArr = methods.add(array, x, pos);
        out.println("Новый массив: " + Arrays.toString(newArr) + "\n");

        out.print("Задача 6 \nРеверс\n");
        methods.reverse(array);
        out.println("Реверс массива: " + Arrays.toString(array) + "\n");

        out.print("Задача 8 \nОбъединение\n");
        int[] array1 = new int[3];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(10) + 1;
        }
        int[] array2 = new int[4];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(10) + 1;
        }
        out.println("Массив 1: " + Arrays.toString(array1) + "\nМассив 2: " + Arrays.toString(array2));

        int[] result = methods.concat(array1, array2);
        out.println("Объединенный массив: " + Arrays.toString(result) + "\n");

        out.print("Задача 10 \nУдалить негативный\n");
        array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }

        out.println("Массив с негативными значениями: " + Arrays.toString(array));
        result = methods.deleteNegative(array);
        out.println("Массив без негативных значений: " + Arrays.toString(result));
    }
}
