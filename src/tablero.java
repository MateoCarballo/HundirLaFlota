

public class tablero {
    public static int filas=10;
    public static int columnas=filas;



    char [][] posicionesBarcos = new char[filas][columnas];

    char [][] tableroPartida = new char[filas][columnas];

    public tablero(int columnas,int filas) {
        this.filas=filas;
        this.columnas=columnas;

    }
    public tablero(){

    }

    public static void duplicarMatriz(char[][] miMatriz1,char[][] miMatriz2){
        for (int i = 0; i < miMatriz1.length ; i++) {
            for (int j = 0; j <miMatriz2[i].length; j++) {
                miMatriz1[i][j]=miMatriz2[i][j];
            }

        }
    }

    public static void generarTablero(char[][] miMatriz){

        for (int i = 0; i < miMatriz.length; i++) {
            for (int j = 0; j < miMatriz[i].length; j++) {
                if ((i==0)&(j==0)){
                    miMatriz[i][j]='-';
                }else if (j==0){
                    miMatriz[i][j]=Integer.toString(i).charAt(0);
                    /* Formas alternativas de meter un int en un char
                    Otras formas de hacer lo mismo
                    A-> El diez indica que es decimal si ponemos 16 nos daria el valor en hexadecimal
                    valido solo para numeros entre 0 y 9
                    B-> Pasamos el integer a String y el String a caracter.

                    A-> miMatriz[i][j]=Character.forDigit(miMatriz.length,10);
                    B->miMatriz[i][j]=Integer.toString(miMatriz.length).charAt(0);
                    miMatriz[i][j]=(char)j;

                     */
                } else if (i==0) {
                    miMatriz[i][j]=Integer.toString(j).charAt(0);
                }else{
                    miMatriz[i][j]='*';
                }
            }
        }
    }
    public static void generarFlota(char[][]miMatriz){
        //Empiezo en 1 para no comerme los índices de las filas y las columnas
        boolean barco =false;
        int contador=0;
        int contadorA=0;
        for (int i = 1; i < miMatriz.length ; i++) {
            for (int j = 1; j <miMatriz[i].length ; j++) {
                if (i%2==0){
                    if (contador == 0) {
                        barco = utilidadesMatematicas.booleanoAleatorio();
                    }

                    if (barco) {
                        miMatriz[i][j] = 'B';
                        contador++;
                    } else {
                        miMatriz[i][j] = '*';
                    }

                    if (contador >= 3) {
                        barco = false;
                        contador++;
                    }
                    if (contador == 5) {
                        contador = 0;
                    }

                }
            }
        }
    }
    public static void escribirMatriz(char[][]miMatriz){
        for (int i = 0; i < miMatriz.length; i++) {
            for (int j = 0; j < miMatriz[i].length; j++) {
                System.out.print(miMatriz[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }



//
/*
    ----------------------
    - * * * * * * * * * *-
    - * * * * * * * * * *-
    - * * * * * * * * * *-
    - * * * * * * * * * *-
    - * * * * * * * * * *-
    - * * * * * * * * * *-
    - * * * * * * * * * *-
    - * * * * * * * * * *-
    - * * * * * * * * * *-
    - * * * * * * * * * *-
    ----------------------
 */
}
