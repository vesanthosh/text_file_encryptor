/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfencry;

import java.awt.Color;

/**
 *
 * @author SANDY
 */
public class TFEncry_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TFEncry_INTF tfintf = new TFEncry_INTF();
        tfintf.setVisible(true);
        tfintf.setLocationRelativeTo(null);
        tfintf.getContentPane().setBackground(new Color(255, 255, 255));
    }
    
}
