/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Config;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author trana
 */
public class UseStampButton extends javax.swing.JLabel {

    private boolean isHover = false;
    private Image img;

    public UseStampButton(Image img) {
        this.img = img;
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, Controller.Config.usestampButtonSize, Controller.Config.usestampButtonSize, 0, 0, img.getWidth(this) / 6, img.getHeight(this) / 3, this);
        if (isHover){
            g.setColor(Color.black);
            g.drawRect(0,0, Controller.Config.usestampButtonSize, Controller.Config.usestampButtonSize);
            g.drawRect(3, 3, Controller.Config.usestampButtonSize - 6, Controller.Config.usestampButtonSize - 6);
            g.setColor(Color.white);
            g.drawRect(1, 1, Controller.Config.usestampButtonSize - 2, Controller.Config.usestampButtonSize - 2);
            g.drawRect(2, 2, Controller.Config.usestampButtonSize - 4, Controller.Config.usestampButtonSize - 4);
        }
    }

    public void setHover(boolean isHover) {
        this.isHover = isHover;
    }
}
