package src.com.walking.lesson14_polymorphism.task1;

public class TrueFigure {
    static final String DOWN = "-";
    static final String RECTANGLE_SIDE = "|";
    static final String TRIANGLE_LEFT_SIDE = "/";
    static final String TRIANGLE_RIGHT_SIDE = "\\";
    static final String ANGLE = "*";
    static final String BODY = " ";

    final int size;

    public TrueFigure(int size){
        this.size = size;
    }

    public void printFigure() {}

}
