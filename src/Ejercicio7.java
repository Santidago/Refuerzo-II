public class Ejercicio7 {
    public static void main(String[] args) {
        int desde=99,hasta=7;
        System.out.println(canales(desde,hasta));
    }
    public static int canales(int desde, int hasta){
        int subiendo=hasta-desde,bajando=0;
        if (desde>hasta){
            bajando=desde-hasta-99;
        }else {
            bajando=hasta-desde-99;
        }
        if(subiendo<0){
            subiendo=-subiendo;
        }if (bajando<0){
            bajando=-bajando;
        }
        if(subiendo>bajando){
            return bajando;
        }else {
            return subiendo;
        }
    }
}
