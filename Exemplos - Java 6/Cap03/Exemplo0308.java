import javax.swing.*;
class Exemplo0308
{
    public static void main (String args[])
    {
        Thread tempo; //criando um objeto (tempo) para controle de tempo
        tempo = new Thread();
        tempo.start();
        int a,b;
        for (a = 0; a <= 10; a++)
        {
            System.out.print(a + " ");
        }
        System.out.println();
        for (a = 50; a >= 0; a = a - 5)
        {
            System.out.print(a + " ");
        }
        System.out.println();
        for ( a = 10; a >= -10; a = a - 2)
        {
            System.out.print(a + " ");
            for(b = 0; b < 500; b++);
        }
        System.out.println();
        int h, m, s;
        System.out.println("Para encerrar o relogio pressione CTRL + C");
        for(h = 0; h < 24; h++)
            for(m = 0; m < 60; m++)
                for(s = 0; s < 60; s++)
                {
                    System.out.println(h + ":" + m + ":" + s);
                    try
                    {
                        tempo.sleep(1000);
                        if (s == 5)
                            System.exit(0);
                    }
                    catch (InterruptedException erro)
                    {
                        JOptionPane.showMessageDialog(null, "Erro");
                    }
                }
    }
}