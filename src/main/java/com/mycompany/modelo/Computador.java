/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author brian.7908
 */
public class Computador extends Produto{
    private Double memRAM;
    private String proc;

    public Computador() {
    }

    public Double getMemRAM() {
        return memRAM;
    }

    public void setMemRAM(Double memRAM) {
        this.memRAM = memRAM;
    }

    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + 
                   " | Preço: " + super.getPreço() + 
                   " | Memória RAM: " + this.memRAM +
                   " | Processador: " + this.proc;
    }
}
