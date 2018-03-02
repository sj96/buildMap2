/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

/**
 *
 * @author trana
 */
public class UseStampController {

    private View.UseStamp us;

    public UseStampController(View.UseStamp us) {
        this.us = us;
    }

    public void LoadUseStamp() {
        Model.Source.LoadSource();
        if (Model.Source.imageList != null) {
            System.out.println("Loading...");
            final Model.UseStampButton[] useStamp = new Model.UseStampButton[45];
            for (int j = 0; j < 15; j++) {
                for (int i = 0; i < 3; i++) {
                    final Image img = Model.Source.imageList[i].getImage();
                    final int id = j * 3 + i;
                    useStamp[id] = new Model.UseStampButton(img);
                    useStamp[id].addMouseListener(new java.awt.event.MouseAdapter() {
                        @Override
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            System.out.println("Click button " + id);
                        }

                        @Override
                        public void mouseEntered(MouseEvent e) {
                            System.out.println("Enter button " + id);
                            useStamp[id].setHover(true);
                            useStamp[id].repaint();
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                            System.out.println("Exit button " + id);
                            useStamp[id].setHover(false);
                            useStamp[id].repaint();
                        }
                    });
//                    useStamp[id].setSize(Controller.Config.usestampButtonSize, Controller.Config.usestampButtonSize);
                    useStamp[id].setBounds(i * Controller.Config.usestampButtonSize + 2, j * Controller.Config.usestampButtonSize + 2, Controller.Config.usestampButtonSize+1, Controller.Config.usestampButtonSize+1);
                    this.us.add(useStamp[id]);
                    System.out.println("add button " + id);
                };
                this.us.repaint();
            }
        }
    }
}
