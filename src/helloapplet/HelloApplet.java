/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloapplet;

import java.applet.Applet;
import java.awt.Graphics ; 
/**
 *
 * @author gt
 */
public class HelloApplet extends Applet{
    
  public void Paint(Graphics g){ 
 g.drawString("Hello From Java Applet Class", 50, 100); // print this string in graphic object 
 }
    
}
