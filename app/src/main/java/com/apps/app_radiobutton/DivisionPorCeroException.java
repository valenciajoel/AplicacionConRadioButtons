package com.apps.app_radiobutton;

public class DivisionPorCeroException extends RuntimeException {
    public DivisionPorCeroException(){
        super("No se puede dividir por cero");
    }
}
