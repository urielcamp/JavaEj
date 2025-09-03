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


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 7");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Buscar un carácter en un arreglo de caracteres

        char[] aSiete = {'a', 'e', 'i', 'o', 'u'};
        char nSiete = 'a';
        boolean eSiete = false;

        for(int i = 0; i < aSiete.length; i++){
            if (aSiete[i] == nSiete) {
                eSiete = true;
                System.out.println("el caracter " + nSiete + " esta en la posicion " + i);
                break;
            }
        }

        if (!eSiete) {
                System.out.println("El caracter no esta en el arreglo");
            }

            

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 8");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Buscar una palabra en un arreglo de Strings.

        String[] aOcho = {"Yo", "Tu", "El", "Nosotros"};
        String nOcho = "Yo";
        boolean eOcho = true;

        for(int i = 0; i < aOcho.length; i++){
            if (aOcho[i] == nOcho) {
                eOcho = false;
                System.out.println("La palabra " +   nOcho + " esta en el array");
                break;
            }
        }

        if (eOcho) {
            System.out.println("La palabra no esta en el array");
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 9");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Encontrar el número mayor en un arreglo.

        int[] aNueve = {1, 2, 33, 4, 2, 56, 6};
        int mayorNueve = aNueve[0];


        for(int i = 0; i < aNueve.length; i++){
            if (aNueve[i] >= mayorNueve) {
                mayorNueve = aNueve[i];
            }
        }

        System.out.println(mayorNueve);

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 10");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        int[] aDiez = {1, 2, -34, 56, 2, 0, -9, 32};
        int menorDiez = aDiez[0];

        for(int i = 0; i < aDiez.length; i++){
            if (aDiez[i] <= menorDiez) {
                menorDiez = aDiez[i];
            }
        }

        System.out.println(menorDiez);


        
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("ALGORITMOS DIA 2 -- BUSQUEDA BINARIA");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 1");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Implementar búsqueda binaria para un número en un arreglo ordenado.

        int[] arUno = {1, 2, 3, 4, 5};

        int mUno = 2;

        int lowUno = 0;
        int highUno = arUno.length - 1;

        boolean bUno = true;

        while (lowUno<=highUno) {
            int mid = lowUno + (highUno - lowUno) / 2;
            if (arUno[mid] == mUno) {
                System.out.println("se encontro el elemento" + " " + arUno[mid]);
                bUno = false;
                break;
            }else if(arUno[mid] < mUno){
                lowUno = mid + 1;
            }else {
                highUno = mid - 1;
            }
            
        }

        if (bUno) {
            System.out.println("Elemento no encontrado");
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Contar cuántas comparaciones se realizan en una búsqueda binaria.

        int[] arDos = {1, 22, 23, 3, 4, 3, 2, 22, 21};

        int lowDos = 0;
        int highDos = arDos.length - 1;

        int mDos = 21;
        int conDos = 0;

        while (lowDos <= highDos) {
            int mid = lowDos + (highDos - lowDos) / 2;
            if (arDos[mid] == mDos) {
                System.out.println("Elemento " + mDos + " encontrado");
                break;
            }else if(arDos[mid] < mDos){
                lowDos = mid + 1;
            }else{
                highDos = mid - 1;
            }
            conDos++;
        }

        System.out.println(conDos);


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Usar búsqueda binaria para encontrar el índice de un número.

        int[] arTres = {1, 2, 3, 4, 5, 6, 7, 8};

        int lowTres = 0;
        int highTres = arTres.length - 1;

        int mTres = 8;

        int indice = 0;


        while (lowTres <= highTres) {
            int mid = lowTres + (highTres - lowTres) / 2;
            if (arTres[mid] == mTres) {
                indice = mid;
                break;
            }else if(arTres[mid] < mTres){
                lowTres = mid + 1;
            }else if(arTres[mid] > mTres){
                highTres = mid - 1;
            }
        }

        System.out.println(indice);


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Modificar la búsqueda binaria para encontrar la primera aparición de un número repetido.

        int[] arCuatro = {1, 2, 3, 4, 4, 5, 6, 6, 6, 7, 8, 9};

        int lowCuatro = 0;
        int highCuatro = arCuatro.length - 1;

        int mCuatro = 6;
        int indCuatro = -1;

        while(lowCuatro <= highCuatro) {
            int mid = lowCuatro + (highCuatro - lowCuatro) / 2;

            if (arCuatro[mid] == mCuatro) {
                indCuatro = mid;
                highCuatro = mid - 1;
            }else if(arCuatro[mid] < mCuatro){
                lowCuatro = mid + 1;
            }else if(arCuatro[mid] > mCuatro){
                highCuatro = mid - 1;
            }
        }

        if (indCuatro != - 1) {
            System.out.println(mCuatro + " en posicion " + indCuatro);
        }else{
            System.out.println("no se encontro el numero");
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Modificar para encontrar la última aparición de un número repetido.

        int[] arCinco = {1, 2, 2, 2, 3, 4, 5, 6, 7, 8, 8, 8};

        int lowCinco = 0;
        int highCinco = arCinco.length - 1;

        int mCinco = 2;
        int ixCinco = -1;

        while (lowCinco <= highCinco) {
            int mid = lowCinco + (highCinco - lowCinco) / 2;
            if (arCinco[mid] == mCinco) {
                //System.out.println("encontrado");
                ixCinco = mid;
                lowCinco = mid + 1;
                break;
            }else if(arCinco[mid] < mCinco){
                //System.out.println("No encontrado");
                lowCinco = mid - 1;
            }else if(arCinco[mid] > mCinco){
                //System.out.println("Casi encontrado");
                highCinco = mid + 1;
            }
        }

        if (ixCinco != -1) {
            System.out.println(mCinco + " en la posicion " + ixCinco);
        }else{
            System.out.println("No se encontro el numero");
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 6");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Buscar un carácter en un arreglo de caracteres ordenado.

        char[] arSeis = {'a', 'e', 'i', 'o', 'u'};

        int lowSeis = 0;
        int highSeis = arSeis.length - 1;

        char mSeis = 'u';
        int ixSeis = -1;

        while (lowSeis <= highSeis) {
            int mid = lowSeis + (highSeis - lowSeis) / 2;
            if (arSeis[mid] == mSeis) {
                
                ixSeis = mid;
                break;
            }else if(arSeis[mid] < mSeis){
                
                lowSeis = mid + 1;
            }else if(arSeis[mid] > mSeis){
                
                highSeis = mid - 1;
            }
        }

        if (ixSeis != -1) {
            System.out.println(mSeis + " esta en la posicion " + ixSeis);
        }else{
            System.out.println("no se encontro el caracter");
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 7");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Buscar una palabra en un arreglo de Strings ordenado.

        String[] arSiete = {"ah", "bh", "ch", "dh", "eh", "hh"};

        int lowSiete = 0;
        int highSiete = arSiete.length -1;

        String mSiete = "hh";
        int ixSiete = -1;

        while (lowSiete <= highSiete) {
            int mid = lowSiete + (highSiete - lowSiete) / 2;
            int c = arSiete[mid].compareTo(mSiete);
            if(c == 0){
                ixSiete = mid;
                System.out.println(mSiete + " en posicion " + ixSiete);
                break;
            }else if(c < 0){
                lowSiete = mid + 1;
            }else if(c > 0){
                highSiete = mid - 1;
            }
            ixSiete = mid;
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 8");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Verificar si un número está dentro de un rango usando búsqueda binaria.
        
        int[] arOcho = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int lowOcho = 0;
        int highOcho = arOcho.length - 1;

        int mOcho = 10;
        int rangoMin = 6;
        int rangoMax = 9;

        int ixOcho = -1;

        while(lowOcho <= highOcho){
            int mid = lowOcho + (highOcho - lowOcho) / 2;
            if(mOcho > rangoMin && mOcho < rangoMax){
                ixOcho = mid;
                System.out.println(mOcho + " esta en el rango y en la posicion " + ixOcho);
                break;

            }else if(arOcho[mid] < mOcho){
                    lowOcho = mid + 1;

            }else if(arOcho[mid] > mOcho){
                    highOcho = mid - 1;

            }
            if (lowOcho == highOcho) {
                System.out.println("No esta en rango");
                break;
            }
        }





        }
    }

