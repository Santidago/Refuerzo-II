public class Ejercicio9 {
    public static void main(String[] args) {
        int dividendo=5,divisor=6;
        System.out.println(dividendo+"!/"+divisor+"! = "+dividirFactoriales(dividendo, divisor));
    }
    public static int dividirFactoriales(int dividendo, int divisor){
        int resultado = 1;
        for (int i = dividendo; i > divisor; i--){
            resultado =resultado*i;
        }
       /* if (divisor>dividendo){
            resultado=resultado/divisor;
        }*/
        return resultado;
    }
}
