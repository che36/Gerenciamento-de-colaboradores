public class Vendedor {
    private String nome;
    private String documento;
    private Endereco endereco;
    private Double valorSalario;
    private Double valorBonificacao;

    public Vendedor(String nome, String documento, Endereco endereco, Double valorSalario) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.valorSalario = valorSalario;
    }

    public Vendedor() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public Double getValorBonificacao() {
        return valorBonificacao;
    }

    public void setValorBonificacao(Double valorBonificacao) {
        this.valorBonificacao = valorBonificacao;
    }
}

