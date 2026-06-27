package Java;

import java.util.Scanner;

public class TheGreatest {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.println("Digite três números");
        int n1 = dados.nextInt();
        int n2 = dados.nextInt();
        int n3 = dados.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("O maior número é " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("O maior número é " + n2);
        } else {
            System.out.println("O maior número é " + n3);
        }

        dados.close();
    }
}
