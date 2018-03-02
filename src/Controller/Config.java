package Controller;

public class Config {

    public static int cellSize = 55;
    public static int usestampButtonSize = 40;
    public static final int row = 10;
    public static final int col = 15;
    public static int frameInSec = 5;

    public static int frameNow = 1;

    private static int MaxFrameOfMap = 3;

    public static int timeOfFrame() {
        return (int) 100 / frameInSec;
    }

    public static void frameChange() {
        frameNow++;
        if (frameNow > MaxFrameOfMap) {
            frameNow = 1;
        }
    }

}
