
import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        String nome;
        double nota1;
        double nota2;
        
        nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ");
        
        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota do aluno: "));
        
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota do aluno: "));
        
        aluno.CadastrarAluno(nome, nota1, nota2);
        
        aluno.ExibirSituacao(aluno.CalcularMedia());
        
        aluno.ExibiAluno();

    }
    
}
