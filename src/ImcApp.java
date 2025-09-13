public class ImcAapp {

    public static void main(String[] args) {
        System.out.println("Executando o aplicativo...");

        Imc imcDoPedro = new Imc();
        Imc imcDaFernanda = new Imc();

        imcDoPedro.obterDados();
        imcDaFernanda.obterDados();


    }


}