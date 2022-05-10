package task1;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of task1.Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of task1.Circle
        shape1.draw();

        //get an object of task1.Rectangle1 and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of task1.Rectangle1
        shape2.draw();

        //get an object of task1.Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of square
        shape3.draw();
    }
}