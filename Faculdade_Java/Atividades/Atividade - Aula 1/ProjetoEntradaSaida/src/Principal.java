
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String nome;
        int idade;
        double salario;
        
        nome = JOptionPane.showInputDialog("Me diga qual é seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Me diga qual é sua idade: "));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Me diga qual é sua salario: "));
    
        JOptionPane.showMessageDialog(null, "Seu nome é "+nome);
        JOptionPane.showMessageDialog(null, "Sua idade é "+idade);
        JOptionPane.showMessageDialog(null, "Seu salario é "+salario);
    }    
}
