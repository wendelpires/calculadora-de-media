package calculadora.executavel;

import javax.swing.JOptionPane;

public class CalculadoraMedia {

	public static void main(String[] args) {
	    
		String nota1 = JOptionPane.showInputDialog("Informe a primeira nota.");
	    String nota2 = JOptionPane.showInputDialog("Informe a segunda nota.");
	    String nota3 = JOptionPane.showInputDialog("Informe a terceira nota.");
	    String nota4 = JOptionPane.showInputDialog("Informe a quarta nota.");
	    
	    double dNota1 = Double.parseDouble(nota1);
	    double dNota2 = Double.parseDouble(nota2);
	    double dNota3 = Double.parseDouble(nota3);
	    double dNota4 = Double.parseDouble(nota4);
	    
	    double media = ((dNota1 + dNota2 + dNota3 + dNota4)/4);
	    
	    /* Média para aprovação é 70.00 */
	    
	    if (media >= 50) {
	    	
	        if (media >= 70) {
	           JOptionPane.showMessageDialog(null, "ALUNO APROVADO! MÉDIA: " + media + " PONTOS");  
	        }else {
	    	    JOptionPane.showMessageDialog(null, "ALUNO EM RECUPERAÇÃO! MÉDIA: " + media + " PONTOS");
	        }
	    } else {
	    JOptionPane.showMessageDialog(null, "ALUNO REPROVADO! MÉDIA: " + media + " PONTOS");
	    }
    }
}
