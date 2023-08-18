/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monedas;

/**
 *
 * @author VivianDiro
 */
public class ConvertidorMonedas {

    private double resultado;
    

    public double PesoaDolar(double valor) {

        this.resultado = valor / 4455.09;

        System.out.println("ingreso: " + resultado);
        resultado = Math.round(resultado * 100.0) / 100.0;

        return this.resultado;

    }
   
  
    public double DolaraPeso(double valor) {

        this.resultado = valor * 4455.09;

        System.out.println("ingreso: " + resultado);
        resultado = Math.round(resultado * 100.0) / 100.0;

        return this.resultado;

    }
    public double PesoaEuro(double valor) {

        this.resultado = valor / 4555.17 ;

        System.out.println("ingreso: " + resultado);
        resultado = Math.round(resultado * 100.0) / 100.0;

        return this.resultado;

    }

    public double EuroaPeso(double valor) {

        this.resultado = valor  * 4555.17;

        System.out.println("ingreso: " + resultado);
        resultado = Math.round(resultado * 100.0) / 100.0;

        return this.resultado;

    }
    public double PesoaLibras(double valor) {

        this.resultado = valor / 5314.10;

        System.out.println("ingreso: " + resultado);
        resultado = Math.round(resultado * 100.0) / 100.0;

        return this.resultado;

    }

    public double LibraPeso(double valor) {

        this.resultado = valor * 5314.10;

        System.out.println("ingreso: " + resultado);
        resultado = Math.round(resultado * 100.0) / 100.0;

        return this.resultado;

    }
   
   

    public double getResultado() {
        return resultado;
    }


}
