import processing.core.PApplet;

public class Problem01 extends PApplet {
    String description = "";

    private float starterX;
    private float starterY;
    private float rectHeight;
    private float rectWidth;

    @Override
    public void settings() {
        fullScreen();
    }

    @Override
    public void setup() {
        textAlign(CENTER, CENTER);
        textSize(30.0f);

        rectWidth = width / 3f;
        rectHeight = height / 8f;
        starterX = width / 3f;
        starterY = height/4f;
    }

    @Override
    public void draw() {
        background(255);

        String[] texts = {"Java", "JavaScript", "C++", "C#"};

        for (int i = 0; i < texts.length; i++) {
            float y = starterY + i * rectHeight;

            fill(0, 0, 255);
            rect(starterX, y, rectWidth, rectHeight);

            if (mouseOver(starterX, y, rectWidth, rectHeight)) {
                fill(255, 0, 0);
                description = texts[i];
            } else {
                fill(255);
            }
            text(texts[i], starterX + rectWidth / 2f, y + rectHeight / 2f);
        }

        fill(0);
        text(description, width / 2f, height - 50);
    }

    private boolean mouseOver(float x, float y, float w, float h) {
        return mouseX >= x && mouseX <= x + w && mouseY >= y && mouseY <= y + h;
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }
}
