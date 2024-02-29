
import javax.swing.JOptionPane;


public class Mensagens {
    
    public void cadSucesso(){
        
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
    }
    
    public void exibirCadastroBc(String nm,String bc ,int cc, int ag){    
    
        JOptionPane.showMessageDialog(null, "Nome do cliente: "+nm+
                "\nBanco: "+bc+
                "\nConta: "+cc+
                "\nAgencia: "+ag);      
    }
    public void msgSaldo(double sd){
        
        JOptionPane.showMessageDialog(null, "Seu saldo é: "+sd);
        
    }
    public void msgSaldoInsulficiente(){
        
        JOptionPane.showMessageDialog(null, "Seu saldo é insulficiente! ");
        
    }
    
    
    
}
