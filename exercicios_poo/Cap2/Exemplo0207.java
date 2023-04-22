import java.io.*;
public class Exemplo0207 {
    public static void main(String args[]) {
      String s = "";
      float nota1 = 0, nota2 = 0, trabalho = 0, media = 0;
      BufferedReader dado;
      try{
        System.out.println("Entre com a nota 1: ");
        dado = new BufferedReader(new InputStreamReader(System.in));
        s = dado.readLine();
        nota1 = Float.parseFloat(s);

        System.out.println("Entre com a nota 2: ");
        dado = new BufferedReader(new InputStreamReader(System.in));
        s = dado.readLine();
        nota2 = Float.parseFloat(s);

        System.out.println("Entre com a nota do trabalho: ");
        dado = new BufferedReader(new InputStreamReader(System.in));
        s = dado.readLine();
        trabalho = Float.parseFloat(s);

        media = (nota1 + nota2 + trabalho) / 3;
        System.out.println("Media = " + media);
      }
      catch (IOException erro) {
        System.out.println("Erro na entrada de dados");
      }
      catch (NumberFormatException erro) {
        System.out.println("Erro na conversao, digite apenas caracteres numericos");
      }
    }
}