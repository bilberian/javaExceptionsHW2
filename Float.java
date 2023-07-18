package hw2;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. 
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, 
// необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class Float {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите дробное число: ");

        while (!sc.hasNextFloat() && sc.hasNext()) {
            System.out.println("Ошибка ввода: " + sc.next() + " Повторите ввод: ");
        }
        float input = sc.nextFloat();
    }
}
