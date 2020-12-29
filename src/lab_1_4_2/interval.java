package lab_1_4_2;

import java.util.Scanner;

/**
 * робота з числами на інтервалі */
public class interval {
    /**проміжок*/
    private int first, last;
    /**сума непарних/парних*/
    private int sum_odd = 0, sum_even = 0; /**
     * getter значення початку інтервалу
     * @return ціле число - початок проміжку
     */
    public int getFirst_interval() {
        return first;
    }
    /**
     * getter значення кінця інтервалу
     * @return ціле число - кінець проміжку
     */
    public int getLast_interval() {
        return last;
    }
    /**
     * ввід проміжку
     */
    void inInterval() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x1 x2 (lab_1_4_2.interval):");
        first = sc.nextInt();
        last = sc.nextInt();
        if (last <= first)
        {
            System.out.println("error");
            System.exit(-1);
        }
        System.out.println("lab_1_4_2.interval: [" + first + ";" + last + "]");
    }
    /**
     * чи є парним число
     */
    public static boolean dividesByTwo(int a){
        return (a % 2 == 0);
    }
    /**
     * друк непарних за зростанням та парних за спаданням
     */
    void evenOdd(){
        System.out.println("odd:");
        for(int i = first; i <= last; i++){
            if(!dividesByTwo(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println("\neven:");
        for(int i = last; i >= first; i--){
            if(dividesByTwo(i)){
                System.out.print(i + " ");
            }
        }
    }
    /**
     * обчислення суми непарних/парних
     */
    void sum(){
        int se = 0, so = 0;
        for(int i = first; i <= last; i++) {
            if(dividesByTwo(i)) {
                se += i;
            }
            else so += i;
        }
        System.out.println("\nSum odd : " + so + " Sum even : " + se);
    }
    /**
     * Отримати суму парних чисел
     * @return ціле число - сума парних чисел
     */
    long get_sum_even() {
        return sum_even;
    }
    /**
     * Отримати суму непарних чисел
     * @return ціле число - сума непарних чисел
     */
    long get_sum_odd() {
        return sum_odd;
    }
}