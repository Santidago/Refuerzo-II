import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] media={5, 7, 4, 3, 1, 6};
        System.out.println(mediana(media));

    }
    public static double mediana(int[] numeros){
        Arrays.sort(numeros);
        double mediana;
        if (numeros.length%2==0){
            mediana=((float) (numeros[numeros.length / 2] + numeros[(numeros.length / 2)-1]) /2);
        }else{
            mediana=numeros[numeros.length/2];
        }
        return mediana;
    }
}
