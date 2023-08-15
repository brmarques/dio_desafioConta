// Classe ContaSalario.java
public class ContaSalario extends Conta {
    public ContaSalario(TipoConta tipoConta, TipoCliente tipoCliente, String dataAbertura, double saldo) {
        super(tipoConta, tipoCliente, dataAbertura, saldo);
    }

    public void calculaValorTarifaManutencao() {
        // Lógica específica para tarifa de manutenção de salário
    }
}
