import processing.core.PApplet;

public class FourBalls extends PApplet {
    public static final int ballWidth = 700;
    public static final int ballHeight = 550;
    public static final int ballDiameter = 40;

    Ball ball1;
    Ball ball2;
    Ball ball3;
    Ball ball4;

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(ballWidth, ballHeight);
    }

    @Override
    public void setup() {
        ball1 = new Ball(0, ballHeight * 1 / 5, 1);
        ball2 = new Ball(0, ballHeight * 2 / 5, 2);
        ball3 = new Ball(0, ballHeight * 3 / 5, 3);
        ball4 = new Ball(0, ballHeight * 4 / 5, 4);
    }

    @Override
    public void draw() {
        background(555);
        ball1.move();
        ball2.move();
        ball3.move();
        ball4.move();
        ball1.display();
        ball2.display();
        ball3.display();
        ball4.display();
    }

    public class Ball {
        private float x;
        private float y;
        private int speed;

        public Ball(float x, float y, int speed) {
            this.x = x;
            this.y = y;
            this.speed = speed;
        }

        public void move() {
            x += speed;
        }

        public void display() {
            ellipse(x, y, ballDiameter, ballDiameter);
        }
    }
}
