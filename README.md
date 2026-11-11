Гурьев Данила Александрович БАС-22
 Лабораторная №1

---

 Задание 1

 Задача 1 (№2 — Сумма знаков)

Текст задачи  
Дана сигнатура метода: `public int sumLastNums(int x);`  
Необходимо реализовать метод таким образом, чтобы он возвращал результат сложения двух последних знаков числа, предполагая, что знаков в числе не менее двух.

Алгоритм решения
```java
public int sumLastNums(int x) {
    return (x % 10) + ((x / 10) % 10);
}
```

---

 Задача 2 (№4 — Есть ли позитив)

Текст задачи  
Дана сигнатура метода: `public boolean isPositive(int x);`  
Необходимо реализовать метод таким образом, чтобы он принимал число x и возвращал true, если оно положительное.

Алгоритм решения
```java
public boolean isPositive(int x) {
    return x > 0;
}
```

---

 Задача 3 (№6 — Большая буква)

Текст задачи  
Дана сигнатура метода: `public boolean isUpperCase(char x);`  
Необходимо реализовать метод таким образом, чтобы он принимал символ x и возвращал true, если это большая буква в диапазоне от ‘A’ до ‘Z’.

Алгоритм решения
```java
public boolean isUpperCase(char x) {
    return x >= 'A' && x <= 'Z';
}
```

---

 Задача 4 (№8 — Делитель)

Текст задачи  
Дана сигнатура метода: `public boolean isDivisor(int a, int b);`  
Необходимо реализовать метод таким образом, чтобы он возвращал true, если любое из принятых чисел делит другое нацело.

Алгоритм решения
```java
public boolean isDivisor(int a, int b) {
    if (a == 0 || b == 0) return false;
    return (a % b == 0) || (b % a == 0);
}
```

---

 Задача 5 (№10 — Многократный вызов)

Текст задачи  
Дана сигнатура метода: `public int lastNumSum(int a, int b);`  
Необходимо реализовать метод таким образом, чтобы он считал сумму цифр двух чисел из разряда единиц. Выполните с его помощью последовательное сложение пяти чисел и результат выведите на экран.

Алгоритм решения
```java
public int lastNumSum(int a, int b) {
    return (a % 10) + (b % 10);
}

// Последовательный вызов:
int sum = lastNumSum(n1, n2);
sum = lastNumSum(sum, n3);
sum = lastNumSum(sum, n4);
sum = lastNumSum(sum, n5);
```

---

 Задание 2

 Задача 1 (№2 — Безопасное деление)

Текст задачи  
Дана сигнатура метода: `public double safeDiv(int x, int y);`  
Необходимо реализовать метод таким образом, чтобы он возвращал деление x на y, и при этом гарантировал, что не будет выкинута ошибка деления на 0. При делении на 0 следует вернуть из метода число 0.

Алгоритм решения
```java
public double safeDiv(int x, int y) {
    if (y == 0) return 0;
    return (double) x / y;
}
```

---

 Задача 2 (№4 — Строка сравнения)

Текст задачи  
Дана сигнатура метода: `public String makeDecision(int x, int y);`  
Необходимо реализовать метод таким образом, чтобы он возвращал строку, которая включает два принятых методом числа и корректно выставленный знак операции сравнения (больше, меньше, или равно).

Алгоритм решения
```java
public String makeDecision(int x, int y) {
    if (x < y) return x + " < " + y;
    if (x > y) return x + " > " + y;
    return x + " == " + y;
}
```

---

 Задача 3 (№6 — Тройная сумма)

Текст задачи  
Дана сигнатура метода: `public boolean sum3(int x, int y, int z);`  
Необходимо реализовать метод таким образом, чтобы он возвращал true, если два любых числа (из трёх принятых) можно сложить так, чтобы получить третье.

Алгоритм решения
```java
public boolean sum3(int x, int y, int z) {
    return (x + y == z) || (x + z == y) || (y + z == x);
}
```

---

 Задача 4 (№8 — Возраст)

Текст задачи  
Дана сигнатура метода: `public String age(int x);`  
Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой сначала будет число x, а затем одно из слов: «год», «года», «лет».

Алгоритм решения
```java
public String age(int x) {
    int last = Math.abs(x) % 10;
    int lastTwo = Math.abs(x) % 100;

    if (lastTwo >= 11 && lastTwo <= 14) return x + " лет";
    if (last == 1) return x + " год";
    if (last >= 2 && last <= 4) return x + " года";
    return x + " лет";
}
```

---

 Задача 5 (№10 — Вывод дней недели)

