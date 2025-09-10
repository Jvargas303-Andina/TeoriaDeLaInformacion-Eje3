package Logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TablaPt2 {

    public void meidliTable(Map<String, Object> mapaFinal){

        /// Atributos
        int cantidad = (int) mapaFinal.get("cantidad");
        int mitadOriginal = cantidad / 2;
        List<Integer> listaCaracteres = (List<Integer>) mapaFinal.get("frecuencia");
        List<Integer> listaRetorno = new ArrayList<>();

        /// Logica
        for (int caracter : listaCaracteres){
            if (listaRetorno.size() == mitadOriginal){
                break;
            }
            listaRetorno.add(caracter);
        }

        System.out.println(">>>" + listaRetorno);
        System.out.println(">>>" + listaRetorno.size());

        System.out.println("Cantidad de caractres: " + cantidad);
        System.out.println("Mitad original: " + mitadOriginal);
        System.out.println("Mitades mas cercanas segun la fuente: \n- Tabla 1:  \n- Tabla 2:");


    }
}
