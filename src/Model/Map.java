/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author trana
 */
public class Map extends GameObject{

    private Layer mainLayer;
    private Layer subLayer;
    private ArrayList<Point> roadLayer;
    
    public Map(){
        this.mainLayer = new Layer();
        this.subLayer = new Layer();
    }

    public void addMainCell(Point p, ImageIcon img) {
        this.mainLayer.addCell(img, p);
        this.subLayer.deleteCell(p);
    }

    public void addSubCell(Point p, ImageIcon img) {
        this.subLayer.addCell(img, p);
    }

    public void addRoad(Point p){
        this.roadLayer.add(p);
    }
    public void removeRoad(Point p){
        this.roadLayer.remove(p);
    }
    
    @Override
    public void draw(Graphics g){
        this.mainLayer.draw(g);
        this.subLayer.draw(g);
    }
}
