import java.util.Scanner;


public class Matrices {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("MATRICES DIA 1");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        System.out.println("EJER 1");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();


        //1. Crear una matriz 3x3 y mostrarla.
        //Declara una matriz de enteros 3x3, asigna valores manualmente y muéstrala por pantalla.

        int[][] mUno = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for(int i = 0; i < mUno.length; i++){
            for(int j = 0; j < mUno[i].length; j++){
                System.out.print(mUno[i][j] + " ");
            }
            System.out.println();
        }





        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Matriz 2x4 con todos los valores en 1.
        //Usa bucles para llenarla y mostrarla.

        int[][] mDos = new int[2][4];

        for(int i = 0; i < mDos.length; i++){
            for(int j = 0; j < mDos[i].length; j++){
                mDos[i][j] = 1;
                System.out.print(mDos[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();


        //Matriz 4x4 con números del 1 al 16.
        //Rellena secuencialmente e imprime.

        int[][] mTres = new int[4][4];
        int c = 0;
        for(int i = 0; i < mTres.length; i++){
            for(int j = 0; j < mTres[i].length; j++){
                c++;
                mTres[i][j] = c;
                System.out.print(mTres[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();


        //Leer matriz 2x2 desde teclado.
        //Pide valores al usuario y muestra la matriz resultante.

        Scanner scanner = new Scanner(System.in);

        int[][] mCuatro = new int[2][2];

        for(int i = 0; i < mCuatro.length; i++){
            for(int j = 0; j < mCuatro[i].length; j++){
                //int n = scanner.nextInt();
                //mCuatro[i][j] = n;
                
            }
        }

        System.out.println();

        for(int i = 0; i < mCuatro.length; i++){
            for(int j = 0; j < mCuatro[i].length; j++){
                System.out.print(mCuatro[i][j] + " "+ " ");
            }


            System.out.println();
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();


        //Imprimir la diagonal principal de una matriz 3x3.

        int[][] mCinco = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int i = 0; i < mCinco.length; i++){
            for(int j = 0; j < mCinco[i].length; j++){
                if (i == j) {
                    System.out.print(mCinco[i][j] + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 6");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Imprimir la diagonal secundaria de una matriz 3x3.

        int[][] mSeis = {
            {1, 2, 3},
            {4, 5, 6},
            {7 , 8, 9}
        };

        for(int i = 0; i < mSeis.length; i++){
            for(int j = 0; j < mSeis[i].length; j++){
                if(i + j == mSeis.length - 1){
                    System.out.print(mSeis[i][j] + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 7");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Suma de todos los elementos de una matriz 3x3.
        //Muestra el resultado final
        
        int[][] mSiete = {

            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}

        };

        int suma = 0;

        for(int i = 0; i < mSiete.length; i++){
            for(int j = 0; j < mSiete[i].length; j++){
                suma += mSiete[i][j];
            }
        }

        System.out.println(suma);

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 8");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Promedio de todos los elementos de una matriz 3x3.
        //Devuelve un número decimal.

        int[][] mOcho = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int s = 0;
        int count = 0;

        for(int i = 0; i < mOcho.length; i++){
            for(int j = 0; j < mOcho[i].length; j++){
                s += mOcho[i][j];
                count++;
            }
        }

        double promedio = (double) s / count;
        System.out.println(promedio);

















































    }
}
