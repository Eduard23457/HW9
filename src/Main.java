import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int [30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("Сумма затрат за месяц составила " + total + " рублей");

        System.out.println("Задание 2");
        int[] payTwo = generateRandomArray();
        int maxPay = payTwo[0];
        for( int i = 0; i < payTwo.length; i++) {
            if (payTwo[i] < maxPay) ;
            {
                maxPay = payTwo[i];
            }
        }
        int minPay = payTwo[0];
        for (int i = 0; i < payTwo.length; i++) {
            if (minPay > payTwo[i]);
            {
                minPay = payTwo[i];
            }
        }
        System.out.println("Минимальная сумма затрат за день составила " + minPay + " рублей. Максимальная сумма затрат составила " + maxPay + " рублей" );


        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I' };
        for(int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        int n = reverseFullName.length;
        char temp;
        for (int i = 0; i < n / 2; i++) {
            temp = reverseFullName[i];
            reverseFullName[n - i - 1] = reverseFullName[i];
            reverseFullName[1] = temp;
        }
        System.out.println();
        System.out.println(Arrays.toString(reverseFullName));

        System.out.println();

        System.out.print(reverseFullName);
        System.out.println();


        System.out.println("Задача 3");

            int[] expensesArray = generateRandomArray();
            int expensesSum = 0;
            double avgExpense = 0;
            int expensesArrayLenght = expensesArray.length;
            for (int expense: expensesArray) {
                expensesSum +=expense;
            }
            avgExpense = (double) expensesSum / expensesArrayLenght;
            System.out.print("Средняя сумма трат за месяц составила ");
            System.out.printf("%.2f", avgExpense);
            System.out.println("рублей");

        }


    }
