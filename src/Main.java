import structure5.SinglyLinkedList;
import java.util.Scanner;



public class Main {
    public static IStack<Integer> Nacl;
    public static StackFactory StFa;
    public static void main(String[] args) {
        Scanner pancham = new Scanner(System.in);
        int op = 0;
        while (op != 5){
            System.out.println("===Tipos de implementaciones===\n");
            System.out.println("¿Qué tipo de implementación desea? (numero)");
            System.out.println("1. ArrayList");
            System.out.println("2. Vector");
            System.out.println("3. Lista Simplemente Encadenada");
            System.out.println("4. Lista Doblemente Encadenada");
            System.out.println("5. Salir");
            op = pancham.nextInt();
            switch (op){
                case 1:
                    System.out.println("===Implementación de ArrayList===\n");
                    Nacl = StFa.getInstance(1);
                    break;
                case 2:
                    System.out.println("===Implementación de vector===\n");
                    Nacl = StFa.getInstance(2);
                    break;
                case 3:
                    System.out.println("===Implementación de Lista Simplemente Encadenada===\n");
                    Nacl = StFa.getInstance(3);
                    break;
                case 4:
                    System.out.println("===Implementación de Lista Doblemente Encadenada===\n");
                    Nacl = StFa.getInstance(4);
                    break;
                case 5:
                    System.out.println("Espero haberte ayudado :D");
                    break;
            }
            Reader leer = new Reader();
            leer.read();
        }
    }
}