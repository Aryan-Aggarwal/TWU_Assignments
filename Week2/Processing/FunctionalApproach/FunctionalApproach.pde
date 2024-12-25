import processing.core.PApplet;

public class FunctionalApproach extends PApplet{

    public static void main(String[] args) {
        PApplet.main("Main",args);
    }

    public static final int Height = 500;
    public static final int Width = 1000;
    public static final int Diameter = 12;
    int [] frameRate = { 1 , 2 , 3 , 4};
    float [] Heigths = {(Height / 5),(Height / 5)*2 , (Height / 5) * 3 , (Height / 5) * 4};

    @Override
    public void settings() {
        super.settings();
        size(Width , Height);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        DrawMovingCircles();
    }

    private void DrawMovingCircles(){
        for (int i = 1; i < 5; i++) {
            ellipse( frameRate[i-1],Heigths[i-1], Diameter,Diameter);
            frameRate[i-1] += i;
        }
    }
}

