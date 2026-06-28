package Java.OOP.Classes.Test;

import Java.OOP.Classes.Dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Luis";
        pessoa.idade = 21;
        pessoa.sexo = 'M';

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.sexo);
    }
}
