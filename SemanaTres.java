import java.util.Arrays;

public class SemanaTres {
    public static void main(String[] args) {


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("CADENAS Y STRINGS DIA 1 -- FUNDAMENTOS DE STRINGS");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        System.out.println("EJER 1");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Crear un programa que lea un String y lo muestre carácter por carácter en líneas separadas.

        String pUno = "Hola carnal";

        for(int i = 0; i < pUno.length(); i++){
            char c = pUno.charAt(i);
            System.out.println(c + " ");
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Contar cuántos caracteres tiene una cadena sin usar .length().

        String pDos = "Hola como estas?";
        int cUno = 0;


        for(int i = 0; i < 100; i++){
            try{
                char c = pDos.charAt(i);
                cUno++;
            }catch (Exception e){
                break;
            }
            
        }
        System.out.println(cUno);

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Invertir una cadena (mostrarla al revés).

        String pTres = "Hola";

        for(int i = pTres.length() - 1; i >= 0; i--){
            char c = pTres.charAt(i);
            System.out.print(c);
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Convertir todos los caracteres de una cadena a mayúsculas sin usar .toUpperCase().
        String pCuatro = "Hola";
        String rCuatro = "";

        for(int i = 0; i < pCuatro.length(); i++){
            char c = pCuatro.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - 32);
            }
            rCuatro += c;
        }

        System.out.println(rCuatro);


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Convertir todos los caracteres de una cadena a minúsculas sin usar .toLowerCase().

        String pCinco = "Hola Mundo";
        String rCinco = "";

        for(int i = 0; i < pCinco.length(); i++){
            char c = pCinco.charAt(i);

            c = Character.toUpperCase(c);

            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32);
            }

