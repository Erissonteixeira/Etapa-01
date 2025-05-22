package DesafioIfElse.src.app;

import DesafioIfElse.src.model.Pessoa;
import DesafioIfElse.src.service.PessoaService;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome da pessoa:");


        String idadeStr = JOptionPane.showInputDialog(null, "Digite a idade de " + nome + ":");
        int idade = Integer.parseInt(idadeStr);


        Pessoa pessoa = new Pessoa(nome, idade);


        PessoaService service = new PessoaService();
        service.verificarMaioridade(pessoa);
    }
}

