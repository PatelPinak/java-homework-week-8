package p19_cylinder;

/**
 * 2. Write a class with the name Cylinder that extends Circle class. The class needs one field (instance  variable) with name height of type double.
 * The class needs to have one constructor with two parameters radius and height both of type double.  It needs to call the parent constructor and initialize a height field.
 * In case the height parameter is less than 0 it needs to set the height field value to 0.  Write the following methods (instance methods):
 * ● Method named getHeight without any parameters, it needs to return the value of height field.
 * ● Method named getVolume without any parameters, it needs to return the calculated volume.  To calculate volume, multiply the area with height.
 */
public class C02_Cylinder extends C01_Circle {
    double height;

    public C02_Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        if(height > 0){
            return height;
        }else{
            height = 0;
            return height;
        }
    }

    public double getVolume(){
        double area = getArea() * getHeight();
        return area;
    }
}
