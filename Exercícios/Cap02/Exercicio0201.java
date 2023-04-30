package exerciciosCap2;
import javax.swing.JOptionPane;

public class Exercicio0201 {
  public static void main(String args[]) {
    String aux = " ";
    float nota1 = 0, nota2 = 0, trabalho = 0, media = 0;
    try {
      aux = JOptionPane.showInputDialog(null, "Entre com a nota 1: ");
      nota1 = Float.parseFloat(aux);

      aux = JOptionPane.showInputDialog(null, "Entre com a nota 2: ");
      nota2 = Float.parseFloat(aux);

      aux = JOptionPane.showInputDialog(null, "Entre com a nota do trabalho: ");
      trabalho = Float.parseFloat(aux);

      media = (nota1 + nota2 + trabalho) / 3;
      JOptionPane.showMessageDialog(null, "Media: " + media);
    } catch (NumberFormatException erro) {
      System.out.println("Erro na conversao, digite apenas caracteres numericos");
    }
    System.exit(0);
  }
}