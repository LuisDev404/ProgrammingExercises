package Java.JavaBasic;

public class PrimitiveTypes {
    public static void main(String[] args) {

        // 1. Inteiros (Tipos numéricos sem ponto decimal)
        byte idade = 25; // 1 byte: valores pequenos
        short ano = 2026; // 2 bytes: anos ou contagens médias
        int populacaoCidade = 1500000; // 4 bytes: tipo padrão para inteiros
        long milhasEspaciais = 95000000L; // 8 bytes: números gigantes (requer o 'L')

        // 2. Pontos Flutuantes (Tipos numéricos com ponto decimal)
        float precoSuco = 5.99f; // 4 bytes: precisão simples (requer o 'f')
        double taxaInteresse = 0.04562; // 8 bytes: precisão dupla, tipo padrão para decimais

        // 3. Caractere
        char inicialDoNome = 'J'; // 2 bytes: armazena uma única letra (aspas simples)

        // 4. Booleano
        boolean usuarioAtivo = true; // true ou false: controle de decisões

        // --- Exibindo os valores no console ---
        System.out.println("--- Exemplos de Tipos Primitivos em Java ---");
        System.out.println("Byte (idade): " + idade);
        System.out.println("Short (ano): " + ano);
        System.out.println("Int (população): " + populacaoCidade);
        System.out.println("Long (milhas): " + milhasEspaciais);
        System.out.println("Float (preço): " + precoSuco);
        System.out.println("Double (taxa): " + taxaInteresse);
        System.out.println("Char (inicial): " + inicialDoNome);
        System.out.println("Boolean (status): " + usuarioAtivo);
    }
}
