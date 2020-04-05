import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первую строку и нажмите Enter: ");
        String str1 = scan.nextLine();
        System.out.print("Введите вторую строку и нажмите Enter: ");
        String str2 = scan.nextLine();
        if (str1.length()>str2.length()) {
            System.out.print(str1);
        } else if (str1.length()<str2.length()) {
            System.out.print(str2);
        } else {
            System.out.print("Строки равны по длине!");
        }
        scan.close();
    }
}