package q1;

public class Square extends Shape{
    private int side;

    public Square(int side){
        this.side = side;
    }

    public Square(String name,String color,int side){
        super(name, color);
        this.side = side;
    }

    @Override
    public int getArea() {
        return side*side;
    }
    @Override
    public int getPerimeter() {
        return side*4;
    }
    @Override
    public String printShape(){
        return "The Square has a " + this.getColor() + " color";
    }
}
