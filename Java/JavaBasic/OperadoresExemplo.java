package Java.JavaBasic;

public class OperadoresExemplo {
    public static void main(String[] args) {
        int idade = 20;
        double saldoNaConta = 150.00;
        boolean temCarteiraEstudante = true;

        // Exemplo 1: Operadores Relacionais e Lógico && (E)
        // Regra: Para comprar a meia-entrada comum, precisa ter menos de 21 anos E
        // saldo suficiente
        boolean podeComprarMeiaComum = (idade < 21) && (saldoNaConta >= 50.00);
        System.out.println("Pode comprar meia comum? " + podeComprarMeiaComum); // true

        // Exemplo 2: Operador Lógico || (OU)
        // Regra: Tem direito ao desconto se tiver menos de 18 anos OU possuir carteira
        // de estudante
        boolean temDescontoEspecial = (idade < 18) || temCarteiraEstudante;
        System.out.println("Tem desconto especial? " + temDescontoEspecial); // true

        // Exemplo 3: Operador Lógico ! (NÃO) e operador != (Diferente)
        boolean contaBloqueada = false;
        // Se a conta NÃO estiver bloqueada E o saldo for diferente de zero
        boolean podeFazerPix = !contaBloqueada && (saldoNaConta != 0);
        System.out.println("Pode fazer PIX? " + podeFazerPix); // true
    }
}
