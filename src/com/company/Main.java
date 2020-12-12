package com.company;

public class Main {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        new Main().task_1();
        new Main().task_2();
        new Main().task_3();
        new Main().task_4();
    }
    public void task_1() {
        double first_member_task_one = -35.231;
        int last_member_task_one = 10;
        System.out.println(ANSI_BLUE + "Минимальное число равно: " + Math.min(first_member_task_one, last_member_task_one) + ANSI_RESET);
    }
    public void task_2() {
        Object three = null;
        int n = 15; // Задаём число;
        if(n % 2 == 0) {    // Оеделяем остаток от деления на 2
            System.out.println("Число " + n + "чётное");
        }
        else {
            System.out.println("Число " + n + " нечётное");
        }
    }
    public void task_3() {
        System.out.printf("\n Таблица умножения\n");
        int i, j;
        String straight_line = "|"; // Задание строки со значением прямая черта
        String dash = "-"; // Задание строки со значением тире
        System.out.printf("  * |"); // Устанавливаем первый символ в первой строке *|
        for(i=1; i<11; i++) // Цикл для отображения чисел в первой строке от 1 до 10
            System.out.printf("%3d ", i); // Отступы между числамти размером в 3 пробела
            System.out.printf("\n " + dash.repeat(3) + straight_line + dash.repeat(39) + "\n"); // Отображение разделителя на второй строке
        for(i=1; i<11; i++) // Цикл для отображения строк от 1 до 10
        {
            System.out.printf("%3d |", i); // Отображение чисел по вертикали с отступом 3 пробела слева
            for(j=1; j<11; j++) // Цикл в рамках умножения чисел в пределах от 1 до 10 в строчках
                System.out.printf("%3d ", i*j); // %3d - отступ 3 пробела, перемножение чисел
                System.out.printf("\n"); // Перевод на новую строку
        }
    }
    public void task_4() {
        int first_member = 1;
        int step = 2;
        int n = 3;
        int n_member = first_member + (n - 1) * step;
        System.out.println(ANSI_GREEN + "Арифметическая рогрессия: " + n_member + ANSI_RESET);
    }
}
