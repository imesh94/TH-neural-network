/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import th.TH;

/**
 *
 * @author imesh
 */
public final class guiFunctions {
    
    public static void btnClick(javax.swing.JButton btn){
        if(btn.getBackground() == Color.white){
           btn.setBackground(Color.blue); 
        }else{
            btn.setBackground(Color.white);
        }
        
    }
    
    public static char showOutput(javax.swing.JButton[] btnArr){
        int[] a1 = {0, 0, 0};
        int[] a2 = {0, 0, 0};
        int[] a3 = {0, 0, 0};
        
        a1[0] = btnArr[0].getBackground() == Color.blue ?  1: 0;
        a1[1] = btnArr[1].getBackground() == Color.blue ?  1: 0;
        a1[2] = btnArr[2].getBackground() == Color.blue ?  1: 0;
        a2[0] = btnArr[3].getBackground() == Color.blue ?  1: 0;
        a2[1] = btnArr[4].getBackground() == Color.blue ?  1: 0;
        a2[2] = btnArr[5].getBackground() == Color.blue ?  1: 0;
        a3[0] = btnArr[6].getBackground() == Color.blue ?  1: 0;
        a3[1] = btnArr[7].getBackground() == Color.blue ?  1: 0;
        a3[2] = btnArr[8].getBackground() == Color.blue ?  1: 0;
        
        TH th = new TH();
        return th.calcOutput(a1, a2, a3);
    }
    
}
