import Enums.PalabrasClaves;
import Logica.OrdenDatosEntrada;
import Logica.TablaPt1;

import java.util.*;

import static Logica.TablaPt2.getDataMiddleTable;

public class Main {
    public static void main(String[] args) {

        /// Atributos necesarios
        Map<String, Object> mapaValores;
        OrdenDatosEntrada orden = new OrdenDatosEntrada();

        /// Instancia de clases
        Scanner sc = new Scanner(System.in);
        TablaPt1 TablaPt1 = new TablaPt1();

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
        System.out.println("\n*** Datos importantes ***");
        mapaValores = orden.countWords(frase);
        System.out.println("1. Cantidad caracteres: "+mapaValores.get(PalabrasClaves.CANTIDAD));
        System.out.println("2. Cadena Original: " +mapaValores.get(PalabrasClaves.CADENA_ORIGINAL));
        System.out.println("3. Cadena Final:    " +mapaValores.get(PalabrasClaves.CADENA_FINAL));
        System.out.println("4. Frecuencia:      " +mapaValores.get(PalabrasClaves.FRECUENCIA));
        System.out.println("5. Cadena Ordenad:  " +mapaValores.get(PalabrasClaves.CADENA_ORDENADA));

        /// Paso #4.
        System.out.println("\n*** Tabla puntos A y B ***");
        TablaPt1.table(mapaValores);

        /// Paso #5.
        System.out.println("\n*** Punto C ***");
        getDataMiddleTable(mapaValores);

    }
}