package Logica;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class OrdenDatosEntrada {

    /**
     * Metodo encargado de optener la cantidad de caracteres
     * y de obtener una lista con cada letra
     */
    public Map<String, Object> countWords(String frase){

        /// Atributos
        int cantidad = frase.length();
        List<String> cadenaOriginal = new ArrayList<>();
        Map<String, Integer> conteo = new LinkedHashMap<>();
        Map<String, Object> resultadoMapa = new HashMap<>();

        /// Logica
        for (int i = 0; i < cantidad; i++){
            char a = frase.charAt(i);
            cadenaOriginal.add(String.valueOf(a)); /// Tener en cuenta que no se valida porque debe ir un " "
        }

        resultadoMapa.put("cantidad", cantidad);
        resultadoMapa.put("cadenaOriginal", cadenaOriginal);

        for (String letra : cadenaOriginal) {
            conteo.put(letra, conteo.getOrDefault(letra, 0) + 1);
        }

        /// 1. Obtener lista de letras
        List<String> cadenaFinal = orderLetters(conteo);

        /// 2. Obtener cantidad de veces que se repite
        List<Integer> frecuencia = countLetters(conteo);

        /// 3. Orden segun la cantidad
        List<String> cadenaOrdenada = sortByCount(conteo);

        resultadoMapa.put("cadenaFinal", cadenaFinal);
        resultadoMapa.put("frecuencia", frecuencia);
        resultadoMapa.put("cadenaOrdenada", cadenaOrdenada);

        /// 4. Cuenta la cantidad final de caracteres
        int cantidadFinal = frecuencia.size();
        int diferenciaCantidades = differenceCount(resultadoMapa, cantidadFinal);

        resultadoMapa.put("cantidadFinal", cantidadFinal);
        resultadoMapa.put("diferenciaCantidades", diferenciaCantidades);

        ///  5. Obtener la entropia
        List<String> entropia = getEntropia(resultadoMapa);

        resultadoMapa.put("entropia", entropia);

        return resultadoMapa;
    }

    /**
     * Metodo encargado de ordenar las Letras, pero las que no estan respetidas
     */
    private List<String> orderLetters(Map<String, Integer> conteo){
        List<String> letrasUnicas = new ArrayList<>(conteo.keySet());
        return letrasUnicas;
    }

    /**
     * Metodo encargado de contar las letras
     */
    private List<Integer> countLetters(Map<String, Integer> conteo){
        List<Integer> cantidades = new ArrayList<>(conteo.values());

        cantidades.sort((a, b) -> b - a);

        return cantidades;
    }

    /**
     * Metodo encargado de organizar la lista con base a la cantidad de veces que existen
     */
    private List<String> sortByCount(Map<String, Integer> conteo) {
        List<Map.Entry<String, Integer>> listaOrdenada = new ArrayList<>(conteo.entrySet());

        listaOrdenada.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        List<String> orden = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : listaOrdenada) {
            orden.add(entry.getKey());
        }

        return orden;
    }

    private int differenceCount(Map<String, Object> mapa, int cantidadFinal){
        int cantidadInicial = (int) mapa.get("cantidad");
        return cantidadInicial - cantidadFinal;
    }

    private List<String> getEntropia(Map<String, Object> mapa) {

        List<Integer> datos = (List<Integer>) mapa.get("frecuencia");
        int cantidadNum = (Integer) mapa.get("cantidad");
        double cantidad = cantidadNum;
        List<String> Entropia = new ArrayList<>();

        for (int numeros : datos) {
            double resultado = ((double) numeros) / cantidad;
            double valorRedondeado = Math.round(resultado * 100.0) / 100.0;
            Entropia.add(String.format("%.2f", valorRedondeado));
        }

        return Entropia;
    }

    /// Probabilidad EJEMPLO:
//    private List<String> getEntropia(Map<String, Object> mapa) {
//
//        List<Integer> datos = (List<Integer>) mapa.get("frecuencia");
//        int cantidadNum = (Integer) mapa.get("cantidad");
//        double cantidad = cantidadNum;
//        List<String> Entropia = new ArrayList<>();
//
//        for (int numeros : datos) {
//            double resultado = ((double) numeros) / cantidad;
//            double valorRedondeado = Math.round(resultado * 100.0) / 100.0;
//            Entropia.add(String.format("%.2f", valorRedondeado));
//        }
//
//        return Entropia;
//    }
}
