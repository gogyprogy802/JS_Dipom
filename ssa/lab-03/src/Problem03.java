import processing.core.PApplet;
import java.util.Random;

public class Problem03 extends PApplet {

    private float x;
    private float y;
    private float speedX;
    private float speedY;
    private int rad;

    private int[][] colors;
    private int currentColorIndex;

    @Override
    public void settings() {
        fullScreen();
    }

    @Override
    public void setup() {
        x = width / 2f;
        y = height / 2f;

        speedX = 5f;
        speedY = 5f;

        rad = 100;

        colors = new int[][]{
                {255, 0, 0},
                {0, 255, 0},
                {0, 0, 255},
                {255, 255, 0}
        };

        currentColorIndex = 0;
    }

    @Override
    public void draw() {
        background(0, 0, 0);

        fill(colors[currentColorIndex][0], colors[currentColorIndex][1], colors[currentColorIndex][2]);
        circle(x, y, rad);

        x += speedX;
        y += speedY;

        if (x >= width - rad / 2f || x <= rad / 2f) {
            speedX *= -1;
            changeColor();
        }
        if (y >= height - rad / 2f || y <= rad / 2f) {
            speedY *= -1;
            changeColor();
        }
    }

    private void changeColor() {
        Random random = new Random();
        int newColorIndex;
        do {
            newColorIndex = random.nextInt(colors.length);
        } while (newColorIndex == currentColorIndex); // Чтобы избежать выбора того же цвета
        currentColorIndex = newColorIndex;
    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }
}
