/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Graphics;
import java.awt.Point;
import javax.swing.ImageIcon;

/**
 *
 * @author trana
 */
public class MapImage {
    private final ImageIcon img;
    private final Point p;
    
    public MapImage(ImageIcon img, Point p){
        this.img = img;
        this.p = p;
    }
    
    public void draw(Graphics g){
        
    }
}
