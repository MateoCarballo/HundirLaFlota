public class Main {
    public static void main(String[] args) {

        tablero miTablero =new tablero();



        miTablero.generarTablero(miTablero.tableroPartida);
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        miTablero.escribirMatriz(miTablero.tableroPartida);
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        miTablero.duplicarMatriz(miTablero.posicionesBarcos,miTablero.tableroPartida);
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        miTablero.escribirMatriz(miTablero.posicionesBarcos);
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        miTablero.generarFlota(miTablero.posicionesBarcos);
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        miTablero.escribirMatriz(miTablero.posicionesBarcos);
    }
}