import task1.*;
import task2.AbstractFactory;
import task2.FactoryProducer;
import task2.Shape1;

public class Main {
    public static void main(String[] args) {
        //Task1
//        ShapeFactory shapeFactory = new ShapeFactory();
//        Shape shape1 = shapeFactory.getShape("CIRCLE");
//        shape1.draw();
//        Shape shape2 = shapeFactory.getShape("RECTANGLE");
//        shape2.draw();
//        Shape shape3 = shapeFactory.getShape("SQUARE");
//        shape3.draw();

        //Task2
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(false);
        Shape1 shape1 = shapeFactory1.getShape1("RECTANGLE");
        shape1.draw();
        Shape1 shape2 = shapeFactory1.getShape1("SQUARE");
        shape2.draw();
        AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);
        Shape1 shape3 = shapeFactory2.getShape1("RECTANGLE");
        shape3.draw();
        Shape1 shape4 = shapeFactory2.getShape1("SQUARE");
        shape4.draw();

    }
}