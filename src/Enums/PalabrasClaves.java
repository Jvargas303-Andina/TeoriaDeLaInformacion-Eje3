package Enums;

public enum PalabrasClaves {

    CANTIDAD("cantidad"),
    CADENA_ORIGINAL("cadenaOriginal"),
    CADENA_FINAL ("cadenaFinal"),
    CADENA_ORDENADA("cadenaOrdenada"),
    FRECUENCIA("frecuencia");


    private final String descripcion;

    PalabrasClaves(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
