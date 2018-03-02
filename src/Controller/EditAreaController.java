/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
    private Model.Map map;
    private final EditAreaMouseInput mouseInput;
    private final int heightPanel;
    private final int widthPanel;
    private final int distanceLineBG = 6;

    public EditAreaController(View.EditArea ea) {
        this.editArea = ea;
        this.map = new Model.Map();
        this.cursor = null;
        this.heightPanel = (int) ea.getPreferredSize().getHeight();
        this.widthPanel = (int) ea.getPreferredSize().getWidth();
        
        this.mouseInput = new EditAreaMouseInput(this, this.heightPanel, this.widthPanel);
        this.editArea.addMouseListener(mouseInput);
        this.editArea.addMouseMotionListener(mouseInput);
        
        
        System.out.println(this.heightPanel+" "+this.widthPanel);
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
        
        g.setColor(Color.black);
        //row
        for (int i = 1; i < Config.row; i++) {
            g.drawLine(0, i * Config.cellSize, widthPanel, i * Config.cellSize);
        }
        //col
        for (int i = 1; i < Config.col; i++) {
            g.drawLine(i*Config.cellSize, 0, i*Config.cellSize, heightPanel);
        }
    }

    public void drawCursor(Graphics g) {
        if (this.cursor != null) {
            g.setColor(Color.black);
            g.drawRect(this.cursor.x, this.cursor.y, Config.cellSize, Config.cellSize);
            g.drawRect(this.cursor.x + 3, this.cursor.y + 3, Config.cellSize - 6, Config.cellSize - 6);
            g.setColor(Color.white);
            g.drawRect(this.cursor.x + 1, this.cursor.y + 1, Config.cellSize - 2, Config.cellSize - 2);
            g.drawRect(this.cursor.x + 2, this.cursor.y + 2, Config.cellSize - 4, Config.cellSize - 4);
        }
    }

    public void drawMap(Graphics g) {
        map.draw(g);
    }
    
    public void update(){
        this.editArea.repaint();
    }

    public void setCursor(Point c) {
        this.cursor = c;
    }
}
