import java.util.LinkedList;
import java.util.Scanner;

abstract class Shape {
    public Shape(){}
}

abstract class TwoDimShape extends Shape {
    abstract double getArea();
//        System.out.println("구하고자 하는 도형(원, 사각형, 삼각형)에 맞는 번호 1, 2, 3 입력");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a==1){
//            (Ellipse.Shape) s = new Ellipse();
//            s.getArea();
//        }
//    }
}

class Ellipse extends TwoDimShape{
    double radius;

    public Ellipse(double radius) {
        this.radius = radius;
    }
    double getArea(){
        return 3.14 * radius * radius;
    }
    @Override
    public String toString() {
        return "Ellipse: 면적 = " + getArea();
    }
}

class Rectangle extends TwoDimShape{
    double bottom;
    double height;

    public Rectangle(double bottom, double height){
        this.bottom = bottom;
        this.height = height;
    }
    double getArea(){
        return bottom * height;
    }
    @Override
    public String toString() {
        return "Rectangle: 면적 = " + getArea();
    }
}

class Triangle extends TwoDimShape{
    double bottom;
    double height;

    public Triangle(double bottom, double height){
        this.bottom = bottom;
        this.height = height;
    }
    double getArea(){
        return bottom * height / 2;
    }
    @Override
    public String toString() {
        return "Triangle: 면적 = " + getArea();
    }

}

abstract class ThreeDimShape extends Shape{
    abstract double getVolume();
//        System.out.println("구하고자 하는 도형의 부피 입력");
//    }
}

class Sphere extends ThreeDimShape{
    double radius;
    public Sphere(double radius){
        this.radius = radius;
    }
    double getVolume(){
        return 4 / 3 * 3.14 * radius * radius * radius;
    }
    @Override
    public String toString() {
        return "Sphere: 면적 = " + getVolume();
    }
}
class Cube extends ThreeDimShape{
    double bottom;
    double width;
    double height;
    public Cube(double bottom, double width, double height){
        this.bottom = bottom;
        this.width = width;
        this.height= height;
    }
    double getVolume(){
        return bottom * width * height;
    }
    @Override
    public String toString() {
        return "Cube: 면적 = " + getVolume();
    }
}
class Cylinder extends ThreeDimShape{
    double radius;
    double height;
    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    double getVolume(){
        return radius * radius * 3.14 * height;
    }
    @Override
    public String toString() {
        return "Cylinder: 면적 = " + getVolume();
    }
}



public class Main {
    public static void main(String[] args) {
        //Shape[] s = new Shape[6];

        Scanner sc = new Scanner(System.in);
        LinkedList<Shape> s = new LinkedList<>();

        while (true) {
            for (Shape shape : s) {
                System.out.println(shape);
            }
            System.out.print("1: 원, 2: 사각형, 3: 삼각형, 4: 구, 5: 큐브, 6: 원기둥, 0: 종료 // 번호를 선택: ");
            int a = sc.nextInt();
            if (a == 0)
                break;
            else if (a == 1) {
                System.out.println("반지름 입력: ");
                double radius = sc.nextDouble();
                s.add(new Ellipse(radius));
                continue;
            }
            else if (a == 2) {
                System.out.println("밑변, 높이 입력: ");
                double bottom = sc.nextDouble();
                double height = sc.nextDouble();
                s.add(new Rectangle(bottom, height));
                continue;
            }
            else if (a == 3) {
                System.out.println("밑변, 높이 입력: ");
                double bottom = sc.nextDouble();
                double height = sc.nextDouble();
                s.add(new Triangle(bottom, height));
                continue;
            }
            else if (a == 4){
                System.out.println("반지름 입력: ");
                double radius = sc.nextDouble();
                s.add(new Sphere(radius));
                continue;
            }
            else if (a == 5) {
                System.out.println("밑변, 너비, 높이 입력: ");
                double bottom = sc.nextDouble();
                double width = sc.nextDouble();
                double height = sc.nextDouble();
                s.add(new Cube(bottom, width, height));
                continue;
            }
            else if (a == 6) {
                System.out.println("반지름, 높이 입력: ");
                double radius = sc.nextDouble();
                double height = sc.nextDouble();
                s.add(new Cylinder(radius, height));
                continue;
            }

        }
//        s[0] = new Ellipse(5.0);
//        s[1] = new Rectangle(4.0, 6.0);
//        s[2] = new Triangle(7.0, 8.0);
//        s[3] = new Sphere(3.0);
//        s[4] = new Cube(2.0, 3.0, 4.0);
//        s[5] = new Cylinder(4.0, 7.0);
    }
}