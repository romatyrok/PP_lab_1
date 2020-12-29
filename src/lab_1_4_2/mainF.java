package lab_1_4_2;

/**
 * Лабораторна робота з ПП№1
 * @author Sabat S. KN-203
 * @version 2.0
 */
public class mainF {
    public static void main(String[] args) {
        interval interval = new interval(); //об'єкт класу lab_1_4_2.interval
        interval.inInterval(); //введення проміжку
        interval.evenOdd(); //друк непарних/парних
        interval.sum(); //сума паних/непарних
        fibonacci arrF = new fibonacci(); //об'єкт класу fibonacci
        int lastInterval = interval.getLast_interval();
        if(lastInterval % 2 != 0) arrF.inFibonacci(lastInterval, lastInterval - 1);
        else arrF.inFibonacci(lastInterval - 1, lastInterval);
        arrF.outFibonacci(); //друк ряду Фібоначчі
        arrF.percentageF(); //друк відсотків непарних/парних
    }
}