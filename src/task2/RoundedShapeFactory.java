package task2;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape1 getShape1(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}