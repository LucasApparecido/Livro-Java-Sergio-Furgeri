class Exemplo0305
{
    public static void main (String args[])
    {
        try
        {
            System.out.print("Como aprender ");
            throw new Exception("MinhaExecao");
        }
        catch (Exception MinhaExecao)
        {
            System.out.print("a linguagem Java?");
        }
    }
}