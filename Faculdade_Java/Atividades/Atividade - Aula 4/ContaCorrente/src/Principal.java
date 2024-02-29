
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        JFrame janela = new Menu();
        janela.setVisible(true);
        janela.setBackground(Color.black);
    }
    /*

        nome_correntista = JOptionPane.showInputDialog("Digite o nome do correntista: ");
        banco = JOptionPane.showInputDialog("Digite o nome do banco: ");
        agencia = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da agencia: "));
        num_conta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: "));

        cc.CadastrarConta(nome_correntista, banco, agencia, num_conta);

        cc.exibir();

        cc.consultarSaldo();

        cc.depositar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja depositar: ")));

        cc.consultarSaldo();

        cc.sacar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja sacar: ")));

        cc.consultarSaldo();
     */
}
