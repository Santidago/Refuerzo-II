public class Ejercicio10 {
    public static void main(String[] args) {
        int compartimentos=5, maxLitros=300, diferencia=10;
        System.out.println("El total de litros es "+litros(compartimentos,maxLitros,diferencia));

    }
    public static int litros(int compartimentos, int maxLitros, int diferencia){
        int restos=0;
        int litros=0;
        for(int i=0;i<compartimentos;i++){
            litros=litros+maxLitros-restos;
            restos=restos+diferencia;
        }
        return litros;
    }
}
