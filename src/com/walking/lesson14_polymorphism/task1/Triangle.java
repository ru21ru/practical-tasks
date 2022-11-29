package src.com.walking.lesson14_polymorphism.task1;

public class Triangle extends TrueFigure{

    public Triangle(int size) {
        super(size);
    }

    @Override
    public void printFigure() {
        for (int i = 0; i < size; i++) {
            printSide(i);
        }
        printSide(size + 1);
    }
    public void printSide(int length){
        String result = "";
        if (length == 0) {
            result = repeatSymbol(BODY, size) + ANGLE;
        }
        else if (length == size + 1){
            result = ANGLE + repeatSymbol(DOWN, length * 2 - 3) + ANGLE;
        }
        else {

            result = repeatSymbol(BODY, size - length );
            result = result + TRIANGLE_LEFT_SIDE + repeatSymbol(BODY, length*2-1) + TRIANGLE_RIGHT_SIDE;
            }
        System.out.println(result);
    }

    private String repeatSymbol(String symbol, int length){
        String result = "";
        for (int i = 0; i < length; i++) {
            result = result + symbol;
        }
        return result;
    }
}
