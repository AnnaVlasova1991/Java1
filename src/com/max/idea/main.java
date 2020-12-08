package com.max.idea;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        lesson2();
        lesson3();
        lesson4();
        lesson5();
        lesson6();
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

}


