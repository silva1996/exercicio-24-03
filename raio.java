import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        final double pi = 3.14;
        double raio;
        System.out.println("Digite o valor do raio");
        raio = leia.nextDouble();
        double diâmetro = 2*raio;
        double perímetro = 2*pi*raio;
        double área = pi*Math.pow(raio,2);
        
        System.out.println("diâmetro = "+diâmetro+" perímetro ="+perímetro+"área="+área);
    }
}
