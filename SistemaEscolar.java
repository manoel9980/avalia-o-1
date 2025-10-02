import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];

        System.out.println("Digite as 8 notas anuais:");

        // Entrada das notas
        for (int i = 0; i < 8; i++) {
            System.out.printf("Nota %d: ", i + 1);
            notas[i] = scanner.nextDouble();
        }

        // Cálculo das médias bimestrais (simplesmente as notas que já temos)
        double b1 = notas[0];
        double b2 = notas[1];
        double b3 = notas[2];
        double b4 = notas[3];
        double b5 = notas[4];
        double b6 = notas[5];
        double b7 = notas[6];
        double b8 = notas[7];

        // Médias semestrais: 4 notas por semestre
        double semestre1 = (b1 + b2 + b3 + b4) / 4.0;
        double semestre2 = (b5 + b6 + b7 + b8) / 4.0;

        // Média final (média das médias semestrais)
        double mediaFinal = (semestre1 + semestre2) / 2.0;

        // Apresentando os resultados
        System.out.println("\nPráticas\n");
        System.out.printf("1o Bimestre: %.1f\n", b1);
        System.out.printf("2o Bimestre: %.1f\n", b2);
        System.out.printf("3o Bimestre: %.1f\n", b3);
        System.out.printf("4o Bimestre: %.1f\n", b4);
        System.out.printf("1o Semestre: %.1f\n", semestre1);
        System.out.println("----------------------");
        System.out.printf("5o Bimestre: %.1f\n", b5);
        System.out.printf("6o Bimestre: %.1f\n", b6);
        System.out.printf("7o Bimestre: %.1f\n", b7);
        System.out.printf("8o Bimestre: %.1f\n", b8);
        System.out.printf("2o Semestre: %.1f\n", semestre2);
        System.out.println("-----------------------");
        System.out.printf("Média Final: %.1f\n", mediaFinal);

        scanner.close();
    }
}
