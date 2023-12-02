import modelo.Endereco;
import modelo.Gerente;
import modelo.OperadordeCaixa;
import modelo.Vendedor;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua 1", "Bairro", "Complemento");
        Vendedor vendedor = new Vendedor("César", "213465", endereco, 100d);
        vendedor.calculaBonificacao(0.1);
        OperadordeCaixa operadorDeCaixa = new OperadordeCaixa("Operador de Caixa", "123456", endereco, 123456d);
        System.out.println(vendedor);
        System.out.println(operadorDeCaixa);

        Gerente gerente = new Gerente();
        gerente.setNome("modelo.Gerente");
        gerente.setDocumento("11.11.11");
        gerente.setHorasTrabalhadas(40);
        gerente.setValorHora(50d);
        gerente.setEndereco(endereco);
        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(0.2);
        System.out.println(gerente);
    }
}
