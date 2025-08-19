import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Matrices {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("MATRICES DIA 1 -- FUNDAMENTOS DE MATRICES");
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


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 9");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        // Número mayor en una matriz 3x3.

        int[][] mNueve = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int max = mNueve[0][0];

        for(int i = 0; i < mNueve.length; i++){
            for(int j = 0; j < mNueve[i].length; j++){
                if (mNueve[i][j] >= max) {
                    max = mNueve[i][j];
                }
            }
        }

        System.out.println(max);


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 10");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Número menor en una matriz 3x3.
        //Encuentra y muestra el valor más pequeño.

        int[][] mDiez = {
            {1, 2, 3},
            {4, -5, 6},
            {7, 8, 9}
        };

        int min = mDiez[0][0];

        for(int i = 0; i < mDiez.length; i++){
            for(int j = 0; j < mDiez[i].length; j++){
                if (mDiez[i][j] <= min) {
                    min = mDiez[i][j];
                }
            }
        }

        System.out.println(min);


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 11");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        // Tabla del 5 en una matriz 3x3.

        int[][] mOnce = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int i = 0; i < mOnce.length; i++){
            for(int j = 0; j < mOnce[i].length; j++){
                mOnce[i][j] *= 5;
                System.out.print(mOnce[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 12");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Mostrar solo las esquinas de una matriz 4x4.
        //Los demás valores se muestran como 0.
        
        int[][] mDoce = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
            
        };

        for(int i = 0; i < mDoce.length; i++){
            for(int j = 0; j < mDoce[i].length; j++){
                if((i == 0 && j == mDoce.length - 1) || (i == mDoce.length - 1 && j == 0) || (i == 0 && j == 0) || (i == mDoce.length - 1 && j == mDoce.length - 1)){
                    System.out.print(mDoce[i][j] + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }




        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("MATRICES DIA 2 -- RECORRIDOS Y TRANSFORMACIONES");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();


        System.out.println("EJER 1");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Suma de elementos de cada fila en una matriz 3x3.


        int[][] maUno = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };



        for(int i = 0; i < maUno.length; i++){
            int sFila = 0;
            for(int j = 0; j < maUno[i].length; j++){
                sFila += maUno[i][j];
                
            }
            System.out.println("Suma fila 1: " + sFila);
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Suma de elementos de cada columna en una matriz 3x3.

        int[][] maDos = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        

        for(int i = 0; i < maDos.length; i++ ){
            int sColumna = 0;
            for(int j = 0; j < maDos[i].length; j++){
                sColumna += maDos[j][i];
            }
            System.out.println(sColumna);
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Intercambiar primera fila con la última en una matriz 4x4.

        int[][] maTres = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int[][] auxTres = new int[maTres.length][maTres.length];

        for(int i = 0; i < maTres.length; i++){
            for(int j = 0; j < maTres[i].length; j++){
                if(i == 0){
                    auxTres[i][j] = maTres[maTres.length - 1][j];
                }else if(i == maTres.length - 1){
                    auxTres[maTres.length - 1][j] = maTres[0][j];
                }else{
                    auxTres[i][j] = maTres[i][j];
                }

                //maTres[maTres.length - 1 - i][j] = maTres[i][j];
                //maTres[0][j] = maTres[maTres.length - 1 - i][j];
            }
        }


        for(int i = 0; i < auxTres.length; i++){
            for(int j = 0; j < auxTres[i].length; j++){
                System.out.print(auxTres[i][j] + " ");
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

        //Intercambiar primera columna con la última, 4x4.

        int[][] maCuatro = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int[][] auxCuatro = new int[maCuatro.length][maCuatro.length];

        for(int i = 0; i < maCuatro.length; i++){
            for(int j = 0; j < maCuatro[i].length; j++){
                if(j == maCuatro.length - 1){
                    auxCuatro[i][maCuatro.length - 1] = maCuatro[i][0]; 
                }else if(j == 0){
                    auxCuatro[i][j] = maCuatro[i][maCuatro.length - 1];
                }else{
                    auxCuatro[i][j] = maCuatro[i][j];
                }
            }
        }

        for(int i = 0; i < auxCuatro.length; i++){
            for(int j = 0; j < auxCuatro[i].length; j++){
                System.out.print(auxCuatro[i][j] + " ");
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

        //Llenar una matriz 5x5 con 1 en la diagonal principal y 0 en el resto.

        int[][] maCinco = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        for(int i = 0; i < maCinco.length; i++){
            for(int j = 0; j < maCinco[i].length; j++){
                if(i == j){
                    maCinco[i][j] = 1;
                }else{
                    maCinco[i][j] = 0;
                }

                System.out.print(maCinco[i][j] + " ");
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

        //Llenar una matriz 5x5 con 1 en la diagonal secundaria y 0 en el resto.

        
        int[][] maSeis = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        for(int i = 0; i < maSeis.length; i++){
            for(int j = 0; j < maSeis[i].length; j++){
                if (i + j == maSeis.length - 1) {
                    maSeis[i][j] = 1;
                }else{
                    maSeis[i][j] = 0;
                }
                System.out.print(maSeis[i][j] + " ");
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

        //Rotar una matriz 3x3 90° a la derecha.

        int[][] maSiete = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] auxSiete = new int[maSiete.length][maSiete.length];

        for(int i = 0; i < maSiete.length; i++){
            for(int j = 0; j < maSiete[i].length; j++){
                auxSiete[j][maSiete.length - i - 1] = maSiete[i][j];
            }
        }

        for(int i = 0; i < maSiete.length; i++){
            for(int j = 0; j < maSiete[i].length; j++){
                System.out.print(auxSiete[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 8");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Rotar una matriz 3x3 90° a la izquierda.

        int[][] maOcho = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] auxOcho = new int[maOcho.length][maOcho.length];

        for(int i = 0; i < maOcho.length; i++){
            for(int j = 0; j < maOcho[i].length; j++){
                auxOcho[i][j] = maOcho[j][maOcho.length - i - 1];
                System.out.print(auxOcho[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 9");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Reflejar una matriz 4x4 horizontalmente.

        int[][] maNueve = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int[][] auxNueve = new int[maNueve.length][maNueve.length];

        for(int i = 0; i < maNueve.length; i++){
            for(int j = 0; j < maNueve[i].length; j++){
                auxNueve[i][maNueve.length - j - 1] = maNueve[i][j];
            }
        }

        for(int i = 0; i < maNueve.length; i++){
            for(int j = 0; j < maNueve[i].length; j++){
                System.out.print(auxNueve[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 10");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Reflejar una matriz 4x4 verticalmente.

        int[][] maDiez = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int[][] auxDiez = new int[maDiez.length][maDiez.length];

        for(int i = 0; i < maDiez.length; i++){
            for(int j = 0; j < maDiez[i].length; j++){
                auxDiez[maDiez.length - i - 1][j] = maDiez[i][j]; 
            }
        }

        for(int i = 0; i < auxDiez.length; i++){
            for(int j = 0; j < auxDiez[i].length; j++){
                System.out.print(auxDiez[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 11");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Llenar matriz 3x3 con números aleatorios y contar cuántos son pares.

        int[][] maOnce = new int[3][3];

        Random random = new Random();
        int paresOnce = 0;

        for(int i = 0; i < maOnce.length; i++){
            for(int j = 0; j < maOnce[i].length; j++){
                int aleatorio = random.nextInt(100);
                maOnce[i][j] = aleatorio;

                if(maOnce[i][j]%2 == 0){
                    paresOnce++;
                }

                System.out.print(maOnce[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println(paresOnce);

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 12");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Cambiar todos los números negativos de una matriz por 0.

        int[][] maDoce = {
            {1, 2, 3, -4},
            {5, 6, 7, 8},
            {9, 10, -11, 12},
            {-13, 14, 15, 16}
        };

        for(int i = 0; i <  maDoce.length; i++){
            for(int j = 0; j < maDoce[i].length; j++){
                if(maDoce[i][j] <= 0){
                    maDoce[i][j] = 0;
                }
                System.out.print(maDoce[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("MATRICES DIA 3 -- OPERACIONES INTERMEDIAS");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();


        System.out.println("EJER 1");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Sumar dos matrices 3x3.

        int[][] matUnoA = {

            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}

        };


        int[][] matUnoB = {

            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}

        };


        int n = matUnoB.length;

        int[][] auxMatUno = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                auxMatUno[i][j] = matUnoB[i][j] + matUnoA[i][j];
                System.out.print(auxMatUno[i][j] + " ");
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

        //Restar dos matrices 3x3.

        int[][] matDosA = {

            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}

        };


        int[][] matDosB = {

            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}

        };

        int[][] auxMatDos = new int[matDosB.length][matDosB.length];

        for(int i = 0; i < matDosB.length; i++){
            for(int j = 0; j < matDosB.length; j++){
                auxMatDos[i][j] = matDosB[i][j] - matDosA[i][j];
                System.out.print(auxMatDos[i][j] + " ");
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

        //Multiplicar dos matrices 2x2.

        int[][] matTresA ={

            {1, 2},
            {1, 2},

        };

        int[][] matTresB ={

            {1, 2},
            {1, 2},

        };

        int[][] auxMatTres = new int[matTresA.length][matTresB.length];

        for(int i = 0; i < matTresA.length; i++){
            for(int j = 0; j < matTresA.length; j++){
                auxMatTres[i][j] = matTresA[i][j] * matTresB[i][j];
                System.out.print(auxMatTres[i][j] + " ");
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

        //Calcular la transpuesta de una matriz 3x3.

        int[][] matCuatro = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int i = 0; i < matCuatro.length; i++){
            for(int j = 0; j < matCuatro[i].length; j++){
                System.out.print(matCuatro[j][i] + " ");
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

        //Suma de elementos en la mitad superior de la diagonal principal.

        int[][] matCinco = {

            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}

        };

        for(int i = 0; i < matCinco.length; i++){
            for(int j = 0; j < matCinco[i].length; j++){

                if (i == j) {
                    if (j <= (matCinco.length - 1) / 2) {
                        matCinco[i][j] += matCinco[i][j];
                    }
                }

                System.out.print(matCinco[i][j] + " ");
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

        //Suma de elementos en la mitad inferior de la diagonal principal.

        int[][] matSeis = {

            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}

        };

        for(int i = 0; i < matSeis.length; i++){
            for(int j = 0; j < matSeis.length; j++){

                if(i == j){
                    if(j > (matSeis.length - 1)/2){
                        matSeis[i][j] += matSeis[i][j];
                    }
                }

                System.out.print(matSeis[i][j] + " ");
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

        //Llenar matriz 5x5 con números consecutivos y contar múltiplos de 3.

        int[][] matSiete = {

            {123, 12, 32, 43, 52},
            {62, 71, 84, 93, 101},
            {1123, 122, 113, 14, 15},
            {16, 17, 18, 9, 20},
            {241, 242, 233, 214, 25}

        };

        int mulTres = 0;
        int countSiete = 1;

        for(int i = 0; i < matSiete.length; i++){
            for(int j = 0; j < matSiete[i].length; j++){

                matSiete[i][j] = countSiete;
                countSiete++;

                if(matSiete[i][j]%3 == 0){
                    mulTres++;
                }
                
                System.out.print(matSiete[i][j] + " ");
            }
            System.out.println();
            
        }

        System.out.println("La matriz del ejercicio siete tiene " + mulTres + " Multiplos de 3");


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 8");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Llenar matriz con patrón:
            //1 0 1  
            //0 1 0  
            //1 0 1

        int[][] matOcho = new int[5][5];

        for(int i = 0; i < matOcho.length; i++){
            for(int j = 0; j < matOcho[i].length; j++){
                if(i == j){
                    matOcho[i][j] = 1;
                }else if(i + j == matOcho.length - 1){
                    matOcho[i][j] = 1;
                }else{
                    matOcho[i][j] = 0;
                }
            }
        }

                for(int i = 0; i < matOcho.length; i++){
            for(int j = 0; j < matOcho[i].length; j++){
                System.out.print(matOcho[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 9");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Determinar si una matriz cuadrada es simétrica.

        int[][] matNueve = {

            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}

        };

        boolean esSimetrica = true;

        for(int i = 0; i< matNueve.length; i++){
            for(int j = 0; j < matNueve[i].length; j++){
                if(matNueve[i][j] == matNueve[j][i]){
                    esSimetrica = true;
                }else{
                    esSimetrica = false;
                    break;
                }
            }
        }

        if(esSimetrica){
            System.out.println("La matriz es simetrica");
        }else{
            System.out.println("No es simetrica");
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 10");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Tablero de ajedrez 8x8 con 1 y 0 alternados.

        int[][] matDiez = new int[8][8];

        for(int i = 0; i < matDiez.length; i++){
            for(int j = 0; j < matDiez[i].length; j++){
                if ( i%2 == 0 && j%2 == 0) {
                    matDiez[i][j] = 1;
                }else if(i%2 != 0 && j%2 != 0){
                    matDiez[i][j] = 1;
                }else{
                    matDiez[i][j] = 0;
                }

                System.out.print(matDiez[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 11");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Suma de diagonales principal y secundaria.

        int[][] matOnce = {

            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {12, 13, 14, 15}

        };

        for(int i = 0; i < matOnce.length; i++){
            for(int j = 0; j < matOnce[i].length; j++){
                if(i == j){
                    matOnce[i][j] += matOnce[i][j];
                }else if(i + j == matOnce.length - 1){
                    matOnce[i][j] += matOnce[i][j];
                }

                System.out.print(matOnce[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 12");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Contar elementos mayores al promedio de toda la matriz.

        int[][] matDoce = {

            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}

        };

        int sumDoce = 0;
        int cDoce = 0;
        int coDoce = 0;

        for(int i = 0; i < matDoce.length; i++){
            for(int j = 0; j < matDoce[i].length; j++){
                sumDoce += matDoce[i][j];
                cDoce++;
            }
        }

        double promDoce = (double) sumDoce / cDoce;

        for(int i = 0; i < matDoce.length; i++){
            for(int j = 0; j < matDoce[i].length; j++){
                if(promDoce < matDoce[i][j]){
                    coDoce++;
                }
            }
        }

        System.out.println(promDoce);
        System.out.println(coDoce);





        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("MATRICES DIA 4 -- PATRONES Y RETOS");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();


        System.out.println("EJER 1");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Matriz 5x5 con una X de 1 y resto 0.

        int[][] matrUno = new int[5][5];

        for(int i = 0; i < matrUno.length; i++){
            for(int j = 0; j < matrUno[i].length; j++){
                if(i == j){
                    matrUno[i][j] = 1;
                }else if(j + i == matrUno.length - 1){
                    matrUno[i][j] = 1;
                }else
                matrUno[i][j] = 0;
            }
        }

        for(int i = 0; i < matrUno.length; i++){
            for(int j = 0; j < matrUno[i].length; j++){
                System.out.print(matrUno[i][j] + " ");
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

        //Matriz 5x5 con borde de 1 y resto 0

        int[][] matrDos = new int[5][5];

        for(int i = 0; i < matrDos.length; i++){
            for(int j = 0; j < matrDos[i].length; j++){
                if(j == 0 || i == 0 || j == matrDos.length - 1 || i == matrDos.length - 1){
                    matrDos[i][j] = 1;
                }else{
                    matrDos[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < matrDos.length; i++){
            for(int j = 0; j < matrDos[i].length; j++){
                System.out.print(matrDos[i][j] + " ");
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

        //Matriz triangular superior con 1 y resto 0. 5x5

        int[][] matrTres = new int[5][5];

        for(int i = 0; i < matrTres.length; i++){
            for(int j = 0; j < matrTres[i].length; j++){

                if(j == i){
                    matrTres[i][j] = 1;
                }else if(j - i > 0){
                    matrTres[i][j] = 1;
                }else if(i < matrTres.length - 4){
                    matrTres[i][j] = 1;
                }else{
                    matrTres[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < matrTres.length; i++){
            for(int j = 0; j < matrTres[i].length; j++){
                System.out.print(matrTres[i][j] + " ");
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

        //Matriz triangular inferior con 1 y resto 0.

        int[][] matrCuatro = new int[5][5];

        for(int i = 0; i < matrCuatro.length; i++){
            for(int j = 0; j < matrCuatro[i].length; j++){
                if(i == j){
                    matrCuatro[i][j] = 1;
                }else if(i - j > 0){
                    matrCuatro[i][j] = 1;
                }
            }
        }

        for(int i = 0; i < matrCuatro.length; i++){
            for(int j = 0; j < matrCuatro[i].length; j++){
                System.out.print(matrCuatro[i][j] + " ");
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

        //Llenar matriz espiral 4x4 con números del 1 al 16.

        int[][] matrCinco = new int[4][4];
        
        int num = 1;

        int top = 0, bottom = matrCinco.length - 1;
        int left = 0, right = matrCinco[0].length - 1;

        while (top <= bottom && left <= right) {
            
            for (int j = left; j <= right; j++) {
                matrCinco[top][j] = num++;
            }
            top++;

            
            for (int i = top; i <= bottom; i++) {
                matrCinco[i][right] = num++;
            }
            right--;

                        if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    matrCinco[bottom][j] = num++;
                }
                bottom--;
            }

            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrCinco[i][left] = num++;
                }
                left++;
            }

        }

        for(int i = 0; i < matrCinco.length; i++){
            for(int j = 0; j < matrCinco[i].length; j++){
                System.out.print(matrCinco[i][j] + " ");
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

        //Llenar matriz serpenteante (zig-zag).

        int[][] matrSeis = new int[4][4];
        int nSeis = 1;

        for(int i = 0; i < matrSeis.length; i++){
            for(int j = 0; j < matrSeis[i].length; j++){
                if(i == 0){ 
                    matrSeis[i][j] = nSeis;
                    nSeis++;
                }else if(i%2 != 0){
                    
                    matrSeis[i][matrSeis.length - j - 1] = nSeis;
                    nSeis++;
                }else if(i%2 == 0){
                    matrSeis[i][j] = nSeis;
                    nSeis++;
                }
            }
        }

        for(int i = 0; i < matrSeis.length; i++){
            for(int j = 0; j < matrSeis[i].length; j++){
                System.out.print(matrSeis[i][j] + " ");
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

        //Contar cuántos números son palíndromos

        int[][] matrSiete = {
            {1, 2, 33},
            {22, 4, 5},
            {11, 23, 4}
        };

        int palindomo = 0;

        for(int i = 0; i < matrSiete.length; i++){
            
            for(int j = 0; j < matrSiete[i].length; j++){
                String numero = String.valueOf(matrSiete[i][j]);
                for(int k = 0; k < numero.length(); k++){
                    char charNumero = numero.charAt(k);
                    if (numero.length() > 1 && charNumero == numero.charAt(numero.length() - k - 1)) {
                        
                        System.out.println(matrSiete[i][j] + " Es palindromo");
                        palindomo++;
                        System.out.println();
                    }
                }
            }
        }

        System.out.println("Hay " + palindomo/2 + " numero palindromos en la matriz");

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 8");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Matriz donde cada elemento sea la suma de su fila + columna.

        int[][] matrOcho = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int[] sumFila = new int[matrOcho.length];
        int[] sumColum = new int[matrOcho[0].length];

        for(int i = 0; i < matrOcho.length; i++){
            for(int j = 0; j < matrOcho.length; j++){
                        sumFila[i] += matrOcho[i][j];
                        sumColum[i] += matrOcho[j][i];
                
            }
        }

        for(int i = 0; i < matrOcho.length; i++){
            for(int j = 0; j < matrOcho[i].length; j++){
                matrOcho[i][j] = sumFila[i] + sumColum[j];
                System.out.print(matrOcho[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 9");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Matriz con potencias de 2.

        int[][] matrNueve = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int i = 0; i < matrNueve.length; i++){
            for(int j = 0; j < matrNueve[i].length; j++){
                matrNueve[i][j] = matrNueve[i][j] * matrNueve[i][j];
                System.out.print(matrNueve[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 10");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Matriz con valores de la secuencia Fibonacci.

        int[][] matrDiez = new int[5][5];

        
        int[] fiboDiez = new int[matrDiez.length * matrDiez.length];

        fiboDiez[0] = fiboDiez[1] = 1;

        for(int i = 2; i < matrDiez.length * matrDiez.length; i++){
            
                fiboDiez[i] = fiboDiez[i - 1] + fiboDiez[i - 2];
            
        }

        System.out.println(Arrays.toString(fiboDiez));
        System.out.println();

        int index = 0;

        for(int i = 0; i < matrDiez.length; i++){
            for(int j = 0; j < matrDiez[i].length; j++){
                if(index < fiboDiez.length){
                    matrDiez[i][j] = fiboDiez[index++];
                    
                }
            }
        }


        for(int i = 0; i < matrDiez.length; i++){
            for(int j = 0; j < matrDiez[i].length; j++){
                System.out.print(matrDiez[i][j] + " ");
        }
            System.out.println();
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 11");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Patrón diagonal doble.

        int[][] matrOnce = new int[5][5];

        for(int i = 0; i < matrOnce.length; i++){
            for(int j = 0; j < matrOnce[i].length; j++){
                if(i == j){
                    matrOnce[i][j] = 1;
                }else if(i + j == matrOnce.length - 1){
                    matrOnce[i][j] = 1;
                }else{
                    matrOnce[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < matrOnce.length; i++){
            for(int j = 0; j < matrOnce[i].length; j++){
                System.out.print(matrOnce[i][j] + " ");
            
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 12");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Dibujar letra “H” en matriz 5x5 con 1.

        int[][] matrDoce = new int[5][5];

        for(int i = 0; i < matrDoce.length; i++){
            for(int j = 0; j < matrDoce[i].length; j++){
                if (j == 0 || j == matrDoce.length - 1) {
                    matrDoce[i][j] = 1;
                }

                if(i == (matrDoce.length - 1) / 2){
                    matrDoce[i][j] = 1;
                }
            }
        }

        for(int i = 0; i < matrDoce.length; i++){
            for(int j = 0; j < matrDoce[i].length; j++){
                System.out.print(matrDoce[i][j] + " ");
            }
            System.out.println();
        }



        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("MATRICES DIA 5 -- RETOS FINALES");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();


        System.out.println("EJER 1");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        
        //Rotar matriz N×N 180°.

        int[][] matrizUno = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] auxUno = new int[matrizUno.length][matrizUno[0].length]; 

        for(int i = 0; i < matrizUno.length; i++){
            for(int j = 0; j < matrizUno.length; j++){
                auxUno[i][j] = matrizUno[matrizUno.length - i - 1][matrizUno.length - j - 1];
                
                System.out.print(auxUno[i][j] + " ");
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

        //Rotar matriz N×N 270°.

        int[][] matrizDos = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] auxDos = new int[matrizDos.length][matrizDos[0].length];
        for(int i = 0; i < matrizDos.length; i++){
            for(int j = 0; j < matrizDos[i].length; j++){
                auxDos[i][j] = matrizDos[j][matrizDos.length - i - 1];
                System.out.print(auxDos[i][j] + " ");
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

        //Multiplicación de matrices NxM × MxP.

        int[][] matrizTresA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrizTresB = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };


        for(int i = 0; i < matrizTresA.length; i++){
            for(int j = 0; j < matrizTresA[i].length; j++){
                matrizTresA[i][j] *= matrizTresB[i][j];
                System.out.print(matrizTresA[i][j] + " "); 
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

        //Verificar si dos matrices son iguales.

        int[][] matrizCuatroA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrizCuatroB = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 94}
        };

        boolean iguales = true;
        for(int i = 0; i < matrizCuatroA.length; i++){
            for(int j = 0; j < matrizCuatroA[i].length; j++){
                if (matrizCuatroA[i][j] != matrizCuatroB[i][j]) {
                    iguales = false;
                }
            }
        }

        if (iguales) {
            System.out.println("Las matrices son iguales");
        }else{
            System.out.println("Son distintas");
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Generar un laberinto simple (paredes = 1, caminos = 0).

        int[][] laberinto = new int[5][5];

        for(int i = 0; i < laberinto.length; i++){
            for(int j = 0; j < laberinto[i].length; j++){
                if (j == 0 && i == 0) {
                    laberinto[i][j] = 0;
                }else if (j == 0 && i == 1){
                    laberinto[i][j] = 0;
                }else if(i == 1 && j < 3){
                    laberinto[i][j] = 0;
                }else if(i == 2 && j == 2 ||i == 3 && j == 2){
                    laberinto[i][j] = 0;
                }else if(i == 3 && j == 1 || i == 4 && j == 1){
                    laberinto[i][j] = 0;
            }else{
                laberinto[i][j] = 1;
            }
        }
    }

        for(int i = 0; i < laberinto.length; i++){
            for(int j = 0; j < laberinto[i].length; j++){
                System.out.print(laberinto[i][j] + " ");
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

        //Buscar un número en matriz ordenada.

        int[][] matrizSeis = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 1}
        };

        int nMSeis = 90; 
        boolean esta = false;
        int fila = 0;
        int columna = 0;

        for(int i = 0; i < matrizSeis.length; i++){
            for(int j = 0; j < matrizSeis[i].length; j++){
                if (matrizSeis[i][j] == nMSeis) {
                    esta = true;
                    fila = i;
                    columna = j;
                    System.out.println(nMSeis + " Esta en la fila " +  i + " y columna " + j + " de la matriz");
                }
            }
        }

        if (!esta) {
            System.out.println(nMSeis + " No esta en la matriz");
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 7");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Sumar diagonal principal y restar la secundaria.

        int[][] matrizSiete = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
        int sumaPrincipal = 0;
        int restaSecundaria = 0;
        for(int i = 0; i < matrizSiete.length; i++){
            for(int j = 0; j < matrizSiete[i].length; j++){
                if(i == j){
                    sumaPrincipal += matrizSiete[i][j];
                }

                if(j + i == matrizSiete.length - 1){
                    restaSecundaria = matrizSiete[i][j] - restaSecundaria; 
                }
            }
        }

        System.out.println(sumaPrincipal);
        System.out.println(restaSecundaria);


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 8");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Intercambiar dos filas específicas.

        int[][] matrizOcho = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int filaA = 0;
        int filaB = 3;
        int auxiliarOcho = 0; 

        for(int i = 0; i < matrizOcho.length; i++){
            for(int j = 0; j < matrizOcho[i].length; j++){
                if (i == filaA) {
                    auxiliarOcho = matrizOcho[filaA][j];
                    matrizOcho[filaA][j] = matrizOcho[filaB][j]; 
                    matrizOcho[filaB][j] = auxiliarOcho;
                }
                    
            
            
                System.out.print(matrizOcho[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 9");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Intercambiar dos columnas específicas.

        int[][] matrizNueve = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int columnaA = 0;
        int columnaB = 3;

        int auxiliarNueve = 0;

        for(int i = 0; i < matrizNueve.length; i++){
            for(int j = 0; j < matrizNueve[i].length; j++){

                if(j == columnaA){

                
                auxiliarNueve = matrizNueve[i][columnaA];
                matrizNueve[i][columnaA] = matrizNueve[i][columnaB];
                matrizNueve[i][columnaB] = auxiliarNueve;
                }
                System.out.print(matrizNueve[i][j] + " ");
            }
            System.out.println();
        }



        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 10");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();


        //Determinar si la matriz es identidad.


        int[][] matrizDiez = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 1, 1}
        };

        boolean identidad = true;
        for(int i = 0; i < matrizDiez.length; i++){
            for(int j = 0; j < matrizDiez[i].length; j++){
                if(i == j){
                    if (matrizDiez[i][j] != 1) {
                        identidad = false;
                    }
                }
                if( i != j){
                    if(matrizDiez[i][j] != 0){
                        identidad = false;
                    }
                }
            }
        }

        if (identidad) {
            System.out.println("La matriz es identidad");
        }else{
            System.out.println("La matriz no es identidad");
        }













































    }
}
