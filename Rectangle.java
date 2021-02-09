public class Rectangle {
    private double length=1.0f;
    private double width=1.0f;
    public Rectangle(){
    }
    public Rectangle(double lenght, double width){
        this.length= lenght;
        this.width= width;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ", width=" + width +
                ']';
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimiter(){
        return 2*width+2*length;
    }
    public double getDiagonal(){
        return width*width+length*length;
    }
    public boolean isSquare(){
        if (length==width){
            return true;
        }
        else{
           return false;
        }
    }
}
