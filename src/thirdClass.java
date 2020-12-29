import java.util.Scanner; public class thirdClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 3 args (int)");
        int firstArg = in.nextInt();
        int secondArg = in.nextInt();
        int thirdArg = in.nextInt();
        System.out.printf("%d %d %d", firstArg, secondArg, thirdArg); }
}