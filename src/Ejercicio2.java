import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int dia,mes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte dia y mes");
        dia= sc.nextInt();
        mes= sc.nextInt();
        System.out.println(diasHastaNochevieja(dia,mes));
    }
    public static int diasHastaNochevieja(int dia,int mes) {
        int[] Tmes={31,28,31,30,31,30,31,31,30,31,30,31};
        dia=-dia;
        for (int i=mes-1;i<Tmes.length;i++) {
            dia+=Tmes[i];
        }
        return dia;
    }
}
