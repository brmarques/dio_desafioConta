// Classe ContaInvestimento.java
public class ContaInvestimento extends Conta {
    public ContaInvestimento(TipoConta tipoConta, TipoCliente tipoCliente, String dataAbertura, double saldo) {
        super(tipoConta, tipoCliente, dataAbertura, saldo);
    }

    public void calculaValorTarifaManutencao() {
        // Lógica específica para tarifa de manutenção de investimento
    }
}
