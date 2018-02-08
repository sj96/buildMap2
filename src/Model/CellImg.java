/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author trana
 */
public class CellImg {

    private MapImage image;
    private int value;
    private int frame;
    private Point p;

    public CellImg(MapImage img, Point p) {
        this.frame = 0;
        this.p = p;
    }

    public void setImage(MapImage img) {
        this.image = img;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void draw(Graphics g) {
        this.image.draw(g, value, frame);
    }

    public void update() {
        this.frame++;
    }
}
