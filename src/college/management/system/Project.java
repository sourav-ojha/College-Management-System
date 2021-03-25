/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college.management.system;

/**
 *
 * @author subha
 */

import java.awt.*;
import javax.swing.*;

public class Project extends JFrame {
    Project(){
        super("College Management System");
        
        setSize(1920,1030);
        
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("college/management/system/icons/third.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1900, 950,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        
        add(l1);
}
    public static void main(String args[]){
        new Project().setVisible(true);
    }
}