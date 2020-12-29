package lab_1_4_2;
import java.util.Scanner;
/**
 * створення ряду Фібоначі та визначення відсотку парних/непарних чисел ряду
 */
public class fibonacci {
    private int lengthFibonacci;
    private int Mas[];
    /**
     * створення ряду фібоначчі
     */
    void inFibonacci(int first, int second) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter Fibonacci array length");
        lengthFibonacci = in.nextInt();//довжина ряду Фібоначі
        Mas = new int[lengthFibonacci];
        Mas[0] = first;
        Mas[1] = second;
        for (int i = 0; i + 2 < lengthFibonacci; i++) {
            Mas[i + 2] = Mas[i] + Mas[i + 1];
        }
    }
    void outFibonacci() {
        for (int i = 0; i < lengthFibonacci; i++)
            System.out.print(Mas[i] + " "); }
    /**
     * розрахування та друк відсотка непарних/парних чисел
     */
    void percentageF(){
        int counterOdd = 0;
        for(int i = 0; i < lengthFibonacci; i++) {
            if(!interval.dividesByTwo(Mas[i])) {
                counterOdd++;
            }
        }
        double percentage = ((double)counterOdd / (double)lengthFibonacci) * 100;
        System.out.printf("\nodd %.2f%% even %.2f%%", percentage, 100 - percentage);
    }
}