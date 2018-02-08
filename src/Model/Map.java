/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author trana
 */
public class Map {

    private Layer mainlayer;
    private Layer sublayer;
    private Layer decortatelayer;
    private ArrayList<Point> roadLayer;

    public void addMainCell(Point p, MapImage img) {
        mainlayer.addCell(img, p);
        sublayer.deleteCell(p);
        decortatelayer.deleteCell(p);
    }

    public void addSubCell(Point p, MapImage img) {
        sublayer.addCell(img, p);
        decortatelayer.deleteCell(p);
    }

    public void addDecortateCell(Point p, MapImage img) {
        decortatelayer.addCell(img, p);
    }
    public void addRoad(Point p){
        roadLayer.add(p);
    }
    public void removeRoad(Point p){
        roadLayer.remove(p);
    }
    
    public void draw(Graphics g){
        mainlayer.draw(g);
    }
}
