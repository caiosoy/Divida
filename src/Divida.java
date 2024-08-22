import java.util.Scanner;

public class Divida {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o valor inicial do débito: ");
        double debito = sc.nextDouble();


        System.out.print("Digite a quantidade de meses: ");
        int meses = sc.nextInt();


        System.out.print("Digite a taxa de juros mensal (%): ");
        double juros = sc.nextDouble();


// Converte a taxa de juros de porcentagem para decimal
        double jurosMensal = juros / 100;


// Calcula o valor dos juros
        double valor = débito * jurosMensal * meses;


// Calcula o valor final da dívida
        double vlFinal = débito + valor;


// Exibe o valor final da dívida
        System.out.println("Valor da dívida após " + meses + " meses: R$ " + vlFinal);


        sc.close();


    }
}
