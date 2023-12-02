package modelo;

import modelo.Endereco;
import modelo.FuncionarioCLT;

public class OperadordeCaixa extends FuncionarioCLT {

    public OperadordeCaixa(String nome, String documento, Endereco endereco, Double valorSalario) {
        super(nome, documento, endereco, valorSalario);
    }

    public OperadordeCaixa() {
    }

    @Override
    public String toString() {
        return "modelo.OperadordeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + endereco.getRua() +
                ", valorSalario=" + valorSalario +
                '}';
    }
}
