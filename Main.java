import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack<Array> a = new ObjectStack<>();

        a.push(new Array(1, "Amanda", 22));
        a.push(new Array(2, "Bruno", 44));
        a.push(new Array(3, "Fernanda", 50));

        try {
            System.out.println(a.pop());
            System.out.println(a.pop());
            System.out.println(a.pop());

            System.out.println(a.pop());
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Fim do programa!");
    }
}