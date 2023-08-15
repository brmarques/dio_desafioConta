// Classe ContaPoupanca.java
public class ContaPoupanca extends Conta {
    public ContaPoupanca(TipoConta tipoConta, TipoCliente tipoCliente, String dataAbertura, double saldo) {
        super(tipoConta, tipoCliente, dataAbertura, saldo);
    }
    
    public void calculaValorTarifaManutencao() {
        // Lógica específica para tarifa de manutenção de poupança
    }
}
