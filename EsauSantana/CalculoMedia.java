public class CalculoMedia {
    public static void main(String[] args) {
        double[] notas = {7.5, 6.9, 8.5};
        
        double soma = 0;

        for (double temporario : notas) {
            soma += temporario;   
        }

        double media = soma / notas.length;
        System.out.printf("A media é: %.2f", media);

    }
}
