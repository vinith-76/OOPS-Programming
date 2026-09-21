class Rectangle {
    double length;
    double width;

    double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.length = 10;
        rectangle.width = 5;

        System.out.println("Length: " + rectangle.length);
        System.out.println("Width: " + rectangle.width);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
