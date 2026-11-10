import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] lista= {1, 3, 5, 5, 5, 3, 2, 1, 3, 3, 5, 5};
        System.out.println(moda(lista));
    }
    public static int moda(int[] numeros){
        Arrays.sort(numeros);
        int resultado = numeros[0], contador=0,contadorr=-1;
        for(int i=1;i<numeros.length;i++){
            if(!(numeros[i] ==numeros[i-1])){
                contador=0;
            }else {
                contador++;
            }
            if(contador>contadorr){
                resultado=numeros[i];
                contadorr=contador;
            }
        }
        return resultado;
    }
}