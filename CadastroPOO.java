package cadastropoo;

import model.*;
import java.io.IOException;

public class CadastroPOO {

    public static void main(String[] args) {
        try {
            
            PessoaFisicaRepo repo1 = new PessoaFisicaRepo();
            System.out.println("Dados de Pessoa Fisica Armazenados.");
            System.out.println("Dados de Pessoa Fisica Recuperados.");
            repo1.inserir(new PessoaFisica(1, "Ana", "11111111111", 25));
            repo1.inserir(new PessoaFisica(2, "Carlos", "22222222222", 52));
            repo1.persistir("pessoas_fisicas.dat");

            PessoaFisicaRepo repo2 = new PessoaFisicaRepo();
            repo2.recuperar("pessoas_fisicas.dat");
            for (PessoaFisica pessoa : repo2.obterTodos()) {
                pessoa.exibir();
            }

            
            PessoaJuridicaRepo repo3 = new PessoaJuridicaRepo();
            System.out.println("Dados de Pessoa Juridica Armazenados.");
            System.out.println("Dados de Pessoa Juridica Recuperados.");
            repo3.inserir(new PessoaJuridica(3, "XPTO Sales", "33333333333333"));
            repo3.inserir(new PessoaJuridica(4, "XPTO Solutions", "44444444444444"));
            repo3.persistir("pessoas_juridicas.dat");

            PessoaJuridicaRepo repo4 = new PessoaJuridicaRepo();
            repo4.recuperar("pessoas_juridicas.dat");
            for (PessoaJuridica pessoa : repo4.obterTodos()) {
                pessoa.exibir();
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
          
        }
            
    }}

    