            rCinco += c;
        }

        System.out.println(rCinco);

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 6");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Contar cuántas veces aparece una letra específica en un String.

        String pSeis = "garrr";

        char lSeis = 'a';

        int cSeis = 0;

        for(int i = 0; i < pSeis.length(); i++){
            char c = pSeis.charAt(i);

            if (lSeis == c) {
                cSeis++;
            }
        }

        System.out.println(cSeis);

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 7");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Verificar si un String contiene un número dentro.

        String pSiete = "Hol4";

        for(int i = 0; i < pSiete.length(); i++){
            char c = pSiete.charAt(i);

            if (
                c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0'
                
                ) {
                System.out.println("La palabra contiene el numero " + c);
            }
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 8");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Contar cuántos dígitos hay dentro de una cadena.

                String pOcho = "Hol454";

                int cOcho = 0;
        for(int i = 0; i < pOcho.length(); i++){
            char c = pOcho.charAt(i);
            
            if (
                c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0'
                
                ) {
                cOcho++;
            }
            
        }

        System.out.println(cOcho);
        

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 9");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Eliminar todos los espacios de un String.

        String pNueve = "Ho la";

        pNueve = pNueve.replace(" ", "");

        System.out.println(pNueve);


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 10");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Verificar si una palabra empieza con vocal.

        String pDiez = "elegidos";

        char cee = pDiez.charAt(0);

        if (
            cee == 'A' || cee == 'a' || cee == 'E' || cee == 'e' || cee == 'I' || cee == 'i' || cee == 'O' || cee == 'o' || cee == 'U' || cee == 'u' 
        ) {
            System.out.println(pDiez + " empieza con la vocal " + cee);
        }



                System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("CADENAS Y STRINGS DIA 2 -- PALINDROMOS Y TRANSFORMACIONES");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        System.out.println("EJER 1");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Verificar si una palabra es un palíndromo.

        String paUno = "holoh";

        boolean eUno = false;

        for(int i = 0; i < paUno.length(); i++){
            
            char c = paUno.charAt(i);
            

            if (c == paUno.charAt(paUno.length() - i - 1)) {
                eUno = true;
            }else{
                eUno = false;
                break;
            }
                
                
            
        }

        if (eUno) {
            System.out.println(paUno + " es palindromo");
        }else{
            System.out.println(paUno + " no es palindromo");
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Verificar si una frase es un palíndromo (ignorando espacios y mayúsculas).

        String paDos = "Hola comoc aloh";

        paDos = paDos.replace(" ", "");
        paDos = paDos.toLowerCase();
        boolean eDos = false;

        System.out.println(paDos);
        System.out.println();

        for(int i = 0; i < paDos.length(); i++){
            char c = paDos.charAt(i);

            if (c == paDos.charAt(paDos.length() - i - 1)) {
                eDos = true;
            }else{
                eDos = false;
            }
        }

        if (eDos) {
            System.out.println(paDos + " es palindromo");
        }else{
            System.out.println(paDos + " no es palindromo");
        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Dada una cadena, reemplazar todas las vocales por *.

        String paTres = "Hola como estas";

        for(int i = 0; i < paTres.length(); i++){
            char c = paTres.charAt(i);

            if (
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
            ) {
                paTres = paTres.replace(c, '*');
            }
        }

        System.out.println(paTres);


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Reemplazar todas las apariciones de un carácter específico por otro.

        String paCuatro = "hola como estas";

        char cCuatro = 'o';

        char mCuatro = '#';

        paCuatro = paCuatro.replace(cCuatro, mCuatro);

        System.out.println(paCuatro);



        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Eliminar todas las vocales de un String.

        String paCinco = "Hablaba";

        for(int i = 0; i < paCinco.length(); i++){
            char c = paCinco.charAt(i);
            
            

            if (
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' 
            ) {

                String ca = Character.toString(c);
                paCinco = paCinco.replace(ca, "");
            }
        }

        System.out.println(paCinco);



        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 6");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Eliminar todas las consonantes de un String.

        String paSeis = "hablaba";

        paSeis = paSeis.replaceAll("[b-df-hj-np-tv-z]", "");

        System.out.println(paSeis);


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 7");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Contar cuántas palabras tiene una frase.

        String paSiete = "Hola como esta todo";
        int cp = 0;

        for(int i = 0; i < paSiete.length(); i++){
            char c = paSiete.charAt(i);
            String ce = Character.toString(c);

            System.out.println(c);
            
        
            if (c == ' ') {
                cp++;
            }
        }

        cp++;

        System.out.println("el string tiene " + cp + " palabras");



        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 8");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Verificar si dos palabras son anagramas.

        String paOchoA = "sergiosd";
        String paOchoB = "regios";
        char[] auxOchoA = new char[paOchoA.length()];
        char[] auxOchoB = new char[paOchoB.length()];
        boolean eOcho = true;


        for(int i = 0; i < paOchoA.length(); i++){
            char c = paOchoA.charAt(i);
            auxOchoA[i] = c;
        }

        for(int i = 0; i < paOchoB.length(); i++){
            char k = paOchoB.charAt(i);
            auxOchoB[i] = k;
            
        }

        System.out.println(Arrays.toString(auxOchoA));
        System.out.println(Arrays.toString(auxOchoB));

        for(int i = 0; i < auxOchoA.length - 1; i++){
            for(int j = 0; j < auxOchoA.length - i - 1; j++){
                if (auxOchoA[j] > auxOchoA[j + 1]) {
                    char temp = auxOchoA[j];
                    auxOchoA[j] = auxOchoA[j + 1];
                    auxOchoA[j + 1] = temp;
                }
            }
            
        }
        System.out.println();

        for(int i = 0; i < auxOchoB.length - 1; i++){
            for(int j = 0; j < auxOchoB.length - i - 1; j++){
                if (auxOchoB[j] > auxOchoB[j + 1]) {
                    char tmp = auxOchoB[j];
                    auxOchoB[j] = auxOchoB[j + 1];
                    auxOchoB[j + 1] = tmp;
                }
            }
            
        }

        System.out.println(Arrays.toString(auxOchoA));
        System.out.println(Arrays.toString(auxOchoB));
        
        try{
            for(int i = 0; i < auxOchoB.length; i++){
                char c = auxOchoB[i];
                

                if (c == auxOchoA[i]) {
                    eOcho = true;
                }else{
                    eOcho = false;
                    break;
                }
            }
        }catch (Exception e){
            System.out.println("Las palabras no son anagramas");
            eOcho = false;
        }




        System.out.println();

    if (eOcho) {
        System.out.println("Las palabras son anagramas");
    }else{
        System.out.println("Las palabras no son anagramas");
    }        


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("CADENAS Y STRINGS DIA 3 -- CONTADORES Y BUSQUEDAS DE TEXTO");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        System.out.println("EJER 1");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Contar cuántas vocales hay en una frase.

        String strUno = "Hola como estas";
        int cntUno = 0;

        for(int i = 0; i < strUno.length(); i++ ){
            char c = strUno.charAt(i);
        

            if (
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
            ) {
                cntUno++;
            }
        }

        System.out.println("La frase tiene " + cntUno + " vocales");

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Contar cuántas consonantes hay en una frase.

        String strDos = "hola como estas";

        int cntDos = 0;

        for(int i = 0; i < strDos.length(); i++){
            char c = strDos.charAt(i);

            if (
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == ' ' 
            ) {
                continue;
            }else{
                cntDos++;
            }

        }
        System.out.println();

        System.out.println("La frase tiene " + cntDos + " consonantes");



        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Contar cuántos espacios hay en una cadena.

        String strTres = "Hola como estas";
        int cntTres = 0;

        for(int i = 0; i < strTres.length(); i++){
            char c = strTres.charAt(i);

            if (c == ' ') {
                cntTres++;
            }
        }

        System.out.println(cntTres);


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        //Contar cuántos números hay en una cadena.

        String strCuatro = "Hola com0 est4s";

        int cntCuatro = 0;

        for(int i = 0; i < strCuatro.length(); i++){
            char c = strCuatro.charAt(i);

        if (
                c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0'
            ) 
            {
                cntCuatro++;
            }
        }

        System.out.println(cntCuatro);








    }
}