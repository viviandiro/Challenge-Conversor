/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monedas;

/**
 *
 * @author VivianDiro
 */
public class ConvertidorTemperature {

    private double resultado;

    public double CelsiusFarenheit(double valor) {

        this.resultado = (valor * 9) / 5 + 32;

        System.out.println("ingresotemperarura: " + resultado);
        resultado = Math.round(resultado * 100.0) / 100.0;

        return this.resultado;

    }

    public double FarenheitCelsius(double valor) {

        this.resultado = (valor - 32) * 5 / 9;

        System.out.println("ingresotemperarura: " + resultado);
        resultado = Math.round(resultado * 100.0) / 100.0;

        return this.resultado;

    }

    public double getResultado() {
        return resultado;
    }

}
