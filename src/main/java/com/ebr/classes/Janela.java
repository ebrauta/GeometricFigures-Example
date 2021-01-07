package com.ebr.classes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Janela extends JFrame implements ActionListener{
    public Janela(){
        super();
        setTitle("Janela Principal");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JButton btn_ret = new JButton("Retangulo");
        btn_ret.setActionCommand("btnret");
        btn_ret.addActionListener(this);
        add(btn_ret);
        JButton btn_tri = new JButton("Triangulo");
        btn_tri.setActionCommand("btntri");
        btn_tri.addActionListener(this);
        add(btn_tri);
        JButton btn_cir = new JButton("Circunferencia");
        btn_cir.setActionCommand("btncir");
        btn_cir.addActionListener(this);
        add(btn_cir);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getActionCommand() == "btnret"){
             String txtalt = JOptionPane.showInputDialog("Digite a altura (em m): ");
             String txtlar = JOptionPane.showInputDialog("Digite a largura (em m): ");
             try{
               int alt, lar;
               if(txtalt == null || txtalt.isBlank()){
                    alt = 0;
               } else {
                    alt = Integer.parseInt(txtalt);
               }
               if(txtlar == null || txtlar.isBlank()){
                    lar = 0;
               } else {
                    lar = Integer.parseInt(txtlar);
               }
               Retangulo ret = new Retangulo(alt,lar);
               JOptionPane.showMessageDialog(null, ret.verFigura());
               
               
             } catch(NumberFormatException err){
                 JOptionPane.showMessageDialog(null, "Erro: N�o foi inserido um n�mero corretamente");
             }

         } else if(e.getActionCommand() == "btntri"){
             String txtld1 = JOptionPane.showInputDialog("Digite o primeiro lado (em m): ");
             String txtld2 = JOptionPane.showInputDialog("Digite o segundo lado (em m): ");
             String txtld3 = JOptionPane.showInputDialog("Digite o terceiro lado (em m): ");
             try{
               int ld1, ld2, ld3;
               if(txtld1 == null || txtld1.isBlank()){
                    ld1 = 0;
               } else {
                    ld1 = Integer.parseInt(txtld1);
               }
               if(txtld2 == null || txtld2.isBlank()){
                    ld2 = 0;
               } else {
                    ld2 = Integer.parseInt(txtld2);
               }
               if(txtld3 == null || txtld3.isBlank()){
                    ld3 = 0;
               } else {
                    ld3 = Integer.parseInt(txtld3);
               }
               Triangulo tri = new Triangulo(ld1,ld2,ld3);
                JOptionPane.showMessageDialog(null, tri.verFigura());
               
             } catch(NumberFormatException err){
                 JOptionPane.showMessageDialog(null, "Erro: N�o foi inserido um n�mero corretamente");
             }
             
         } else if(e.getActionCommand() == "btncir"){
             String txtr = JOptionPane.showInputDialog("Digite o raio (em m): ");
             try{
                int raio;
                if(txtr == null || txtr.isBlank()){
                    raio = 0;
                } else {
                    raio = Integer.parseInt(txtr);
                }
                Circulo cir = new Circulo(raio);
                JOptionPane.showMessageDialog(null, cir.verFigura());
             } catch(NumberFormatException err){
                 JOptionPane.showMessageDialog(null, "Erro: N�o foi inserido um n�mero corretamente");
             }
         }
    }
}
