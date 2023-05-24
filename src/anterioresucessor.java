import java.util.Scanner;
public class anterioresucessor{
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Escolha e digite um número: ");
        int numero = scanner.nextInt();
        System.out.println("O antecessor de "+numero+" é "+(numero-1));
        System.out.println("O Sucessor de "+numero+" é "+(numero+1));
