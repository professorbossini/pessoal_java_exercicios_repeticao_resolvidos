import java.util.Random;
import java.util.Scanner;
public class Ex32{
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner leitor = new Scanner (System.in);
        System.out.println("Qual o valor de n");
        int n = leitor.nextInt();
        for (int i = 1; i <= n; i++){
            int d1 = gerador.nextInt(6) + 1;
            int d2 = gerador.nextInt(6) + 1;
            System.out.printf("%d %c %d\n", d1, d1 > d2 ? '>' : d2 > d1 ? '<': '=', d2);
        }
        leitor.close();        
    }
}