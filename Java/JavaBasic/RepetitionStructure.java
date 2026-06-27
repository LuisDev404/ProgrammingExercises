package Java.JavaBasic;

public class RepetitionStructure {
    public static void main(String[] args) {

        System.out.println("=== DEMONSTRAÇÃO DAS ESTRUTURAS DE REPETIÇÃO ===\n");

        // -----------------------------------------------------------------
        // 1. O LOOP 'while' (Verifica a condição ANTES de rodar)
        // -----------------------------------------------------------------
        System.out.println("--- 1. Executando o loop 'while' (Contador de passos) ---");
        int passos = 1;

        while (passos <= 3) {
            System.out.println("Passo número: " + passos);
            passos++; // Se esquecer de incrementar, o loop fica infinito
        }
        System.out.println(); // Apenas pula uma linha no console

        // -----------------------------------------------------------------
        // 2. O LOOP 'do-while' (Roda pelo menos UMA VEZ, depois verifica)
        // -----------------------------------------------------------------
        System.out.println("--- 2. Executando o loop 'do-while' (Tentativa de conexão) ---");
        int tentativas = 1;

        do {
            System.out.println("Tentando conectar... Tentativa: " + tentativas);
            tentativas++;
        } while (tentativas <= 0); // A condição já é falsa, mas o bloco rodou uma vez!
        System.out.println();

        // -----------------------------------------------------------------
        // 3. O LOOP 'for' (Ideal para quando você SABE a quantidade de vezes)
        // -----------------------------------------------------------------
        System.out.println("--- 3. Executando o loop 'for' (Contagem regressiva) ---");

        // (inicialização; condição de parada; passo de mudança)
        for (int i = 3; i >= 1; i--) {
            System.out.println("Regressiva: " + i);
        }
        System.out.println();

        // -----------------------------------------------------------------
        // 4. O LOOP 'for-each' (Exclusivo para percorrer Arrays/Coleções)
        // -----------------------------------------------------------------
        System.out.println("--- 4. Executando o loop 'for-each' (Lista de compras) ---");
        String[] itensMercado = { "Arroz", "Feijão", "Café" };

        // Para cada 'item' do tipo String que estiver dentro de 'itensMercado'
        for (String item : itensMercado) {
            System.out.println("Item da lista: " + item);
        }
        System.out.println();

        // -----------------------------------------------------------------
        // 5. O USO DO 'break' E 'continue' (Controlando o fluxo dos loops)
        // -----------------------------------------------------------------
        System.out.println("--- 5. Interrupções com break e continue ---");

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 2) {
                System.out.println("-> Pulou o 2 (continue)");
                continue; // Pula o resto deste bloco e vai direto para o número 3
            }
            if (numero == 4) {
                System.out.println("-> Parou no 4 (break)");
                break; // Encerra e sai do loop imediatamente, ignorando o 4 e o 5
            }
            System.out.println("Número atual: " + numero);
        }

        System.out.println("\n=== FIM DO PROGRAMA ===");
    }
}
