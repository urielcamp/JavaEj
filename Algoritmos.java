public class Algoritmos {
    public static void main(String[] args) {
        

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("ALGORITMOS DIA 1 -- BUSQUEDA SECUENCIAL");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        System.out.println("EJER 1");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Buscar un número en un arreglo y decir si está o no.

        int[] aUno = {1, 9, 3, 4, 5, 6, 7, 11, 8, 10};

        boolean esta = true;
        int nUno = 8;

        for(int i = 0; i < aUno.length; i++){
            if (aUno[i] == nUno) {
                esta = true;
                System.out.println(nUno + " esta en el arreglo en la posicion " + i);
                break;
            }else{
                esta = false;
            }

        }

        if (!esta) {
            System.out.println(nUno + " no esta en el arreglo");
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Contar cuántas veces aparece un número en un arreglo.

        int[] aDos = {1, 2, 3, 4, 3, 4, 5, 6, 6, 6, 6, 7, 8};
        int nDos = 3;
        int cDos = 0;


        for(int i = 0; i < aDos.length; i++){
            if (aDos[i] == nDos) {
                cDos++;
            }
        }

        System.out.println("El numero " + nDos + " aparece " + cDos + " veces en el array");

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Encontrar la posición de la primera aparición de un número.

        int[] aTres = {3, 1, 2, 3, 3, 4, 6, 3};
        int nTres = 3;

        for(int i = 0; i < aTres.length; i++){
            if (aTres[i] == nTres) {
                System.out.println(nTres + " aparece por primera vez en la posicion " + i);
                break;
            }
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Encontrar la posición de la última aparición de un número.

        int[] aCuatro = {1, 2, 3, 4, 5, 2, 46};
        int nCuatro = 2;

        for(int i = aCuatro.length - 1; i >= 0; i--){
            if(aCuatro[i] == nCuatro){
                System.out.println(nCuatro + " aparece en la posicion " + i + " por ultima vez");
                break;
            }
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Determinar si un arreglo contiene solo números positivos.

        int[] aCinco = {1, 2, 3, 4, 5};
        boolean nPositivosCinco = true;

        for(int i = 0; i < aCinco.length; i++){
            if (aCinco[i] < 0) {
                nPositivosCinco = false;
                System.out.println("El array tiene numero negativos");
                break;
            }
        }

        if (nPositivosCinco) {
            System.out.println("El array solo tiene numeros positivos");
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 6");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Determinar si un arreglo contiene algún número negativo.


        int[] aSeis = {1, 2, -3, 4, -5};

        for(int i = 0; i < aSeis.length; i++){
            if (aSeis[i] < 0) {
                System.out.println("El array contiene el numero " + aSeis[i]);
            }
        }






    }
}
