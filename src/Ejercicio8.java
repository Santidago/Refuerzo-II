import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] numeros={4, 5, 2, 1};
        System.out.println(cualFalta(numeros));
    }
    public static int cualFalta(int[] numeros){
        Arrays.sort(numeros);
        int j=0;
        for (int i = numeros[0]; i<(numeros[0]+numeros.length); i++){
            if (!(numeros[j] == i)){
                return i;
            }
            j++;
        }
        return -1;
    }
}
