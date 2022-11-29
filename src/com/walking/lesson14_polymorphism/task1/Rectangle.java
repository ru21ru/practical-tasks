package src.com.walking.lesson14_polymorphism.task1;

public class Rectangle extends TrueFigure{
    public Rectangle(int size) {
        super(size);
    }

    @Override
    public void printFigure() {
        printSide(ANGLE, DOWN+DOWN, size);
        for (int i = 0; i < size; i++) {
            printSide(RECTANGLE_SIDE, BODY + BODY, size);
        }
        printSide(ANGLE, DOWN+DOWN, size);
    }
    void printSide(String symbolSide, String symbolBody, int length){
        String body = "";
        for (int i = 0; i < length ; i++) {
            body = body + symbolBody;
        }
        System.out.println(symbolSide + body + symbolSide);
    }

}
