package com.ebr.classes;

import com.ebr.interfaces.FiguraGeometricaPlana;
import java.text.DecimalFormat;

/**
 *
 * @author Eduardo
 */
public class Circulo implements FiguraGeometricaPlana{

    private int raio;

    public Circulo(int r) {
        this.raio = r;
    }

    public int getRaio() {
        return this.raio;
    }
    
    public void setRaio(int r){
        this.raio = r;
    }
    
    @Override
    public String perimetro() {
        DecimalFormat formato = new DecimalFormat("0.000");
        return "" + formato.format(2*this.raio*Math.PI);
    }
    @Override
    public String area() {
        DecimalFormat formato = new DecimalFormat("0.000");
        return "" + formato.format(this.raio * this.raio * Math.PI);
    }
    @Override
    public String verFigura() {
        return "====================\n"
                + " Circulo\n"
                + "===================="
                + "\nRaio: "
                + this.getRaio()
                + " m.\nArea: "
                + this.area()
                + " m^2.\nPerimetro: "
                + this.perimetro()
                + " m.";
    }

    
}
