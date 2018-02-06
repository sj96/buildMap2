/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Graphics;

/**
 *
 * @author trana
 */
public class CellMap {

    private final Image[] image;

    public CellMap() {
        image = new Image[2];
    }

    public void setValueImage(int value, int index) {
        if (index > 1 || index < 0) {
            throw new UnsupportedOperationException("IndexImageNotExits");
        } else {
            image[index].setValueImage(value);
        }
    }
    
    public void draw(Graphics g){
        
    }
}
