package task2;

public class ShapeFactory1 extends AbstractFactory {
    @Override
    public Shape1 getShape1(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle1();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square1();
        }
        return null;
    }
}
