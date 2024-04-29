import java.util.Scanner;

public class Contador{
    public static void main(String[] args) {
       Scanner terminal = new Scanner(System.in);
       
       System.out.println("Digite o primeiro valor.");
       int parametroUm = terminal.nextInt();
       System.out.println("Digite o primeiro valor.");
       int parametroDois = terminal.nextInt();
       terminal.close();
       
       try {
        contar(parametroUm, parametroDois);

       } catch (ParametrosInvalidosException exception) {
        System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
       }

    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            for (int i = parametroUm; i <= parametroDois; i++) {
                System.out.println(i);               
            }
        }
    }

    static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException() {
           
        }
    }
}
