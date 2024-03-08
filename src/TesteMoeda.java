import java.util.Scanner;

public class TesteMoeda {
    public static void main(String[] args) {
       //classe objeto
        Scanner leitor = new Scanner(System.in);
        Moeda moeda = new Moeda();

        System.out.println("informe o valor em reais: R$ ");
        moeda.valorReal = leitor.nextDouble();

        System.out.println("informe a cotação do dólar de hoje: ");
        moeda.cotacaoDolar = leitor.nextDouble();

        moeda.calcularConversao();
        System.out.println("sua quantidade de dolar é: " + moeda.quantidadeDolar);

        System.out.println(moeda.retornarCalculoConversao());
    }
}
