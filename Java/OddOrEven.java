package Java;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.println("Digie um número");
        int n1 = dados.nextInt();

        int resul = n1 % 2;

        if (resul == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        dados.close();
    }
}
