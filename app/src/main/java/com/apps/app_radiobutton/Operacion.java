package com.apps.app_radiobutton;


public class Operacion {
    private final Operador [] operadores;
    private final String [] operaciones;
    public Operacion(){
        operadores = Operador.values();
        operaciones = new String[operadores.length];
        for (int i = 0; operadores.length > i; i++){
            operaciones[i]=operadores[i].getNombre();
        }
    }
    public int Calcular(int valor1, int valor2, String op) throws DivisionPorCeroException {
        Operador operador = getTipo(op);
        return Calcular(valor1,valor2,operador);
    }

    public int Calcular(int valor1, int valor2, Operador op) throws DivisionPorCeroException {
        int resultado = 0;
        switch (op){
            case SUMA:
                resultado = valor1 + valor2;
                break;
            case RESTA:
                resultado = valor1 - valor2;
                break;
            case MULTIPLICACION:
                resultado = valor1 * valor2;
                break;
            case DIVISION:
                if(valor2 == 0){
                    throw new DivisionPorCeroException();
                }else {
                    resultado = valor1 / valor2;
                    break;
                }
        }

        return resultado;
    }


    private Operador getTipo(String op) {
        boolean find = false;
        Operador operador = null;
        int i = 0;
        while(!find && operadores.length > i){
            if(operadores[i].getNombre() == op){
                find = true;
                operador = operadores[i];
            }else{
                i++;
            }
        }
        return operador;
    }

    public String [] getOperadores(){
        return operaciones;
    }
}
