package com.apps.app_radiobutton;

public enum Operador {
    SUMA("Suma", '+'),RESTA("Resta", '-'),MULTIPLICACION("Multiplicacion", '*'),DIVISION("Division", '/');

    private String nombre;
    private char operacion;
    private Operador(String nombre, char operador) {
        this.nombre = nombre;
        this.operacion = operador;
    }

    public char getOperacion(){
        return operacion;
    }

    public String getNombre(){
        return nombre;
    }
}
