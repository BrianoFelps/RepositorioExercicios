/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Calculadora_orientada_a_objetos;

/**
 *
 * @author brian.7908
 */
public class Calculadora {
    private float resultado;

    public Calculadora() {
    }

    //nao se acessa a variavel resultado diretamente, ela é acessível por meio dos métodos, que são públicos.

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    //assim que serem fornecidos os valores, eles entram nesse método, e o fazem apresentando o resultado.
    //o void é uma função sem retorno. Quando é colocado float em seu lugar, é informado que deve ser retornado um valor float após o processamento do método.
    public float somar(float a, float b){
        //setResultado(a+b);
        return a+b;
    }
    
    public float subtrair(float a, float b){
        //setResultado(a-b);
        return a-b;
    }
    
    public float multiplicar(float a, float b){
        //setResultado(a*b);
        return a*b;
    }
    
    public float dividir(float a, float b){
        if(b > 0){
        //setResultado(a/b);
        return a/b;
        }
        else{
            System.out.println("Não é possível dividir o valor com 0!");
            //setResultado(Float.NaN);//numero não existente NaN
            return Float.NaN;
        }
    }
}
