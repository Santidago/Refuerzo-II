public class Ejercicio3 {
    public static void main(String[] args) {
        String numero="1597";
        System.out.println(sumaDigitos(numero));
    }
    public static String sumaDigitos(String num){
        String[] numeros = num.split("");
        int suma = 0;
        String resultado =  numeros[0];
        for(String numero : numeros){
            suma += Integer.parseInt(numero);
        }
        for (int i = 1; i < numeros.length ; i++) {
            resultado = String.join(" + ", resultado,numeros[i]);
        }
        return resultado+" = "+suma;
    }
}