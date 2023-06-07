import java.util.Scanner;

public class CalculadoraPratica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Calculadora pessoa1 = new Calculadora();

        System.out.println("Digite o seu nome");
        String nome = input.nextLine();
        System.out.println("Informe o tipo de regime de pagamento\n\n1.CLT\n2.Horista\n3.PJ");
        String regimeDePagamento = input.nextLine();

        switch (regimeDePagamento) {
            case "1":
                System.out.println("Digite seu salário mensal: ");
                double salarioMensal = input.nextDouble();
                System.out.println("O salário de " + nome + " é de " + pessoa1.regimeCLT(salarioMensal) + " R$ por mês");
                break;
            case "2":
                System.out.println("Digite o preço da sua hora: ");
                double valorHora = input.nextDouble();
                System.out.println("Digite as horas trabalhadas: ");
                double horasTrabalhadas = input.nextDouble();
                System.out.println("O salário de " + nome + " é de " + pessoa1.regimeHorista(valorHora, horasTrabalhadas) + " R$");
                break;
            case "3":
                System.out.println("Digite o valor do contrato: ");
                double valorDoContrato = input.nextDouble();
                System.out.println("O salário de " + nome + " é de " + pessoa1.regimePJ(valorDoContrato) + " R$");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        input.close();
    }
}
