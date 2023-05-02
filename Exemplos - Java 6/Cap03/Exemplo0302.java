import javax.swing.*;
class Exemplo0302
{
    public static void main (String args[])
    {
        String aux = JOptionPane.showInputDialog(null, "Forneca um numero inteiro entre 0 e 9");
        if (aux != null)
            try
            {
                int x = Integer.parseInt(aux);
                String extenso = " ";
                switch (x)
                {
                    case 0: extenso = "zero"; break;
                    case 1: extenso = "um"; break;
                    case 2: extenso = "dois"; break;
                    case 3: extenso = "três"; break;
                    case 4: extenso = "quatro"; break;
                    case 5: extenso = "cinco"; break;
                    case 6: extenso = "seis"; break;
                    case 7: extenso = "sete"; break;
                    case 8: extenso = "oito"; break;
                    case 9: extenso = "nove"; break;
                    default: extenso = "numero desconhecido";
                }
                JOptionPane.showMessageDialog(null, "Número fornecido: " + extenso);
                
            }
            catch(NumberFormatException erro)
            {
                JOptionPane.showMessageDialog(null, "Digite apenas valores numericos inteiros");
            }
        System.exit (0);
    }
}