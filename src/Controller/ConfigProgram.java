package Controller;


public class ConfigProgram {

    public static int cellSize = 20;
    public static final int row = 30;
    public static final int col = 40;
    public static int frameInSec = 5;

    public static int timeOfFrame() {
        return (int) 100 / frameInSec;
    }
}
