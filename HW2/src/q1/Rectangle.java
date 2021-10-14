package q1;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int side){
        this.width = side;
        this.height = side;
    }
    public Rectangle(int width,int height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(String name,String color,int width,int height){
        super(name, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width*height;
    }
    @Override
    public int getPerimeter() {
        return 2*(width+height);
    }
    @Override
    public String printShape(){
        return "The Rectangle has a " + this.getColor() + " color";
    }
}
