import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class lab1 {

    private Scanner sc;

    // ==================== ЗАДАНИЕ 1 ====================

    public int sumLastNums(int x) {
        return (x % 10) + ((x / 10) % 10);
    }

    public boolean isPositive(int x) {
        return x > 0;
    }

    public boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    public boolean isDivisor(int a, int b) {
        if (a == 0 || b == 0) return false;
        return (a % b == 0) || (b % a == 0);
    }

    public int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }

    // ==================== ЗАДАНИЕ 2 ====================

    public double safeDiv(int x, int y) {
        if (y == 0) return 0;
        return (double) x / y;
    }

    public String makeDecision(int x, int y) {
        if (x < y) return x + " < " + y;
        if (x > y) return x + " > " + y;
        return x + " == " + y;
    }

    public boolean sum3(int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    public String age(int x) {
        int last = Math.abs(x) % 10;
        int lastTwo = Math.abs(x) % 100;

        if (lastTwo >= 11 && lastTwo <= 14) return x + " лет";
        if (last == 1) return x + " год";
        if (last >= 2 && last <= 4) return x + " года";
        return x + " лет";
    }

    public void printDays(String day) {
    if (day == null) {
        System.out.println("это не день недели");
        return;
    }

    day = day.trim().toLowerCase();

    switch (day) {
        case "понедельник":
            System.out.println("понедельник");
        case "вторник":
            System.out.println("вторник");
        case "среда":
            System.out.println("среда");
        case "четверг":
            System.out.println("четверг");
        case "пятница":
            System.out.println("пятница");
        case "суббота":
            System.out.println("суббота");
        case "воскресенье":
            System.out.println("воскресенье");
            break;
        default:
            System.out.println("это не день недели");
    }
 } 

    // ==================== ЗАДАНИЕ 3 ====================

    public String reverseListNums(int x) {
        StringBuilder sb = new StringBuilder();
        for (int i = x; i >= 0; i--) {
            sb.append(i);
            if (i > 0) sb.append(" ");
        }
        return sb.toString();
    }

    public int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    public boolean equalNum(int x) {
        x = Math.abs(x);
        if (x < 10) return true;

        int digit = x % 10;
        while (x > 0) {
            if (x % 10 != digit) return false;
            x /= 10;
        }
        return true;
    }

    public void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void guessGame() {
        Random random = new Random();
        int secret = random.nextInt(10);
        int attempts = 0;

        while (true) {
            System.out.print("Введите число от 0 до 9: ");
            try {
                String line = sc.nextLine().trim();
                if (line.isEmpty()) {
                    System.out.println("Ошибка: нужно целое число!");
                    continue;
                }

                int guess = Integer.parseInt(line);
                attempts++;

                if (guess < 0 || guess > 9) {
                    System.out.println("Число должно быть от 0 до 9!");
                    continue;
                }

                if (guess == secret) {
                    System.out.println("Вы угадали!");
                    System.out.println("Вы отгадали число за " + attempts + " попытки");
                    break;
                } else {
                    System.out.println("Вы не угадали, введите число от 0 до 9:");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: нужно целое число!");
            } catch (NoSuchElementException e) {
                System.out.println("Ошибка ввода. Программа завершена.");
                System.exit(1);
            }
        }
    }

    // ==================== ЗАДАНИЕ 4 ====================

    public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public int[] add(int[] arr, int x, int pos) {
        if (pos < 0 || pos > arr.length) return arr.clone();

        int[] result = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        result[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }
        return result;
    }

    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }

    public int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int value : arr) {
            if (value >= 0) count++;
        }

        int[] result = new int[count];
        int index = 0;
        for (int value : arr) {
            if (value >= 0) result[index++] = value;
        }
        return result;
    }

    // ==================== ВСПОМОГАТЕЛЬНЫЕ МЕТОДЫ ====================

    private int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                String line = sc.nextLine().trim();
                if (line.isEmpty()) {
                    System.out.println("Ошибка: введите целое число!");
                    continue;
                }
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число!");
            } catch (NoSuchElementException e) {
                System.out.println("Ошибка ввода. Программа завершена.");
                System.exit(1);
                return 0;
            }
        }
    }

    private char readChar(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                String line = sc.nextLine().trim();
                if (line.isEmpty()) {
                    System.out.println("Ошибка: введите один символ!");
                    continue;
                }
                return line.charAt(0);
            } catch (NoSuchElementException e) {
                System.out.println("Ошибка ввода. Программа завершена.");
                System.exit(1);
                return ' ';
            }
        }
    }

    private int[] readArray() {
        int size = readInt("Размер массива: ");
        while (size < 0) {
            System.out.println("Размер не может быть отрицательным!");
            size = readInt("Размер массива: ");
        }

        int[] arr = new int[size];
        System.out.println("Введите " + size + " элементов:");
        for (int i = 0; i < size; i++) {
            arr[i] = readInt("  [" + i + "] = ");
        }
        return arr;
    }

    private void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // ==================== MAIN ====================

    public static void main(String[] args) {
        lab1 lab = new lab1();
        lab.sc = new Scanner(System.in);

        System.out.println("Лабораторная работа №1 (Вариант 4)\n");

        // ----- Задание 1 -----
        System.out.println("--- Задание 1 ---");

        int x = lab.readInt("sumLastNums — число: ");
        System.out.println("Результат: " + lab.sumLastNums(x) + "\n");

        x = lab.readInt("isPositive — число: ");
        System.out.println("Результат: " + lab.isPositive(x) + "\n");

        char ch = lab.readChar("isUpperCase — символ: ");
        System.out.println("Результат: " + lab.isUpperCase(ch) + "\n");

        int a = lab.readInt("isDivisor — a: ");
        int b = lab.readInt("isDivisor — b: ");
        System.out.println("Результат: " + lab.isDivisor(a, b) + "\n");

        System.out.println("lastNumSum — 5 чисел:");
        int n1 = lab.readInt("1: ");
        int n2 = lab.readInt("2: ");
        int n3 = lab.readInt("3: ");
        int n4 = lab.readInt("4: ");
        int n5 = lab.readInt("5: ");

        int sum = lab.lastNumSum(n1, n2);
        sum = lab.lastNumSum(sum, n3);
        sum = lab.lastNumSum(sum, n4);
        sum = lab.lastNumSum(sum, n5);
        System.out.println("Итого: " + sum + "\n");

        // ----- Задание 2 -----
        System.out.println("--- Задание 2 ---");

        a = lab.readInt("safeDiv — x: ");
        b = lab.readInt("safeDiv — y: ");
        System.out.println("Результат: " + lab.safeDiv(a, b) + "\n");

        a = lab.readInt("makeDecision — x: ");
        b = lab.readInt("makeDecision — y: ");
        System.out.println("Результат: " + lab.makeDecision(a, b) + "\n");

        a = lab.readInt("sum3 — x: ");
        b = lab.readInt("sum3 — y: ");
        int c = lab.readInt("sum3 — z: ");
        System.out.println("Результат: " + lab.sum3(a, b, c) + "\n");

        x = lab.readInt("age — число: ");
        System.out.println("Результат: " + lab.age(x) + "\n");

        System.out.print("printDays — день недели: ");
        String day = lab.sc.nextLine().trim();
        lab.printDays(day);
        System.out.println();

        // ----- Задание 3 -----
        System.out.println("--- Задание 3 ---");

        x = lab.readInt("reverseListNums — x: ");
        System.out.println("Результат: " + lab.reverseListNums(x) + "\n");

        a = lab.readInt("pow — основание: ");
        b = lab.readInt("pow — степень: ");
        System.out.println("Результат: " + lab.pow(a, b) + "\n");

        x = lab.readInt("equalNum — число: ");
        System.out.println("Результат: " + lab.equalNum(x) + "\n");

        x = lab.readInt("leftTriangle — высота: ");
        lab.leftTriangle(x);
        System.out.println();

        System.out.println("guessGame:");
        lab.guessGame();
        System.out.println();

        // ----- Задание 4 -----
        System.out.println("--- Задание 4 ---");

        System.out.println("findLast:");
        int[] arr = lab.readArray();
        x = lab.readInt("Искомое число: ");
        System.out.println("Индекс: " + lab.findLast(arr, x) + "\n");

        System.out.println("add:");
        arr = lab.readArray();
        x = lab.readInt("Значение: ");
        int pos = lab.readInt("Позиция: ");
        System.out.print("Результат: ");
        lab.printArray(lab.add(arr, x, pos));
        System.out.println();

        System.out.println("reverse:");
        arr = lab.readArray();
        System.out.print("До: ");
        lab.printArray(arr);
        lab.reverse(arr);
        System.out.print("После: ");
        lab.printArray(arr);
        System.out.println();

        System.out.println("concat:");
        System.out.println("Первый массив:");
        int[] arr1 = lab.readArray();
        System.out.println("Второй массив:");
        int[] arr2 = lab.readArray();
        System.out.print("Результат: ");
        lab.printArray(lab.concat(arr1, arr2));
        System.out.println();

        System.out.println("deleteNegative:");
        arr = lab.readArray();
        System.out.print("Результат: ");
        lab.printArray(lab.deleteNegative(arr));
        System.out.println();

        System.out.println("Готово.");
        lab.sc.close();
    }
}