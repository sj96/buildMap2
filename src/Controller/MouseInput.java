/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author trana
 */
public class MouseInput extends MouseAdapter {

    private final EditAreaController eController;

    private final int heightPanel = 600;
    private final int widthPanel = 800;

    public MouseInput(EditAreaController eController) {
        this.eController = eController;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Click");        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Released");        
    }

    @Override
    public void mouseDragged(MouseEvent e) {        
        System.out.println("Dragging");
    }

    @Override
    public void mouseMoved(MouseEvent e) {  
//        System.out.println("Moving");
        checkMouse(e);
    }
    
    @Override
    public void mouseEntered(MouseEvent e){
        System.out.println("Enter");
        checkMouse(e);
    }
    @Override
    public void mouseExited(MouseEvent e){
        System.out.println("Exit");
        checkMouse(e);
    }

    public void checkMouse(MouseEvent e) {
        Point mouse = new Point(e.getX(), e.getY());
        if (checkMouseLocation(mouse)) {
            eController.setCursor(getCellCussor(mouse));
        }
        else {
            eController.setCursor(null);
        }
        eController.update();
    }

    private boolean checkMouseLocation(Point mouse) {
        return mouse.x >= 0 && mouse.x <= widthPanel && mouse.y >= 0 && mouse.y <= heightPanel;
    }

    private Point getCellCussor(Point mouse) {        
        int newX = ((int) mouse.x / ConfigProgram.cellSize) * ConfigProgram.cellSize;
        int newY = ((int) mouse.y / ConfigProgram.cellSize) * ConfigProgram.cellSize;
        Point newCussor = new Point(newX, newY);
        return newCussor;
    }
}
