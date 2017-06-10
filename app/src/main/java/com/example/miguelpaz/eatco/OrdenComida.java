package com.example.miguelpaz.eatco;

/**
 * Created by ANDY ESCOBAR 007 on 1/6/2017.
 */
public class OrdenComida {
    private Comida comida;
    private String direcion;
    private double descuento;
    private double totalaPagar;

    public OrdenComida(Comida c,String dir,double descuen){
        this.comida=c;
        this.direcion=dir;
        this.descuento=descuen;
        this.totalaPagar=c.getPrice()*(0.15-descuen)+c.getPrice();
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotalaPagar() {
        return totalaPagar;
    }

    public void setTotalaPagar(double totalaPagar) {
        this.totalaPagar = totalaPagar;
    }
}
