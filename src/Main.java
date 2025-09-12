import Logica.OrdenDatosEntrada;
import Logica.TablaPt1;
import Logica.TablaPt2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /// Atributos necesarios
        Map<String, Object> mapaValores;
        OrdenDatosEntrada orden = new OrdenDatosEntrada();

        /// Instancia de clases
        Scanner sc = new Scanner(System.in);
        TablaPt1 TablaPt1 = new TablaPt1();
        TablaPt2 TablaPt2 = new TablaPt2();

        /// Saludo
        System.out.println("""
        *-----------------------------------*
        | Materia: Teoria de la informacion |
        | Trabajo: EJE 3                    |
        | Nombre: Juan Felipe Vargas Cortes |
        *-----------------------------------*
        """);

        /// Paso #1.
        System.out.print("Por favor introduzca una una frase \n:");
        String frase = sc.nextLine();

        /// Paso #2.
        System.out.println("\n* Datos importantes: ");
        mapaValores = orden.countWords(frase);
        System.out.println("1. Cantidad: "+mapaValores.get("cantidad"));
        System.out.println("2. Cadena Original: " +mapaValores.get("cadenaOriginal"));
        System.out.println("3. Cadena Final:    " +mapaValores.get("cadenaFinal"));
        System.out.println("4. Frecuencia:    " +mapaValores.get("frecuencia"));
        System.out.println("5. Cadena Ordenad:  " +mapaValores.get("cadenaOrdenada"));

        /// Paso #4.
        TablaPt1.table(mapaValores);

    }
}