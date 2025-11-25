import java.util.Arrays;

public class MatricesExamen {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("MATRICES EXAMEN");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        System.out.println("EJER 1 ");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //contar pares

        int[][] mUno = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10}
                };
        
                int count = 0;

                for(int i = 0; i < mUno.length; i++){
                    for (int j = 0; j < mUno[i].length; j++){
                        if (mUno[i][j]%2 == 0) {
                            count++;
                        }
                    }
                }

                System.out.println(count);



        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

                //Contar cuántos elementos de la matriz son mayores que 0.


        int[][] matrizDos = {
            {1, 2, 3, 0 ,4, 0},
            {0, 0, 0, 0}
        };

        int cDos = 0;

        for(int i = 0; i < matrizDos.length; i++){
            for(int j = 0; j < matrizDos[i].length; j++){
                if (matrizDos[i][j] > 0) {
                    cDos++;
                }
            }
        }

        System.out.println(cDos);


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Sumar todos los elementos de la matriz.

        int[][] matrizTres = {
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 100}
        };

        int resTres = 0;

        for(int i  = 0; i < matrizTres.length; i++){
            for(int j = 0; j < matrizTres[i].length; j++){
                resTres += matrizTres[i][j];
            }
        }

        System.out.println(resTres);
        


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //encontrar mayor y menor en una matriz y colocarlos en otra array;


        int[][] matrizCuatro = {
            {1, 2, 3, 4, 5, 6},
            {7, 8, 9, 10, 11, 12}
        };

        int[] auxCuatro = new int[2];
        int max = matrizCuatro[0][0];
        int min = matrizCuatro[0][0];

        for(int i = 0; i < matrizCuatro.length; i++){
            for(int j = 0; j < matrizCuatro[i].length; j++){
                if (max < matrizCuatro[i][j]) {
                    max = matrizCuatro[i][j];
                }
                auxCuatro[0] = max;

                if (min > matrizCuatro[i][j]) {
                    min = matrizCuatro[i][j];
                }
                auxCuatro[1] = min;
            }
        }

        

        System.out.println(Arrays.toString(auxCuatro));


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Calcular el promedio de todos los valores de una matriz.

        int[][] matrizCinco = {
            {1, 11, 121, 1142},
            {12, 1, 1, 1231},
            {451, 1, 1, 231}
            
    
    };

    int countCinco = 0;
    int sumCinco = 0;
    double resultCinco = 0.0;

    for(int i = 0; i < matrizCinco.length; i++){
        for(int j = 0; j < matrizCinco[i].length; j++){
            sumCinco += matrizCinco[i][j];

            countCinco++;
        }
    }

    resultCinco = (double) sumCinco / countCinco;

    System.out.println(resultCinco);

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 6");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Contar cuántos elementos son múltiplos de 5.

        int[][] matrizSeis = {
            {1, 2, 3, 4, 5},
            {25, 15, 13, 10},
            
        };

        int countSeis = 0;

        for(int i = 0; i < matrizSeis.length; i++){
            for(int j = 0; j < matrizSeis[i].length; j++){
                if (matrizSeis[i][j] %5 ==0) {
                    countSeis++;
                }
                
            }
        }

        System.out.println(countSeis);


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 7");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Contar cuántos elementos hay en la matriz

        int[][] matrizSiete = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10}
        };

        int countSiete = 0;

        for(int i = 0; i < matrizSiete.length; i++){
            for(int j = 0; j < matrizSiete[i].length; j++){
                countSiete++;
            }
        }

        System.out.println(countSiete);


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 8");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Contar cuantos pares e impares hay en una matriz

        int[][] matrizOcho = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 11}
        };

        int countPares = 0;
        int countImpares = 0;

        int[] auxOcho = new int[2];

        for(int i = 0; i < matrizOcho.length; i++){
            for(int j = 0; j < matrizOcho[i].length; j++){
                if (matrizOcho[i][j] % 2 == 0) {
                    countPares++;
                }else{
                    countImpares++;
                }
            }
        }

        auxOcho[0] = countPares;
        auxOcho[1] = countImpares;

        System.out.println(Arrays.toString(auxOcho));













}
}