import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }


    public static void task1() {
        System.out.println("Задача 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);


        System.out.println();
        double[] weights = {1.57, 7.654, 9.986};
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }

        System.out.println();
        int[] age = {16, 18, 21};
        age[1] = 18;
        int comingOfAge = age[1];
        System.out.println(comingOfAge);

        System.out.println();
        double[] millie = new double[3];
        millie[0] = 1.1;
        millie[1] = 1.2;
        millie[2] = 1.3;
        System.out.println(millie[0]);
        }


    public static void task2() {
        System.out.println("Задача 2");
        int[] numbers0 = new int[3];
        numbers0[0] = 1;
        numbers0[1] = 2;
        numbers0[2] = 3;
        System.out.print(numbers0[0] + ", ");
        System.out.print(numbers0[1] + ", ");
        System.out.println(numbers0[2]);

        double[] numbers3 = {1.57, 7.654, 9.986};
        System.out.print(numbers3[0] + ", ");
        System.out.print(numbers3[1] + ", ");
        System.out.println(numbers3[2]);

        int[] age = {16, 18, 21};
        System.out.print(age[0] + ", ");
        System.out.print(age[1] + ", ");
        System.out.println(age[2]);

        double[] millie = new double[3];
        millie[0] = 1.1;
        millie[1] = 1.2;
        millie[2] = 1.3;
        System.out.print(millie[0] + ", ");
        System.out.print(millie[1] + ", ");
        System.out.println(millie[2]);
    }


    public static void task3() {
        System.out.println("Задача 3");
        int[] numbers4 = new int[3];
        numbers4[2] = 1;
        numbers4[1] = 2;
        numbers4[0] = 3;
        System.out.print(numbers4[0] + ", ");
        System.out.print(numbers4[1] + ", ");
        System.out.println(numbers4[2]);

        double[] numbers5 = {1.57, 7.654, 9.986};
        System.out.print(numbers5[2] + ", ");
        System.out.print(numbers5[1] + ", ");
        System.out.println(numbers5[0]);

        int[] age1 = {16, 18, 21};
        System.out.print(age1[2] + ", ");
        System.out.print(age1[1] + ", ");
        System.out.println(age1[0]);

        double[] millie = new double[3];
        millie[2] = 1.1;
        millie[1] = 1.2;
        millie[0] = 1.3;
        System.out.print(millie[2] + ", ");
        System.out.print(millie[1] + ", ");
        System.out.println(millie[0]);
    }


    public static void task4() {
        System.out.println("Задача 4");
        int[] numbers = {1, 2, 3};
        numbers[0] = 1+1;
        numbers[2] =3+1;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}



