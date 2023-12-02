package modelo;

import modelo.CalculaBonificacao;
import modelo.Endereco;
import modelo.FuncionarioCLT;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {
    private Double valorBonificacao;

    public Vendedor() {

    }

    public Vendedor(String nome, String documento, Endereco endereco, Double valorSalario) {
        super(nome, documento, endereco, valorSalario);
    }

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = super.getValorSalario() * porcentagemBonificacao;
    }

    public Double getValorBonificacao() {
        return valorBonificacao;
    }

    public void setValorBonificacao(Double valorBonificacao) {
        this.valorBonificacao = valorBonificacao;
    }

    @Override
    public String toString() {
        return "modelo.Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", modelo.Endereco=" + endereco.getBairro() +
                ", valorSalario=" + valorSalario +
                "valorBonificacao=" + valorBonificacao +
                '}';
    }


}

