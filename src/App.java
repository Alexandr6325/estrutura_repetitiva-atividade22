import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        int fat = 1;

        for (int i=1; i<=n; i++){
            fat = fat * i;
        }

        System.out.println("A fatorial deste numero e " + fat);

        sc.close();
    }
}
