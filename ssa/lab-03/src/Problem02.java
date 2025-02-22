import processing.core.PApplet;

public class Problem02 extends PApplet {

    private float dynamicSize;
    private float messageSize;

    private float red;
    private float green;
    private float blue;
    @Override
    public void settings() {
        fullScreen();
    }

    @Override
    public void setup() {
        messageSize = 20f;
        dynamicSize = 1f;
        red = 255;
        green = 0;
        blue = 0;
    }

    @Override
    public void draw() {
        background(0,0,0);
        fill(red,green,blue);
        textSize(messageSize);
        textAlign(CENTER, CENTER);
        text("Hello, Processing!!!", width / 2f, height / 2f);
        messageSize += dynamicSize;
        if (messageSize >= 100){
            dynamicSize *= -1;
        }
        if (messageSize <= 20){
            dynamicSize *= -1;
            float temp = red;
            red = green;
            green = temp;

            temp = red;
            red = blue;
            blue = temp;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}
