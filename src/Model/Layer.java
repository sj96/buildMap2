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
public class Layer {

    private Cell cells[][];

    public Layer() {
        cells = new Cell[Controller.Config.row][Controller.Config.col];
        for (int row = 0; row < Controller.Config.row; row++) {
            for (int col = 0; col < Controller.Config.col; col++) {
                cells[row][col] = null;
            }
        }
    }

    public void addCell(ImageIcon img, Point p) {
        cells[p.y][p.x] = new Cell(img, p);
    }

    public void deleteCell(Point p) {
        cells[p.y][p.x] = null;
    }

    public void draw(Graphics g) {
        for (int row = 0; row < Controller.Config.row; row++) {
            for (int col = 0; col < Controller.Config.col; col++) {
                if (cells[row][col] != null) {
                    cells[row][col].draw(g);
                }
            }
        }
    }
}
