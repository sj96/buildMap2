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
public class Layer {

    private CellImg cells[][];

    public Layer() {
        cells = new CellImg[Controller.ConfigProgram.row][Controller.ConfigProgram.col];
        for (int row = 0; row < Controller.ConfigProgram.row; row++) {
            for (int col = 0; col < Controller.ConfigProgram.col; col++) {
                cells[row][col] = null;
            }
        }
    }

    public void addCell(MapImage img, Point p) {
        cells[p.y][p.x] = new CellImg(img, p);
    }

    public void deleteCell(Point p) {
        cells[p.y][p.x] = null;
    }

    public void updateValue() {
        for (int row = 0; row < Controller.ConfigProgram.row; row++) {
            for (int col = 0; col < Controller.ConfigProgram.col; col++) {
                if (cells[row][col] != null) {
//                    checkValue();
                }
            }
        }
    }

    public void update() {
        for (int row = 0; row < Controller.ConfigProgram.row; row++) {
            for (int col = 0; col < Controller.ConfigProgram.col; col++) {
                if (cells[row][col] != null) {
                    cells[row][col].update();
                }
            }
        }
    }

    public void draw(Graphics g) {
        for (int row = 0; row < Controller.ConfigProgram.row; row++) {
            for (int col = 0; col < Controller.ConfigProgram.col; col++) {
                if (cells[row][col] != null) {
                    cells[row][col].draw(g);
                }
            }
        }
    }
}
