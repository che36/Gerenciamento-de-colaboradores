public class Vendedor extends FuncionarioCLT {
    private Double valorBonificacao;

    public Vendedor() {

    }

    public Vendedor(String nome, String documento, Endereco endereco, Double valorSalario) {
        super(nome, documento, endereco, valorSalario);
    }

    public Double getValorBonificacao() {
        return valorBonificacao;
    }

    public void setValorBonificacao(Double valorBonificacao) {
        this.valorBonificacao = valorBonificacao;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + endereco +
                ", valorSalario=" + valorSalario +
                '}';
    }
}