Текст задачи  
Дана сигнатура метода: `public void printDays(String x);`  
В качестве параметра метод принимает строку, в которой записано название дня недели. Необходимо реализовать метод таким образом, чтобы он выводил на экран название переданного в него дня и всех последующих до конца недели дней. Если в качестве строки передан не день, то выводится текст «это не день недели». Вместо if в данной задаче используйте switch.

Алгоритм решения
```java
public void printDays(String day) {
    switch (day.toLowerCase()) {
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
```

---

 Задание 3

 Задача 1 (№2 — Числа наоборот)

Текст задачи  
Дана сигнатура метода: `public String reverseListNums(int x);`  
Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой будут записаны все числа от x до 0 (включительно).

Алгоритм решения
```java
public String reverseListNums(int x) {
    StringBuilder sb = new StringBuilder();
    for (int i = x; i >= 0; i--) {
        sb.append(i);
        if (i > 0) sb.append(" ");
    }
    return sb.toString();
}
```

---

 Задача 2 (№4 — Степень числа)

Текст задачи  
Дана сигнатура метода: `public int pow(int x, int y);`  
Необходимо реализовать метод таким образом, чтобы он возвращал результат возведения x в степень y.

Алгоритм решения
```java
public int pow(int x, int y) {
    int result = 1;
    for (int i = 0; i < y; i++) {
        result = x;
    }
    return result;
}
```

---

 Задача 3 (№6 — Одинаковость)

Текст задачи  
Дана сигнатура метода: `public boolean equalNum(int x);`  
Необходимо реализовать метод таким образом, чтобы он возвращал true, если все знаки числа одинаковы, и false в ином случае.

Алгоритм решения
```java
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
```

---

 Задача 4 (№8 — Левый треугольник)

Текст задачи  
Дана сигнатура метода: `public void leftTriangle(int x);`  
Необходимо реализовать метод таким образом, чтобы он выводил на экран треугольник из символов ‘’ у которого x символов в высоту, а количество символов в ряду совпадает с номером строки.

Алгоритм решения
```java
public void leftTriangle(int x) {
    for (int i = 1; i <= x; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print("");
        }
        System.out.println();
    }
}
```

---

 Задача 5 (№10 — Угадайка)

Текст задачи  
Дана сигнатура метода: `public void guessGame();`  
Необходимо реализовать метод таким образом, чтобы он генерировал случайное число от 0 до 9, далее считывал с консоли введённое пользователем число и выводил, угадал ли пользователь то, что было загадано, или нет. Метод запускается до тех пор, пока пользователь не угадает число. После этого выведите на экран количество попыток.

Алгоритм решения
```java
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
        }
    }
}
```

---

 Задание 4

 Задача 1 (№2 — Поиск последнего значения)

Текст задачи  
Дана сигнатура метода: `public int findLast(int[] arr, int x);`  
Необходимо реализовать метод таким образом, чтобы он возвращал индекс последнего вхождения числа x в массив arr. Если число не входит в массив — возвращается -1.

Алгоритм решения
```java
public int findLast(int[] arr, int x) {
    for (int i = arr.length - 1; i >= 0; i--) {
        if (arr[i] == x) return i;
    }
    return -1;
}
```

---

 Задача 2 (№4 — Добавление в массив)

Текст задачи  
Дана сигнатура метода: `public int[] add(int[] arr, int x, int pos);`  
Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, который будет содержать все элементы массива arr, однако в позицию pos будет вставлено значение x.

Алгоритм решения
```java
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
```

---

 Задача 3 (№6 — Реверс)

Текст задачи  
Дана сигнатура метода: `public void reverse(int[] arr);`  
Необходимо реализовать метод таким образом, чтобы он изменял массив arr. После проведённых изменений массив должен быть записан задом-наперёд.

Алгоритм решения
```java
public void reverse(int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
    }
}
```

---

 Задача 4 (№8 — Объединение)

Текст задачи  
Дана сигнатура метода: `public int[] concat(int[] arr1, int[] arr2);`  
Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором сначала идут элементы первого массива (arr1), а затем второго (arr2).

Алгоритм решения
```java
public int[] concat(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length + arr2.length];
    System.arraycopy(arr1, 0, result, 0, arr1.length);
    System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
    return result;
}
```

---

 Задача 5 (№10 — Удалить негатив)

Текст задачи  
Дана сигнатура метода: `public int[] deleteNegative(int[] arr);`  
Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором записаны все элементы массива arr кроме отрицательных.

Алгоритм решения
```java
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
```
