package Logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TablaPt2 {

    /**
     * Tabla encarga de obtener los valores mas cercanos a la mitad segun la frecuencia
     */
    public static void getDataMiddleTable(Map<String, Object> mapaFinal){
        /// Atributos
        List<Integer> listaCaracteres = (List<Integer>) mapaFinal.get("frecuencia");
        List<Integer> listaRetorno = new ArrayList<>();
        List<Integer> listaRetorno2 = new ArrayList<>();

        int cantidad = (int) mapaFinal.get("cantidad");
        int mitadOriginal = cantidad / 2;
        int almacen = 0, primeraMitad = 0, segundaMitad = 0, prueba = 0;

        /// Logica
        for (int i = 0; i < listaCaracteres.size(); i++){

            listaRetorno.add(listaCaracteres.get(i));
            almacen = almacen + listaCaracteres.get(i);

            if (almacen == mitadOriginal || almacen == (mitadOriginal + 1) || almacen == (mitadOriginal + 2)){
                int x = i + 1;
                for (int j = x; j < listaCaracteres.size(); j++) {
                    listaRetorno2.add(listaCaracteres.get(j));
                }
                break;

            }
        }

        for (int i = 0; i < listaRetorno.size(); i++) {
            primeraMitad = primeraMitad + listaRetorno.get(i);
        }

        segundaMitad = cantidad - primeraMitad;

        System.out.println("- Total de frecuencia: "+mapaFinal.get("cantidad"));
        System.out.println("\n- Primera mitad: ");
        System.out.println("  Lista: " + listaRetorno);
        System.out.println("  Total: " + primeraMitad);

        System.out.println("\n- Segunda mitad: ");
        System.out.println("  Lista: " + listaRetorno2);
        System.out.println("  Total: " + segundaMitad);


//        mapaFinal.put("primeraMitad", primeraMitad);
//        mapaFinal.put("segundaMitad", segundaMitad);
    }
}
