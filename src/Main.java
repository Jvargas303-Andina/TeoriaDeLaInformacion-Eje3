import Logica.OrdenDatosEntrada;
import Logica.Tabla;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /// Atributos necesarios
        Map<String, Object> mapaValores;
        OrdenDatosEntrada orden = new OrdenDatosEntrada();

        /// Instancia de clases
        Scanner sc = new Scanner(System.in);
        Tabla clasePlantilla = new Tabla();

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
        mapaValores = orden.countWords(frase);
        System.out.println("1. Cantidad: "+mapaValores.get("cantidad"));
        System.out.println("2. Cadena Original: " +mapaValores.get("cadenaOriginal"));
        System.out.println("3. Cadena Final:    " +mapaValores.get("cadenaFinal"));
        System.out.println("4. Repetividada:    " +mapaValores.get("repetitive"));
        System.out.println("5. Cadena Ordenad:  " +mapaValores.get("cadenaOrdenada"));

        /// Paso #4.
        System.out.println("\nTabla:");
        clasePlantilla.table(mapaValores);

    }
}