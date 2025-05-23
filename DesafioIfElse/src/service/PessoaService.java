package DesafioIfElse.src.service;

import DesafioIfElse.src.model.Pessoa;

public class PessoaService {
    public void verificarMaioridade(Pessoa pessoa) {
        if (pessoa.eMaiorIdade()) {
            System.out.println(pessoa.getNome() + " é maior de idade.");
        } else {
            System.out.println(pessoa.getNome() + " não é maior de idade.");
        }
    }
}

