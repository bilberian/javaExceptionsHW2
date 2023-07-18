package hw2;

import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class Task4 {
        public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String input = sc.nextLine();

        if (input.isEmpty()) {
            throw new Exception("Ошибка ввода: пустая строка.");
        } else {System.out.println("Введена строка: " + input);}
        
    }
}

