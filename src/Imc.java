import java.util.Scanner;

public class Imc {

    int peso;
    int altura;
    double imc;
    String nome;

    public void obterDados (){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        nome = leitor.nextLine();

        System.out.println(nome + ", digite o seu peso:");
        peso = leitor.nextInt();

        System.out.println("Legal! " + nome + ", agora, digite a sua altura: ");
        altura = leitor.nextInt();
        calcularImc();

    }

    public void calcularImc(){
        double alturaEmMetros = altura / 100.0;
        imc = peso / (alturaEmMetros * alturaEmMetros);
        exibirResultado();
    }

    public void exibirResultado(){
        System.out.println("***********************************");
        System.out.println("NOME: " + nome);
        System.out.println("PESO: " + peso);
        System.out.println("ALTURA: " + altura);
        System.out.println("IMC: " + imc);
        System.out.println("***********************************");
    }

}