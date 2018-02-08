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
public class EditAreaMouseInput extends MouseAdapter {

    private final EditAreaController eController;

    private final int heightPanel;
    private final int widthPanel;
    
    
    public EditAreaMouseInput(EditAreaController eController, int h, int w){
        this.heightPanel = h;
        this.widthPanel = w;
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
    //xử lý khi chuột vào EditArea
    @Override
    public void mouseEntered(MouseEvent e){
//        System.out.println("Enter");
        checkMouse(e);
    }
//    xử lý khi chuột ra khỏi EditArea
    @Override
    public void mouseExited(MouseEvent e){
//        System.out.println("Exit");
        checkMouse(e);
    }

    public void checkMouse(MouseEvent e) {
        Point mouseLocation = new Point(e.getX(), e.getY());
        if (checkMouseLocation(mouseLocation)) {
            eController.setCursor(getCellCussor(mouseLocation));
        }
        else {
            eController.setCursor(null);
        }
        eController.update();
    }
    //Kiểm tra vị trí của chuột có hợp lệ hay k?
    private boolean checkMouseLocation(Point mouseLocation) {
        return mouseLocation.x >= 0 && mouseLocation.x <= widthPanel && mouseLocation.y >= 0 && mouseLocation.y <= heightPanel;
    }
    //Phương thức trả về tọa độ Ô đang được chọn trên EditArea 
    private Point getCellCussor(Point mouseLocation) {        
        int newX = ((int) mouseLocation.x / ConfigProgram.cellSize) * ConfigProgram.cellSize;
        int newY = ((int) mouseLocation.y / ConfigProgram.cellSize) * ConfigProgram.cellSize;
        Point newCussor = new Point(newX, newY);
        return newCussor;
    }
}
