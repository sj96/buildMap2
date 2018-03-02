/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.ImageIcon;

/**
 *
 * @author trana
 */
public class Source {
    public static ImageIcon[] imageList;    
    
    public static final void LoadSource(){
        
        Source.loadImage();
    }
    
    public static void loadImage(){
        imageList = new ImageIcon[3];
        imageList[0] = new ImageIcon("nendong23/ho_nuoc2.png");
        imageList[1] = new ImageIcon("nen/da.png");
        imageList[2] = new ImageIcon("nen/co.png");
    }
    
    public static int getSizeList(){
        return imageList.length;
    }
}
