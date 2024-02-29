
public class ContaCorrente {

    Mensagens ms = new Mensagens();

    String nome_correntista;
    String banco;
    int agencia;
    int conta;
    double saldo;

    public void CadastrarConta(String nm_corr, String bc, int ag, int conta) {
        this.nome_correntista = nm_corr;
        this.banco = bc;
        this.agencia = ag;
        this.conta = conta;
        ms.cadSucesso();
    }

    public void depositar(double sd) {
        this.saldo += sd;
    }

    public void sacar(double sd) {
        if (sd > this.saldo) {
            ms.msgSaldoInsulficiente();
        } else {
            this.saldo -= sd;
        }
    }

    public void exibir() {
        ms.exibirCadastroBc(this.nome_correntista, this.banco, this.conta, this.agencia);
    }

    public void consultarSaldo() {
        ms.msgSaldo(this.saldo);
    }
}
