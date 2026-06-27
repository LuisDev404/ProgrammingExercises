package Java.JavaBasic;

public class Vectors {
    public static void main(String[] args) {

        System.out.println("=== DEMONSTRAÇÃO DE VETORES (ARRAYS) ===\n");

        // -----------------------------------------------------------------
        // 1. FORMA 1: Declaração com tamanho fixo (vazio)
        // -----------------------------------------------------------------
        System.out.println("--- 1. Criando um vetor vazio e preenchendo ---");

        // Criando um vetor de inteiros que suporta exatamente 3 elementos
        int[] notas = new int[3];

        // Inserindo valores manualmente usando os índices (0, 1 e 2)
        String r = "notas[0]";
        notas[0] = 85;
        notas[1] = 90;
        notas[2] = 75;

        // Acessando um valor específico
        System.out.println("Nota da primeira posição (Índice 0): " + notas[0]);
        System.out.println();

        // -----------------------------------------------------------------
        // 2. FORMA 2: Declaração com valores inicializados (direto)
        // -----------------------------------------------------------------
        System.out.println("--- 2. Criando um vetor já com valores ---");

        // O Java descobre o tamanho automaticamente (neste caso, tamanho 4)
        String[] nomes = { "Ana", "Bruno", "Carlos", "Diana" };

        // Descobrindo o tamanho do vetor dinamicamente com '.length'
        System.out.println("O vetor de nomes tem tamanho: " + nomes.length);
        System.out.println();

        // -----------------------------------------------------------------
        // 3. Modificando um valor existente
        // -----------------------------------------------------------------
        System.out.println("--- 3. Modificando elementos ---");
        System.out.println("Nome antigo na posição 1: " + nomes[1]); // Bruno

        nomes[1] = "Bruna"; // Substitui o valor antigo
        System.out.println("Nome novo na posição 1: " + nomes[1]); // Bruna
        System.out.println();

        // -----------------------------------------------------------------
        // 4. Percorrendo o vetor com o Loop 'for' tradicional
        // -----------------------------------------------------------------
        System.out.println("--- 4. Percorrendo com 'for' (útil para usar o índice) ---");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Posição [" + i + "] = " + nomes[i]);
        }
        System.out.println();

        // -----------------------------------------------------------------
        // 5. Percorrendo o vetor com o Loop 'for-each'
        // -----------------------------------------------------------------
        System.out.println("--- 5. Percorrendo com 'for-each' (mais limpo) ---");

        // Lê-se: "Para cada 'nota' dentro do vetor 'notas'"
        for (int nota : notas) {
            System.out.println("Nota encontrada: " + nota);
        }

        System.out.println("\n=== FIM DO PROGRAMA ===");
    }
}
