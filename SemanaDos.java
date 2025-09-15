import java.net.Socket;
import java.util.Arrays;

public class SemanaDos {
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
            if(mOcho >= rangoMin && mOcho <= rangoMax){
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



        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("ALGORITMOS DIA 3 -- ORDENAMIENTOS SIMPLES");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        System.out.println("EJER 1");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Implementar ordenamiento burbuja ascendente.

        int[] arrUno = {1, 23, 3, 2, 4, 56, 43, 21, 5, 3, 44, 657};

        for(int i = 0; i < arrUno.length - 1; i++){
            for(int j = 0; j < arrUno.length - i - 1; j++){
                if (arrUno[j] > arrUno[j + 1]) {
                    int temp = arrUno[j];
                    arrUno[j] = arrUno[j + 1];
                    arrUno[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arrUno));

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Implementar ordenamiento burbuja descendente.

        int[] arrDos = {1, 23, 42, 12, 23, 2, 2, 3, 4, 3435, 34, 5, 67, 8, 6};

        for(int i = 0; i < arrDos.length - 1; i++){
            for(int j = 0; j < arrDos.length - i - 1; j++){
                if (arrDos[j] < arrDos[j + 1]) {
                    int temp = arrDos[j];
                    arrDos[j] = arrDos[j + 1];
                    arrDos[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arrDos));

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Optimizar burbuja para detenerse si ya está ordenado.

        int[] arrTres = {1, 2, 3, 4, 5, 6, 7, 8, 93, 2};
        int cTres = 0;
        boolean intercambio = false;

        for(int i = 0; i < arrTres.length - 1; i++){
            for(int j = 0; j < arrTres.length - i - 1; j++){
                if (arrTres[j] > arrTres[j + 1]) {
                    int temp = arrTres[j];
                    arrTres[j] = arrTres[j + 1];
                    arrTres[j + 1] = temp;
                    cTres++;
                    intercambio = true;
                }
            }
            if(!intercambio) {
                break;
            }
        }

        System.out.println(Arrays.toString(arrTres));
        System.out.println(cTres);

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Implementar ordenamiento por selección ascendente.

        int[] arrCuatro = {12, 1, 2, 23, 42, 12, 25, 8, 90, 7};

        for(int i = 0; i < arrCuatro.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arrCuatro.length; j++){
                if (arrCuatro[j] < arrCuatro[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arrCuatro[minIndex];
            arrCuatro[minIndex] = arrCuatro[i];
            arrCuatro[i] = temp;
        }

        System.out.println(Arrays.toString(arrCuatro));


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Implementar selección descendente.
        int[] arrCinco = {12, 2, 12, 1, 32, 14, 53, 23, 5, 6};

        for(int i = 0; i < arrCinco.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arrCinco.length; j++){
                if (arrCinco[j] > arrCinco[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arrCinco[minIndex];
            arrCinco[minIndex] = arrCinco[i];
            arrCinco[i] = temp;
        }

        System.out.println(Arrays.toString(arrCinco));


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 6");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Implementar ordenamiento por inserción ascendente.

        int[] arrSeis = {1, 21, 12, 2, 34, 23, 5, 4, 3};

        for(int i = 1; i < arrSeis.length; i++){
            int key = arrSeis[i];
            int j = i - 1;
            while (j >= 0 && arrSeis[j] > key) {
                arrSeis[j + 1] = arrSeis[j];
                j--;
            }
            arrSeis[j + 1] = key;
        }
        System.out.println(Arrays.toString(arrSeis));
    
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 7");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Implementar inserción descendente


        int[] arrSiete = {1, 2, 4, 32, 12, 23, 4, 56};

        for(int i = 1; i < arrSiete.length; i++){
            int key = arrSiete[i];
            int j = i - 1;
            while (j >= 0 && arrSiete[j] < key) {
                arrSiete[j + 1] = arrSiete[j];
                j--; 
            }
            arrSiete[j + 1] = key;
        }

        System.out.println(Arrays.toString(arrSiete));


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 8");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Ordenar un arreglo de Strings alfabéticamente (usando burbuja).

        String[] arrOcho = {"ah", "bh", "dh", "uh", "ch"};

        for(int i = 0; i < arrOcho.length - 1; i++){
            for(int j = 0; j < arrOcho.length - i - 1; j++){
                int c = arrOcho[j].compareTo(arrOcho[j + 1]);
                if (c > 0) {
                    String temp = arrOcho[j];
                    arrOcho[j] = arrOcho[j + 1];
                    arrOcho[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arrOcho));




        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 9");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Ordenar un arreglo de caracteres (usando selección).

        char[] arrNueve = {'s', 'a', 'h', 'b', 'g', 'c'};

        for(int i = 0; i < arrNueve.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arrNueve.length; j++){
                if (arrNueve[j] < arrNueve[minIndex]) {
                    minIndex = j;
                }
            }

            char temp = arrNueve[minIndex];
            arrNueve[minIndex] = arrNueve[i];
            arrNueve[i] = temp;
        }

        System.out.println(Arrays.toString(arrNueve));



        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 10");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Comparar la cantidad de intercambios entre burbuja y selección

        int[] arrDiezA = {12, 1, 32, 23, 4, 5, 76, 8, 6};
        int[] arrDiezB = {12, 1, 32, 23, 4, 5, 76, 8, 6};

        int cBurbuja = 0;
        int cSelection = 0;

        //Burbuja
        for(int i = 0; i < arrDiezA.length - 1; i++){
            for(int j = 0; j < arrDiezA.length - i - 1; j++){
                if (arrDiezA[j] > arrDiezA[j + 1]) {
                    int temp = arrDiezA[j];
                    arrDiezA[j] = arrDiezA[j + 1];
                    arrDiezA[j + 1] = temp;
                    cBurbuja++;
                }
            }
        }

        //Selection

        for(int i = 0; i < arrDiezB.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arrDiezB.length; j++){
                if (arrDiezB[j] < arrDiezB[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arrDiezB[minIndex];
            arrDiezB[minIndex] = arrDiezB[i];
            arrDiezB[i] = temp;
            cSelection++;
        }

        System.out.println("Burbuja: " + Arrays.toString(arrDiezA));
        System.out.println(cBurbuja);
        System.out.println();
        System.out.println("Selection: " + Arrays.toString(arrDiezB));
        System.out.println(cSelection);


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("ALGORITMOS DIA 4 -- ORDENAMIENTOS EFICIENTES");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        System.out.println("EJER 1");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();


        //Implementar Merge Sort para ordenar números.

        int[] arryUno = {12, 1, 23, 4, 3, 5, 7, 6, 9};

        int[] auxUno = new int[arryUno.length];

        for(int i = 1; i < arryUno.length; i*=2){
            for(int j = 0; j < arryUno.length - i; j += i * 2){
                int mid = j + i - 1;
                int hi = Math.min(j + i * 2 - 1, arryUno.length - 1);


                int izq = j;
                int der = mid + 1;
                int k = j;

                while(izq <= mid && der <= hi){
                    if (arryUno[izq] <= arryUno[der]) {
                        auxUno[k++] = arryUno[izq++];
                    }else {
                        auxUno[k++] = arryUno[der++];
                    }
                }

                while (izq <= mid) {
                    auxUno[k++] = arryUno[izq++];
                }

                while (der <= hi) {
                    auxUno[k++] = arryUno[der++];
                }

                for(int m = j; m <= hi; m++){
                    arryUno[m] = auxUno[m];
                }
            }
        }

        System.out.println(Arrays.toString(arryUno));


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Implementar Merge Sort para Strings.

        String[] arryDos = {"eh", "bh", "dh", "ch", "ah"};

        String[] auxDos = new String[arryDos.length];



        for(int i = 1; i < arryDos.length; i *= 2){
            for(int j = 0; j < arryDos.length - i; j += i * 2){

                


                int mid = j + i - 1;
                int hi = Math.min(j + i * 2 - 1, arryDos.length - 1);

                int izq = j;
                int der = mid + 1;
                int k = j;

                while (izq <= mid && der <= hi) {
                    if(arryDos[izq].compareTo(arryDos[der]) <=0){
                        auxDos[k++] = arryDos[izq++];
                    }else{
                        auxDos[k++] = arryDos[der++];
                    }
                }

                while (izq <= mid) {
                    auxDos[k++] = arryDos[izq++];
                }

                while (der <= hi) {
                    auxDos[k++] = arryDos[der++];
                }

                for(int m = j; m <= hi; m++){
                    arryDos[m] = auxDos[m];
                }
            }
        }

        System.out.println(Arrays.toString(arryDos));


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Implementar Quick Sort para ordenar números.

        int[] arryTres = {22, 23, 3, 2, 12, 34, 1, 2};

        if (arryTres.length > 1) {
            int[] stack = new int[arryTres.length * 2];
            int top = -1;

            stack[++top] = 0;
            stack[++top] = arryTres.length - 1;

            while (top >= 0) {
                int hi = stack[top--];
                int lo = stack[top--];

                if (lo >= hi) {
                    continue;
                }

                int pivot = arryTres[hi];
                int i = lo;

                for(int j = lo; j < hi; j++){
                    if ((arryTres[j] <= pivot)) {
                        
                        int tmp = arryTres[i];
                        arryTres[i] = arryTres[j];
                        arryTres[j] = tmp;
                        i++;
                    }
                }

                int tmp = arryTres[i];
                arryTres[i] = arryTres[hi];
                arryTres[hi] = tmp;
                int p = i;

                if (p + 1 < hi) {
                    stack[++top] = p + 1;
                    stack[++top] = hi;
                }

                if (lo < p - 1) {
                    stack[++top] = lo;
                    stack[++top] = p - 1;
                }


            }
        }

        System.out.println(Arrays.toString(arryTres));



        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Implementar Quick Sort para Strings.

        String[] arryCuatro = {"gh", "ah", "fh", "ch"};

        if (arryCuatro.length > 1) {
            
            int[] stack = new int[arryCuatro.length * 2];
            int top = -1;

            stack[++top] = 0;
            stack[++top] = arryCuatro.length - 1;
            
            while (top >= 0) {
                int hi = stack[top--];
                int lo = stack[top--];

                if (lo >= hi) {
                    continue;
                }

                String pivot = arryCuatro[hi];
                int i = lo;

                for(int j = lo; j < hi; j++){
                    if (arryCuatro[j].compareTo(pivot) <= 0) {
                        String tpm = arryCuatro[i];
                        arryCuatro[i] = arryCuatro[j];
                        arryCuatro[j] = tpm;
                        i++;
                    }
                }

                String tmp = arryCuatro[i];
                arryCuatro[i] = arryCuatro[hi];
                arryCuatro[hi] = tmp;
                int p = i;

                if (p + 1 < hi) {
                    stack[++top] = p + 1;
                    stack[++top] = hi;
                }

                if (lo < p - 1) {
                    stack[++top] = lo;
                    stack[++top] = p - 1;
                }
            }
        }

        System.out.println(Arrays.toString(arryCuatro));


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        ////Modificar Quick Sort para ordenar descendente.

        int[] arryCinco = {12, 23, 2, 3, 2, 1, 5, 6, 9, 87};


        if (arryCinco.length > 1) {
            int[] stack = new int[arryCinco.length * 2];
            int top = -1;

            stack[++top] = 0;
            stack[++top] = arryCinco.length - 1;

            while(top >= 0){
                int hi = stack[top--];
                int lo = stack[top--];

                if (lo >= hi) {
                    continue;
                }

                int pivot = arryCinco[hi];
                int i = lo;

                for(int j = lo; j < hi; j++){
                    if (arryCinco[j] >= pivot) {
                        int tmp = arryCinco[i];
                        arryCinco[i] = arryCinco[j];
                        arryCinco[j] = tmp;
                        i++;
                    }
                }

                int tmp = arryCinco[i];
                arryCinco[i] = arryCinco[hi];
                arryCinco[hi] = tmp;
                int p = i; 

                if (p + 1 < hi) {
                    stack[++top] = p + 1;
                    stack[++top] = hi;
                }

                if (lo < p - 1) {
                    stack[++top] = lo;
                    stack[++top] = p - 1;
                }
            }
        }

        System.out.println(Arrays.toString(arryCinco));


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("ALGORITMOS DIA 5 -- RETOS COMBINADOS");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        System.out.println("EJER 1");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Ordenar una arreglo de nombres y buscar uno específico.

        String[] nombres = {"Bruno", "Axel", "Alejandro", "Franco", "Jazmin", "Luna", "Esteban"};
        
        String nNombre = "Franco";

        boolean eUno = false;

        for(int i = 0; i < nombres.length - 1; i++){
            if (nombres[i] == nNombre) {
                eUno = true;
            }
            for(int j = 0; j < nombres.length - i - 1; j++){ 
                int c = nombres[j].compareTo(nombres[j + 1]);
                if (c > 0) {
                    String tmp = nombres[j];
                    nombres[j] = nombres[j+1];
                    nombres[j+1] = tmp;
                }
            }
        }

        if (eUno) {
            System.out.println(nNombre + " Esta en el arreglo");
        }else{
            System.out.println("No esta en el arreglo");
        }

        System.out.println(Arrays.toString(nombres));


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Ordenar un arreglo de temperaturas y encontrar la mínima y máxima.

        int[] temperaturas = {21, 30, 19, 11, -4, 40, 3};

        int tempMin = temperaturas[0];
        int tempMax = temperaturas[0];

        int[] temp = new int[2];

        for(int i = 0; i < temperaturas.length - 1; i++){
            for(int j = 0; j < temperaturas.length - i - 1; j++){

                if (tempMin > temperaturas[j]) {
                    tempMin = temperaturas[j];
                    temp[0] = tempMin;
                }

                if (tempMax < temperaturas[j]) {
                    tempMax = temperaturas[j];
                    temp[1] = tempMax;
                }


                if (temperaturas[j] > temperaturas[j+1]) {
                    int tmp = temperaturas[j];
                    temperaturas[j] = temperaturas[j + 1];
                    temperaturas[j + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(temperaturas));
        System.out.println(Arrays.toString(temp));


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Buscar si dos arreglos tienen al menos un número en común.

        int[] arrayUno = {12, 32, 45, 32, 1, 2, 452, 9};
        int[] arrayDos = {21, 4, 5667, 4346, 75854, 234, 9983, 2};
        boolean elementoComun = false;

        for(int i  = 0; i < arrayUno.length; i++){
            for(int j = 0; j < arrayDos.length; j++){
                if (arrayUno[i] == arrayDos[j]) {
                    elementoComun = true;
                    System.out.println("Tienen al menos un elemento en comun el cual es: " + arrayDos[j]);
                    break;
                    
                }
                }
            }

            if (!elementoComun) {
                System.out.println("No hay elementos en comun");
            }
        

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Ordenar dos arreglos y unirlos en uno solo ordenado.

        int[] arrayA = {21, 212, 3, 23, 4, 2, 6, 9, 1, 90};
        int[] arrayB = {23, 123, 4, 2, 90, 257, 22314};

        int[] auxCuatro = new int[arrayA.length + arrayB.length];

        for(int i = 0; i < arrayA.length - 1; i++){
            for(int j = 0; j < arrayA.length - i - 1; j++){
                if (arrayA[j] > arrayA[j + 1]) {
                    int tmp = arrayA[j];
                    arrayA[j] = arrayA[j+1];
                    arrayA[j + 1] = tmp;
                }
            }
        }

        for(int i = 0; i < arrayB.length - 1; i++){
            for(int j = 0; j < arrayB.length - i - 1; j++){
                if (arrayB[j] > arrayB[j + 1]) {
                    int tmp = arrayB[j];
                    arrayB[j] = arrayB[j+1];
                    arrayB[j + 1] = tmp;
                }
            }
        }

        for(int i = 0; i < arrayA.length; i++){
            auxCuatro[i] = arrayA[i];
        }

        for(int i = 0; i < arrayB.length; i++){
            auxCuatro[arrayA.length + i] = arrayB[i];
        }

        for(int i = 0; i < auxCuatro.length - 1; i++){
            for(int j = 0; j < auxCuatro.length - i - 1; j++){
                if (auxCuatro[j] > auxCuatro[j + 1]) {
                    int tmp = auxCuatro[j];
                    auxCuatro[j] = auxCuatro[j + 1];
                    auxCuatro[j + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(auxCuatro));
        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayB));
        
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Buscar el segundo número más grande en un arreglo.

        int[] arrayCinco =  { 21, 23, 1, 24, 3, 56, 80, 23, 2, 14};
        int max = arrayCinco[0];
        int c = 0;
        int auxMax = arrayCinco[0];

        for(int i = 0; i < arrayCinco.length - 1; i++){
            
            for(int j = 0; j < arrayCinco.length; j++){

                if (max < arrayCinco[j]) {
                    max = arrayCinco[j];
                    c = j;
                }
            }

            if (i != c) {
                if (auxMax < arrayCinco[i]) {
                    auxMax = arrayCinco[i];
                }
            }
            
        }
        
        
        System.out.println("El segundo valor mas grande del arreglo es: " + auxMax);


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 6");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Buscar el segundo número más pequeño en un arreglo.

        int[] arraySeis = {12, 2, -8, -5, 24, 38, 9};

        int min = arraySeis[0];
        int auxMin = arraySeis[0];
        int cSeis = 0;

        for(int i = 0; i < arraySeis.length; i++){
            
            for(int j = 0; j < arraySeis.length; j++){
                if (min > arraySeis[j]) {
                    min = arraySeis[j];
                    cSeis++;
                }
            }

            if (i != cSeis) {
                if (auxMin > arraySeis[i]) {
                    auxMin = arraySeis[i];
                }
            }
        }

        System.out.println("El segundo menor del arreglo es: " + auxMin);


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 7");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Ordenar una lista de palabras y contar cuántas empiezan con vocal.

        String[] palabras = {"Hola", "Florero", "Cascada", "Alfombra", "Opera", "Buzo", "Amigo", "Enemigo"};
        int vocales = 0;

        for(int i = 0; i < palabras.length; i++){
            for(int j = 0; j < palabras.length - 1; j++){
                if (palabras[j].compareTo(palabras[j+1]) > 0) {
                    String tmp = palabras[j];
                    palabras[j] = palabras[j + 1];
                    palabras[j+ 1] = tmp;
                }
            }

            char vocal = palabras[i].charAt(0);
            char newC = Character.toLowerCase(vocal);
            
            if (newC == 'a' || newC == 'e' || newC == 'i' || newC == 'o' || newC == 'u') {
                vocales++;
            }

        }

        System.out.println(Arrays.toString(palabras));
        System.out.println(vocales);

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 8");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Ordenar un arreglo y buscar el valor más cercano a un número dado.

        int[] arrayNueve = {1, 4, 3, 5, 2, 6, 8, 9, 7, 10, 15, 22};
        int numNueve = 15; 
        int res = 1;
        int resAux = 0;

        for(int i = 0; i < arrayNueve.length; i++){
            for(int j = 0; j < arrayNueve.length - 1; j++){
                if (arrayNueve[j] > arrayNueve[j+1]) {
                    int tmp = arrayNueve[j];
                    arrayNueve[j] = arrayNueve[j + 1];
                    arrayNueve[j + 1] = tmp;
                }
            }

            if (arrayNueve[i] == numNueve) {
                resAux =  numNueve - arrayNueve[i - 1] ;
                res = arrayNueve[i + 1] - numNueve;

                if (resAux > res) {
                    System.out.println("El valor mas cercano a " + numNueve + " es: " + arrayNueve[i + 1]);
                }else{
                    System.out.println("El valor mas cercano a " + numNueve + " es: " + arrayNueve[i - 1]);
                }
            }
            
        }

        System.out.println(Arrays.toString(arrayNueve));




        }
    }




