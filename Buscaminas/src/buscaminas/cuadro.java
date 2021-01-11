/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import javax.swing.JButton;

/**
 *
 * @author Juan Pablo
 */
public class cuadro extends JButton {
    boolean mina;
    
    public cuadro(double v){
        super();
        double random = Math.random();
        if(random <= v ){
            mina = true;
        }else{
            mina = false;
        }
    }
    
    public boolean estaMinado(){
        return mina;
    }
}
