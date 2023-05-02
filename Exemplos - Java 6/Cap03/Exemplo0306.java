class Exemplo0306
{
    public static void main (String args[])
    {
        int x = 10, y = 0, z = 0;
        try
        {
            z = x / y;// gera uma exceção aritmética de divisão por zero
        }
        catch (Exception Erro)
        {
            System.out.println(Erro.getMessage()); //mostra a mensagem de erro
            Erro.printStackTrace(); //mostra a exceção e a linha onde  ocorreu o erro
        }
    }
}