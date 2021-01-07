package com.ebr.classes;

import com.ebr.interfaces.FiguraGeometricaPlana;
import java.text.DecimalFormat;

/**
 *
 * @author Eduardo
 */
public class Triangulo implements FiguraGeometricaPlana {

    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int ld1, int ld2, int ld3) {
        this.lado1 = ld1;
        this.lado2 = ld2;
        this.lado3 = ld3;
    }

    public Triangulo(){}
    
    public int getLado1() {
        return this.lado1;
    }

    public int getLado2() {
        return this.lado2;
    }

    public int getLado3() {
        return this.lado3;
    }
    
    public void setLado1(int ld1){
        this.lado1 = ld1;
    }
    
    public void setLado2(int ld2){
        this.lado1 = ld2;
    }
    
    public void setLado3(int ld3){
        this.lado1 = ld3;
    }
    
    @Override
    public String perimetro() {
        DecimalFormat formato = new DecimalFormat("0.000");
        return "" + formato.format(this.lado1 + this.lado2 + this.lado3);
    }
    
    @Override
    public String area() {
        double p = (this.lado1 + this.lado2 + this.lado3)/ 2;       
        double form = (p * (p - this.lado1) * (p - this.lado2) * (p - this.lado3));
        DecimalFormat formato = new DecimalFormat("0.000");
        return "" + formato.format(Math.sqrt(form));
    }
    
    public boolean isTriangulo(){
        boolean tri;
             
        if(lado1 > lado2){
            if(lado1 > lado3){
                tri = lado1 < lado2 + lado3;
            } else {
                tri = lado3 < lado1 + lado2;
            }
        } else{
            if(lado2 > lado3){
                tri = lado2 < lado1 + lado3;
            } else {
                tri = lado3 < lado1 + lado2;
            }
        }      
        return tri;
    }
    
    public String tipoDeTriangulo(){
        String[] tipo = {"Escaleno","Isosceles","Equilatero"};
        int numLados;
        if(lado1==lado2){
            if(lado2 == lado3){
                numLados = 2;
            } else {
                numLados = 1;
            }
        } else {
            if(lado2 == lado3){
                numLados = 1;
            } else {
                numLados = 0;
            }           
        }
        return "Triangulo " + tipo[numLados];
    }
    
    @Override
    public String verFigura(){
        String texto = "";
        if(!isTriangulo()){
            texto += "====================\n N�o � um triangulo!!! \n====================";
        } else {
            texto += "====================\n  " + tipoDeTriangulo() + "\n====================";
            texto += "\nLado 1: "
                    + this.getLado1()
                    + " m.\nLado 2: "
                    + this.getLado2()
                    + " m.\nLado 3: "
                    + this.getLado3()
                    + " m.\nArea: "
                    + this.area()
                    + " m^2.\nPerimetro: "
                    + this.perimetro()
                    + " m.";
        }
        return texto;
    }
    
     
}
