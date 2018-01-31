/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CellData;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author trana
 */
public class EditAreaController {

    View.EditArea editArea;
    private Point cursor;
    private final CellData[][] data;
    private final MouseInput mouseInput;
    private final int heightPanel = 600;
    private final int widthPanel = 800;
    private int distanceLineBG = 6;

    public EditAreaController(View.EditArea ea) {
        this.editArea = ea;
        this.data = null;
        this.cursor = null;
        this.mouseInput = new MouseInput(this);
        this.editArea.addMouseListener(mouseInput);
        this.editArea.addMouseMotionListener(mouseInput);

//        this.cursor = new Point(0, 0);
    }

    public void drawGridBackGround(Graphics g) {
        int maxLine = widthPanel * 2 / distanceLineBG;
        //draw row line    
        g.setColor(Color.white);
        for (int i = 1; i <= maxLine; i++) {
            g.drawLine(0, i * distanceLineBG, i * distanceLineBG, 0);
        }
        for (int i = 1; i <= maxLine; i++) {
            g.drawLine(widthPanel, i * distanceLineBG, widthPanel - i * distanceLineBG, 0);
        }
    }

    public void drawCursor(Graphics g) {
        if (this.cursor != null) {
            g.setColor(Color.black);
            g.drawRect(this.cursor.x, this.cursor.y, ConfigProgram.cellSize, ConfigProgram.cellSize);
            g.drawRect(this.cursor.x + 3, this.cursor.y + 3, ConfigProgram.cellSize - 6, ConfigProgram.cellSize - 6);
            g.setColor(Color.white);
            g.drawRect(this.cursor.x + 1, this.cursor.y + 1, ConfigProgram.cellSize - 2, ConfigProgram.cellSize - 2);
            g.drawRect(this.cursor.x + 2, this.cursor.y + 2, ConfigProgram.cellSize - 4, ConfigProgram.cellSize - 4);
        }
    }

    public void drawData(Graphics g) {

    }
    
    public void update(){
        this.editArea.repaint();
    }

    public void setCursor(Point c) {
        this.cursor = c;
    }
}
