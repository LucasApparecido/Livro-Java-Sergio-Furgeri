import javax.swing.*;
class Exemplo0303
{
    public static void main (String args[])
    {
        String aux1 = JOptionPane.showInputDialog(null, "Forneca o valor do primeiro numero:");
        if (aux1 == null)
            System.exit (0);
        String aux2 = JOptionPane.showInputDialog(null, "Forneca o valor do segundo numero:");
        if (aux2 == null)
            System.exit (0);
        try
        {
            int num1 = Integer.parseInt(aux1);
            int num2 = Integer.parseInt(aux2);
            JOptionPane.showMessageDialog(null, "Soma: " + (num1 + num2));
            JOptionPane.showMessageDialog(null, "Subtracao: " + (num1 - num2));
            JOptionPane.showMessageDialog(null, "Multiplicacao: " + (num1 * num2));
            JOptionPane.showMessageDialog(null, "Divisao: " + (num1 + num2));
        }
        catch(ArithmeticException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro divisao por zero!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException erro)
        {
            JOptionPane.showMessageDialog(null, "Digite apenas valores numericos inteiros", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            JOptionPane.showMessageDialog(null, "Fim da execucao");
        }
        System.exit (0);
    }
}