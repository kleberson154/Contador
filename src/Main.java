import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro numero: ");
            int paramUm = sc.nextInt();
            System.out.println("Digite o segundo numero: ");
            int paramDois = sc.nextInt();
            contar(paramUm, paramDois);
        } catch (ParametroInvalidosException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Encerrando o programa...");
        }
        sc.close();
    }

    public static void contar(int paramUm, int paramDois) throws ParametroInvalidosException{
        if (paramUm >= paramDois){
            throw new ParametroInvalidosException("O primeiro numero deve ser menor que o segundo");
        }

        int contador = paramDois - paramUm;
        for (int i = 1; i <= contador; i++){
            System.out.println("Imprimindo o numero " + i);
        }
    }
}