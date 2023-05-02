class Exemplo0309
{
    public static void main (String args[])
    {
        Thread tempo; //criando um objeto (tempo) para controle de tempo
        tempo = new Thread();
        tempo.start();
        int a;
        try
        {
            a = Integer.parseInt(args[0]);
            while(a >= 0)
            {
                System.out.println(" " + a);
                tempo.sleep(1000);
                a--;
            }
            System.out.println("Fim da primeira Contagem");
            System.out.println(); //pula uma linha
            tempo.sleep(1000);
            do
            {
                System.out.println(" " + a);
                tempo.sleep(1000);
                a++;
            }
            while(a > 0);
            System.out.println("Fim da segunda Contagem");
        }
        catch (ArrayIndexOutOfBoundsException erro) //se não digitar um argumento
        {
            System.out.println("Digite um argumento!");
        }
        catch (InterruptedException erro) //se ocorrer um erro de interrupção
        {
            System.out.println("Algo interrompeu a contagem!");
        }
        catch (NumberFormatException erro) //se não digitar um número inteiro
        {
            System.out.println("Não foi fornecido um numero inteiro valido!"); //se o argumento for invalido
        }
    }
}