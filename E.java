import java.util.Scanner;

public class E {
    public static void main(String[] args){
        Scanner num = new Scanner (System.in);
        System.out.println("Digite a velocidade Inicial: ");
        int Vo = num.nextInt();
        System.out.println("Digite o espaço Inicial: ");
        int So = num.nextInt();
        System.out.println("Digite a aceleração: ");
        int a = num.nextInt();
        System.out.println("Digite o instante: ");
        int t = num.nextInt();

        System.out.println ( So + Vo * t + a * (t*t) / 2);

        num.close();
    }
}
