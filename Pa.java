import java.util.Scanner;

public class Pa {
    public static void main(String[] args){
        Scanner num = new Scanner (System.in);
        System.out.println("Digite o número de termos: ");
        int n = num.nextInt();
        System.out.println("Digite o valor inicial: ");
        int a1 = num.nextInt();
        System.out.println("Digite o valor final: ");
        int an = num.nextInt();

        System.out.println("O resultado é: " +  ((n*a1) + (n*an)) / 2);

        num.close();
    }
}