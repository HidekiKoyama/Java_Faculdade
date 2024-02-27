
import javax.swing.JOptionPane;

public class Aluno {
    public String nome_aluno;
    public double nota1;
    public double nota2;
    
    public Aluno (){
     
    }

    public void CadastrarAluno(String nome, double nota1, double nota2){
        
        this.nome_aluno = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        
        JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
        
    }
    public void ExibiAluno(){
    
        JOptionPane.showMessageDialog(null,  "Nome: "+ this.nome_aluno+
                "\nNota 1: "+this.nota1+
                "\nNota 2: "+this.nota2);
    }
    public double CalcularMedia(){
        
        double media = (this.nota1 + this.nota2) / 2;
                
        return media;
    }
    public void ExibirSituacao(double media){
        
        if (media >= 5) {
            JOptionPane.showMessageDialog(null, "Aluno foi aprovado!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Aluno foi reprovado!");            
        }
    }
}