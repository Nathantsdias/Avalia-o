package Avaliação;

import java.util.Scanner;

public class Avaliação {
    Scanner sc = new Scanner(System.in);

    public void Operações() {
        System.out.println("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        System.out.println("Escolha uma operação:1(*),2(+),3(/),4(-):");
        String operacao = sc.next();

        double resultado = 0;

        switch (operacao) {
            case "1":
                resultado = numero1 * numero2;
                break;
            case "2":
                resultado = numero1 + numero2;
                break;
            case "3":
                resultado = numero1 / numero2;
                break;
            case "4":
                resultado = numero1 - numero2;
                break;
        }
        System.out.println("O resultado da operação é: " + resultado);
    }

    public void SorteiodeTime() {

        System.out.println("Digite o número de matrícula do aluno: ");

        int matricula = sc.nextInt();
        int time = matricula % 4 ;
        System.out.print("O aluno de matrícula " + matricula + " foi designado para o ");
        switch (time) {
            case 1:
                System.out.println("Time do Chris.");
                break;
            case 2:
                System.out.println("Time do Greg.");
                break;
            case 3:
                System.out.println("Time do Caruso.");
                break;
            case 4:
                System.out.println("Time do Jerome.");
                break;
            default:
                System.out.println("inválido.");
        }
    }
    public void DescontosFrutas() {
        System.out.println("Quantidade de morangos (em kg): ");
        double morangos = sc.nextDouble();
        
        System.out.println("Quantidade de maçãs (em kg): ");
        double macas = sc.nextDouble();
        
        System.out.println("Quantidade de bananas (em kg): ");
        double bananas = sc.nextDouble();
        
        double valorTotal = morangos * 2.5 + macas * 1.8 + bananas * 1.3;
        
        if (valorTotal > 25 || (morangos + macas + bananas) > 8) {
            valorTotal *= 0.9; 
        }
        
        System.out.printf("Valor a ser pago: R$ %.2f", valorTotal);
    }
}