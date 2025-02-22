import processing.core.PApplet;
import java.security.Key;

public class Main extends PApplet {

    private Game2048 logicFor2048;

    @Override
    public void settings() {
        fullScreen();
    }

    @Override
    public void setup() {
        logicFor2048 = new Game2048();
    }

    @Override
    public void draw() {
        background(0);

        drawBoard();

    }

    private void drawBoard() {
        float leftBorder = width / 3f;
        float topBorder = 200;
        float rectWidthSize = leftBorder / 4;
        float rectHeightSize = leftBorder / 4;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                fill(150, 0, 45);
                rect(leftBorder + j * rectWidthSize, topBorder + i * rectHeightSize, rectWidthSize, rectHeightSize);
                fill(256, 256, 256);
                textSize(50);
                text(logicFor2048.getCoordinates(i, j), leftBorder + j * rectWidthSize + (rectWidthSize / 4) + 20 , topBorder + i * rectHeightSize + (rectHeightSize / 4)+40);
            }
        }
    }

    @Override
    public void keyPressed(){
        switch (keyCode){
            case RIGHT:
                logicFor2048.moveRight();
                logicFor2048.randomNumber();
                drawBoard();

                break;
            case LEFT:
                logicFor2048.moveLeft();
                logicFor2048.randomNumber();
                drawBoard();
                break;
            default:
                break;
        }
    }


    public static void main(String[] args) {
        PApplet.main("Main");
    }

}