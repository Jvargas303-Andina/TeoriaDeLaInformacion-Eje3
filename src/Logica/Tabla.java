package Logica;

import java.util.List;
import java.util.Map;

public class Tabla {

    public void table(Map<String, Object> mapaFinal){

        /// Atributos
        int filas = (int) mapaFinal.get("cantidadFinal") + 1;
        int columnas = 3;

        /// Logica
        for (int x = 0; x < filas; x++){
            for (int y = 0; y < columnas; y++){

                if (x == 0){ /// Paso #1 Agregar nombre columnas
                    addNameColumnNameInCase0(y);

                }else{ /// Paso #2 Agregar letras en la fila Y1
                    String cambiarNombre = orderColumnY(y, x, mapaFinal);
                    System.out.print(cambiarNombre);

                }
            }
            System.out.println();
        }
    }

    /**
     * Metodo encargado de agregar titulo a las columnas
     */
    private void addNameColumnNameInCase0(int numeroY){
        String letras = "[ Letras ]";
        String vecesRepetidas = "[ Frecuencia ]";
        String probabilidad = "[ Probabilidad ]";

        switch (numeroY) {
            case 0 -> System.out.print(letras);
            case 1 -> System.out.print(vecesRepetidas);
            case 2 -> System.out.print(probabilidad);
        }
    }

    /**
     * Metodo encargado de ordenar los valores que van en la columna Y
     */
    private String orderColumnY(int numeroY, int numeroX, Map<String, Object> mapaFinal){
        /// Atributos
        String respuesta;
        numeroX = numeroX - 1;
        List<String> letras = (List<String>) mapaFinal.get("cadenaOrdenada");
        List<Integer> cantidadRetidas = (List<Integer>) mapaFinal.get("frecuencia");

        /// Logica
        switch (numeroY){
            case 0 -> {
                respuesta = "[   " + getLetter(numeroX, letras) + "    ]";
                return respuesta;
            }
            case 1 -> {
                respuesta = "[      " + getFrecuency(numeroX, cantidadRetidas) + "     ]";
                return respuesta;
            }
            case 2 -> {
                respuesta = "[     " + getProbability(numeroX, mapaFinal) + "     ]";
                return respuesta;
            }
            default -> {
                respuesta = "[Valor x      ]";
                return respuesta;
            }
        }
    }

    /**
     * Metdo encargado de optener la letra dependiendo de la posicion X
     */
    private String getLetter(int numeroX, List<String> letras){
        return letras.get(numeroX);
    }

    /**
     * Metdo encargado de optener el numero de frecuencia dependiendo de la posicion X
     */
    private int getFrecuency(int numeroX, List<Integer> cantidad){
        return cantidad.get(numeroX);
    }


    private String getProbability(int numeroX, Map<String, Object> mapaFinal) {
        List<String> probaility = (List<String>) mapaFinal.get("probabilidad");
        return probaility.get(numeroX);
    }


}
