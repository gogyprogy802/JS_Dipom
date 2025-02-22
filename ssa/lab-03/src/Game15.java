import processing.core.PApplet;

public class Game15 extends PApplet {

    private int[][] gameField;
    private float x;
    private float y;

    private float extent;
    @Override
    public void settings() {
        fullScreen();
    }

    @Override
    public void setup() {
        gameField = new int[4][4];
        int[] numbers = new int[16];
        for (int i = 0; i < 16; i++) {
            numbers[i] = i + 1;
        }

        shuffleArray(numbers);

        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                gameField[i][j] = numbers[index++];
            }
        }

        x = width / 3f;
        y = 200f;
        extent = (width / 3f) / 4;
    }

    private void shuffleArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int j = (int) random(i + 1); // Случайный индекс от 0 до i
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    @Override
    public void draw() {
        background(0);
        init();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (gameField[i][j] != 16) {
                    fill(255, 255, 0);
                    textSize(40);
                    text(gameField[i][j], x + extent * j + extent / 2f - 20, y + i * extent + extent / 2f + 10);
                }
            }
        }
    }

    public void init(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                fill(100,0, 255);
                square(x+extent*i, y+j*extent, extent);
            }
        }
    }
    @Override
    public void keyPressed(){
        switch (keyCode){
            case UP:
                move("up");
                break;
            case DOWN:
                move("down");
                break;
            case LEFT:
                move("left");
                break;
            case RIGHT:
                move("right");
                break;
            default:
                fill(0,255,0);
                textSize(100);
                text("You pressed incorrect button!!!",width/2f, height/2f);
                break;
        }
    }

    public void move(String direction) {
        boolean isFound = false;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (gameField[i][j] == 16) {
                    switch (direction) {
                        case "up":
                            if (i >= 1) {
                                swap(i, j, i - 1, j);
                                isFound = true;
                            }
                            break;
                        case "down":
                            if (i < 3) {
                                swap(i, j, i + 1, j);
                                isFound = true;
                            }
                            break;
                        case "left":
                            if (j >= 1) {
                                swap(i, j, i, j - 1);
                                isFound = true;
                            }
                            break;
                        case "right":
                            if (j < 3) {
                                swap(i, j, i, j + 1);
                                isFound = true;
                            }
                            break;
                    }
                    if (isFound) break;
                }
            }
            if (isFound) break;
        }
    }

    private void swap(int x1, int y1, int x2, int y2) {
        int temp = gameField[x1][y1];
        gameField[x1][y1] = gameField[x2][y2];
        gameField[x2][y2] = temp;
    }


    public static void main(String[] args) {
        PApplet.main("Game15");
    }
}