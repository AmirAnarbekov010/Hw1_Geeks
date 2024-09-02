import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String myVariableName;

        final int NUM = 14;
        System.out.println("значение NUM " + NUM);

        String word = "hello world ";
        System.out.println("содержимая переменной word " + word);

        word = " hello world ";
        String result = "NUM" + word;
        System.out.println(result);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
        System.out.println("Введите ваше имя:");

        Scanner scanner = new Scanner(System.in);
        String Amirdin = scanner.nextLine();

        System.out.println("Привет,Amirdin!");
        scanner.close();
    }
}