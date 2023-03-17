import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p1 = new Produto();

        System.out.println("Digite o nome do produto: ");
        p1.setNome(sc.next());

        System.out.println("Digite o código do produto: ");
        p1.setCodigo(sc.nextInt());

        System.out.println("Digite a quantidade do produto: ");
        p1.setQuantidade(sc.nextInt());

        System.out.println("Dados coletados com sucesso! \n" +
                "O nome do produto é " + p1.getNome() + ", seu código é " + p1.getCodigo() + ", e a quantidade do produto presente no estoque é de " + p1.getQuantidade());

        int venda = 1;
        System.out.println("Você deseja realizar uma venda? \n" +
                "Se você deseja realizar essa operação digite 1, se não, digite 0. ");
        String v = sc.next();
        switch (venda){
            case 0:
                System.out.println("Você não deseja realizar uma venda. Obrigada!");
                System.out.println("Encerrando o programa.");
                break;
            case 1:
                System.out.println("Você escolheu a opção para realizar uma venda.");
                System.out.println("Qual a quantidade que você deseja vender?");
                p1.setqVendida(sc.nextInt());
                p1.calculoDecremento();
                System.out.println("A quantidade de produto que você quer vender é: " + p1.getqVendida() +
                        ". Após a venda, a quantidade de produtos que existe no estoque é de: " + p1.getQuantidade());
                break;
        }
    }
}