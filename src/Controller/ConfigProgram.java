package Controller;


public class ConfigProgram {

    public static int cellSize = 55;
    public static final int row = 10;
    public static final int col = 15;
    public static int frameInSec = 5;

    public static int timeOfFrame() {
        return (int) 100 / frameInSec;
    }
}
