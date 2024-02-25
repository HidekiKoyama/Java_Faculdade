
import javax.swing.JOptionPane;

public class Mensagem {

    public void MensagemCadSucesso(){
        
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        
    }
    public void MensagemCadErro(){
        
        JOptionPane.showMessageDialog(null, "Errro ao realizar Cadastro!");

    }
    public void MensagemCadSenhaErro(){

        JOptionPane.showMessageDialog(null, "Senha já Cadastrada!");
    }
}
