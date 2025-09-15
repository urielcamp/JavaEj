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

        char c = pDiez.charAt(0);

        if (
            c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u' 
        ) {
            System.out.println(pDiez + " empieza con la vocal " + c);
        }


    }
}