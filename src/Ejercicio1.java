
import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros={9,7,6,5,4};
        System.out.println(orden(numeros));

    }
    public static String orden(int[] array) {
       boolean chek=true;
       int[]sorted=Arrays.copyOf(array,array.length);
       Arrays.sort(sorted);
        for (int j : array) {
            if (!(array[0] == j)) {
                chek = false;
                break;
            }
        }
        if (chek) {
            return "Iguales";
        } else if (Arrays.equals(array,sorted ))
            {
                return "Ascendente";
            }
        for (int i = 0; i < sorted.length/2; i++) {
            int flip=sorted[i];
            sorted[i]=sorted[sorted.length-1-i];
            sorted[sorted.length-1-i]=flip;
        }
        if (Arrays.equals(array,sorted )) {
            return "Descendente";
        }else{
            return "Desordenado";
        }
    }
}
