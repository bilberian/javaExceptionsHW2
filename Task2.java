package hw2;

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = new int[10]; // добавила массив по имени переменной и достаточного объема
                                      // либо добавляется исключение о превышении размера массива

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException ex) { // добавила
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
