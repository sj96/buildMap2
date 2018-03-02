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
public class Cell {

    private ImageIcon image;
    private int frame;
    private Point p;

    public Cell(ImageIcon img, Point p) {
        this.frame = 0;
        this.p = p;
    }

    public void setImage(ImageIcon img) {
        this.image = img;
    }

    public void draw(Graphics g) {
        
    }

    public void update() {
        this.frame++;
    }
}
