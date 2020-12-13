package com.max.idea;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        lesson2();
        lesson3();
        lesson4();
        lesson5();
        lesson6();
        lesson7();
        lesson8();
        lesson9();
        lesson10();
        lesson11();
        lesson12();
        lesson13();
        lesson14();

        finalTask1();
        finalTask2();
        finalTask3();
        finalTask4();
    }

    public static void lesson2(){
        double a = 5.856;
        byte b = 127;
        System.out.println(a);
        System.out.println(b);
    }

    public static void lesson3(){
        int[] nums = {1, 2, 3, 4, 5};
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1]= temp;

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        int summ = nums[0] + nums[nums.length / 2];
        System.out.println(summ);
    }

    public static void lesson4(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int first = in.nextInt();
        System.out.println("Введите второе число: ");
        int second = in.nextInt();
        System.out.println("Введите третье число: ");
        int third = in.nextInt();

        float mean = (first + second + third) / 3.0f;
        System.out.println("Среднее арифметическое введеных чисел: " + mean);
        int result  = (int)(mean / 2.0f);

        if (result > 3){
            System.out.println("Программа выполнена корректно.");
        }
    }

    public static void lesson5(){
        Scanner in_int = new Scanner(System.in);
        Scanner in_str = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = in_int.nextInt();

        System.out.println("Введите второе число: ");
        int b = in_int.nextInt();

        System.out.println("Введите операцию: ");
        String command = in_str.nextLine();

        int result = 0;

        switch (command){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }

        System.out.println("Результат: " + result);
    }

    public static void lesson6(){
        Scanner in = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int type_of_value = in.nextInt();

        switch (type_of_value){
            case 1:
                System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - грамм, 4 - унция");
                int unit = in.nextInt();
                System.out.println("Введите массу: ");
                int value = in.nextInt();
                switch (unit){
                    case 1:
                        System.out.println("Килограмм: " + value);
                        System.out.println("Фунт: " + value * 2.2046226218488);
                        System.out.println("Грамм: " + value * 1000);
                        System.out.println("Унция: " + value * 35.27396194958048);
                        break;
                    case 2:
                        System.out.println("Килограмм: " + value * 0.453592369999995);
                        System.out.println("Фунт: " + value);
                        System.out.println("Грамм: " + value * 453.592369999995);
                        System.out.println("Унция: " + value * 15.999999999999854);
                        break;
                    case 3:
                        System.out.println("Килограмм: " + value * 0.001);
                        System.out.println("Фунт: " + value * 0.0022046226218488);
                        System.out.println("Грамм: " + value);
                        System.out.println("Унция: " + value * 0.03527396194958048);
                        break;
                    case 4:
                        System.out.println("Килограмм: " + value * 0.028349523124999946);
                        System.out.println("Фунт: " + value * 0.06250000000000057);
                        System.out.println("Грамм: " + value * 28.349523124999944);
                        System.out.println("Унция: " + value);
                        break;
                    default:
                        System.out.println(value);
                }
                break;
            case 2:
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                int unit2 = in.nextInt();
                System.out.println("Введите длину: ");
                int value2 = in.nextInt();
                switch (unit2){
                    case 1:
                        System.out.println("Метр: " + value2);
                        System.out.println("Миля: " + value2 * 0.000621371192237334);
                        System.out.println("Ярд: " + value2 * 1.0936132983);
                        System.out.println("Фут: " + value2 * 3.2808398950131);
                        break;
                    case 2:
                        System.out.println("Метр: " + value2 * 1609.3439999999998);
                        System.out.println("Миля: " + value2 );
                        System.out.println("Ярд: " + value2 * 1759.999999939315);
                        System.out.println("Фут: " + value2 * 5279.999999999962);
                        break;
                    case 3:
                        System.out.println("Метр: " + value2 * 0.9144000000315285);
                        System.out.println("Миля: " + value2 * 0.0005681818182014091);
                        System.out.println("Ярд: " + value2);
                        System.out.println("Фут: " + value2 * 3.0000000001034186);
                        break;
                    case 4:
                        System.out.println("Метр: " + value2 * 0.3048000000000022);
                        System.out.println("Миля: " + value2 * 0.00018939393939394078);
                        System.out.println("Ярд: " + value2 * 0.3333333333218424);
                        System.out.println("Фут: " + value2);
                        break;
                }
                break;
        }

    }

    public static void lesson7(){

        int x = 10;
        int y = 12;
        int z = 444;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arr_len = in.nextInt();
        System.out.println();

        int[] array = new int[arr_len];
        System.out.println("Заполните массив: ");

        for (int i = 0; i < arr_len; i++){
            array[i] = in.nextInt();
        }

        for(int number: array){
            if (number == x || number == y || number == z){
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }

    public static void lesson8(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое положительное целое число: ");
        int number = in.nextInt();

        int summ = 0;

        for (int i = 1; i < number; i += 2){
            summ += i;
        }

        System.out.println(summ);
    }

    public static void lesson9(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int arr_len = in.nextInt();

        double[] d_array = new double[arr_len];
        double d_summ = 0.0;
        System.out.println("Заполните массив (тип double): ");
        for (int i = 0; i < arr_len; i++){
            double d_temp = in.nextDouble();
            d_array[i] = d_temp;
            d_summ += d_temp;
        }

        double d_mean = d_summ / arr_len;

        System.out.println("Среднее арифметическое элементов массива: " + d_mean);
        System.out.println("Массив, каждый элемент которого умножен на среднее арифметическое: ");
        for (double d: d_array){
            System.out.print(d * d_mean + " ");
        }
    }

    public static void lesson10(){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество рядов матрицы: ");
        int m_rows = in.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int m_cols = in.nextInt();

        int[][] matrix = new int[m_rows][m_cols];

        for(int r = 0; r < m_rows; r++){
            System.out.println("Введите строку номер " + (r + 1));
            for(int c = 0; c < m_cols; c++){
                matrix[r][c] = in.nextInt();
            }
        }

        System.out.println("Матрица: ");
        for (int r = 0; r < m_rows; r++){
            for(int c = 0; c < m_cols; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }

        System.out.println("Вывод первой строки, умноженной на 3: ");
        for (int c = 0; c < m_cols; c++){
            System.out.print( (matrix[0][c] * 3) + " ");
        }
    }

    public static void lesson11(){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        String first_number_str = in.nextLine();
        int firtst_number = Integer.parseInt(first_number_str);

        System.out.println("Введите второе число: ");
        int second_number = in.nextInt();

        if(firtst_number >= second_number){
            System.out.println("Большее число: " + firtst_number);
            double min_double = new Double(second_number);
            System.out.println("Меньшее число в double: " + min_double);
        }
        else{
            System.out.println("Большее число: "+ second_number);
            double min_double = new Double(firtst_number);
            System.out.println("Меньшее число в double: " + min_double);
        }
    }

    public static void lesson12(){
        String str = "I like Java!!!";

        boolean first_check = false;
        boolean second_check = false;
        boolean third_check = false;

        if (str.contains("Java")) first_check = true;
        if (str.startsWith("I like")) second_check = true;
        if (str.endsWith("!!!")) third_check = true;

        if (first_check && second_check && third_check){
            String upper_str = str.toUpperCase();
            System.out.println(upper_str);
        }

        System.out.println(str.replaceAll("a", "o").substring(7, 11));
    }

    public static void lesson13(){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку:");
        String str = in.nextLine();

        String[] str_array = str.split(" ");

        int latin_str_counter = 0;

        for (String s: str_array){
            if (s.matches("^[a-zA-Z0-9]+$")){
                System.out.print(s + " ");
                latin_str_counter++;
            }
        }

        System.out.println("\nКоличество слов на латинице: " + latin_str_counter);
    }

    public static void lesson14(){

        int[] array_of_int = new int[15];
        Random rand = new Random();

        for (int i = 0; i < array_of_int.length; i++){
            array_of_int[i] = rand.nextInt(40) - 20;
        }

        System.out.println("Введеный массив: ");
        for(int n: array_of_int){
            System.out.print(n + " ");
        }

        int max = -20;
        int min = 20;
        for(int n: array_of_int){
            max = Math.max(max, n);
            min = Math.min(min, n);
        }

        System.out.println("\nМаксимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);

        if(Math.abs(max) >= Math.abs(min)){
            System.out.println("Максимальное по модулю: " + max);
        }
        else {
            System.out.println("Максимальное по модулю: " + min);
        }
    }

    public static void finalTask1(){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите курс доллара: ");
        double course = in.nextDouble();
        System.out.println("Введите сумму в рублях: ");
        double roubles = in.nextDouble();

        double result = roubles / course;

        System.out.printf("Итого %.2f долларов", result);
    }

    public static void finalTask2(){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите уравнение: ");
        String equation = in.nextLine();

        char operator = equation.toCharArray()[1];
        int x = 0;

        switch (equation.indexOf('x')){
            case 0:
                switch (operator){
                    case '+':
                        x = Character.getNumericValue(equation.charAt(4)) - Character.getNumericValue(equation.charAt(2));
                        break;
                    case '-':
                        x = Character.getNumericValue(equation.charAt(4)) + Character.getNumericValue(equation.charAt(2));
                        break;
                }
                break;
            case 2:
                switch (operator){
                    case '+':
                        x = Character.getNumericValue(equation.charAt(4)) - Character.getNumericValue(equation.charAt(0));
                        break;
                    case '-':
                        x = Character.getNumericValue(equation.charAt(4)) + Character.getNumericValue(equation.charAt(0));
                        break;
                }
                break;
            case 4:
                switch (operator){
                    case '+':
                        x = Character.getNumericValue(equation.charAt(0)) + Character.getNumericValue(equation.charAt(2));
                        break;
                    case '-':
                        x = Character.getNumericValue(equation.charAt(0)) - Character.getNumericValue(equation.charAt(2));
                        break;
                }
                break;
        }

        System.out.println("x = " + x);
    }

    public static void finalTask3(){
        Scanner in_int = new Scanner(System.in);
        Scanner in_str = new Scanner(System.in);

        System.out.println("Введите количество строк: ");
        int rows_number = in_int.nextInt();

        System.out.println("Введите строку номер 1");
        String result = in_str.nextLine();
        int result_uniq_symbols = finalTask3_numberOfuniqSymbols(result);

        for (int i = 1; i < rows_number; i++){
            System.out.println("Введите строку номер " + (i + 1));
            String temp_string = in_str.nextLine();
            int temp_number_of_uniq_symbols = finalTask3_numberOfuniqSymbols(temp_string);
            if (temp_number_of_uniq_symbols > result_uniq_symbols) result = temp_string;
        }

        System.out.println("Ответ: " + result);
    }

    public static int finalTask3_numberOfuniqSymbols(String str){
        String temp = "";
        for (int i = 0; i < str.length(); i++){
            char current = str.charAt(i);
            if (temp.indexOf(current) < 0){
                temp = temp + current;
            } else {
                temp = temp.replace(String.valueOf(current), "");
            }
        }

        return temp.length();
    }

    public static void finalTask4(){

        Scanner in = new Scanner(System.in);

        System.out.println("Загадка: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает. Кто это?");

        int attempt_number = 0;
        String answer = "Заархивированный вирус";
        boolean is_help_used = false;
        
        while (attempt_number < 3){
            System.out.print("Попытка номер " + (attempt_number + 1) + ": ");

            String attempt = in.nextLine();
            if (attempt.equals(answer)){
                System.out.println("Правильно!");
                break;
            }
            else if (attempt.equals("Подсказка")){
                if (attempt_number == 0) {
                    System.out.println("То, ради чего существует Касперский прошедший через WinRar или 7zip.");
                    is_help_used = true;
                    continue;
                }
                else{
                    System.out.println("Подсказка уже не доступна.");
                    continue;
                }
            }
            else{
                if (is_help_used || attempt_number == 2){
                    System.out.println("Обидно, приходи в другой раз!");
                    break;
                }
                else{
                    System.out.println("Подумай еще!");
                }
            }

            attempt_number++;
            System.out.println();
        }
    }
}


