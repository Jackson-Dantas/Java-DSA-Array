import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type length of int Array");
        int arrayLength = sc.nextInt();

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Input number");
            int inputNumb = sc.nextInt();
            array[i] = inputNumb;
        }

        System.out.println("Negative numbers: ");

        for (int j : array) {
            if(j < 0){
                System.out.println(j);
            }
        }
    }
}