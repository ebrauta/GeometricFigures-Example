package com.ebr.classes;

import com.ebr.interfaces.FiguraGeometricaPlana;
import java.text.DecimalFormat;

/**
 *
 * @author Eduardo
 */
public class Retangulo implements FiguraGeometricaPlana{

    private int altura;
    private int largura;

    public Retangulo(int alt, int lar) {
        this.altura = alt;
        this.largura = lar;
    }
    public Retangulo(){}

    public int getAltura() {
        return this.altura;
    }

    public int getLargura() {
        return this.largura;
    }

    public void setAltura(int alt){
        this.altura = alt;
    }
    
    public void setLargura(int lar){
        this.largura = lar;
    }
    
    @Override
    public String area() {
        DecimalFormat formato = new DecimalFormat("0.000");
        return "" + formato.format( this.altura * this.largura);
    }

    @Override
    public String perimetro() {
        DecimalFormat formato = new DecimalFormat("0.000");
        return "" + formato.format( 2 * this.altura + 2 * this.largura);
    }

    public boolean isQuadrado(){
        if(this.altura == this.largura){
            return true;
        }
       return false;
    }
        
    @Override
    public String verFigura() {
        String texto = "";
        if(!isQuadrado()){
            texto += "====================\n  Retangulo\n======================";
        } else {
            texto += "====================\n  Quadrado\n======================";
        }
        texto += "\nAltura: "
                + this.getAltura()
                + " m.\nLargura: "
                + this.getLargura()
                + " m.\nArea: "
                + this.area()
                + " m^2.\nPerimetro: "
                + this.perimetro()
                + " m.";
        return texto;
    }
    
}
