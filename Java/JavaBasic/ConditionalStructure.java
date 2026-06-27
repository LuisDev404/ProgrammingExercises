package Java.JavaBasic;

public class ConditionalStructure {
    public static void main(String[] args) {
        int nota = 75;

        // If and Else
        if (nota >= 90) {
            System.out.println("Excelente! Aprovado com honras.");
        } else if (nota >= 70) {
            System.out.println("Aprovado."); // Será executado aqui, pois 75 >= 70
        } else if (nota >= 50) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }

        // Operador ternario
        int idade = 19;
        // Se idade for maior ou igual a 18, recebe "Maior", senão recebe "Menor"
        String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(status); // Imprime: Maior de idade

        int diaDaSemana = 3;

        // Swich and Case
        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira"); // Será executado aqui
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            // ... outros casos
            default:
                System.out.println("Dia inválido");
                break;
        }

    }
}
