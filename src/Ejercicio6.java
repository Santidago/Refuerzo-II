public class Ejercicio6 {
    public static void main(String[] args) {
        int num =1462;
        if (esHyperpar(num)){
            System.out.println("es Hyperpar");
        }else {
            System.out.println("no es Hyperpar");
        }

    }
    public static boolean esHyperpar(int num){
        String numeros=String.valueOf(num);
        String[] numero =  numeros.split("");
        boolean resultado=true;
        for (String numero1 : numero) {
            if(Integer.parseInt(numero1)%2!=0)
            {
                resultado=false;
                break;
            }
        }
        return resultado;
    }
}
