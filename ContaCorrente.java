// Classe ContaCorrente.java
public class ContaCorrente extends Conta {
    public ContaCorrente(TipoConta tipoConta, TipoCliente tipoCliente, String dataAbertura, double saldo) {
        super(tipoConta, tipoCliente, dataAbertura, saldo);
    }

    public void calculaValorTarifaManutencao() {
        // Lógica específica para tarifa de manutenção de conta corrente
    }
}
