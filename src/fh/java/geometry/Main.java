package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.quadrilateral.Rectangle;
import fh.java.geometry.model.trilateral.RightTriangle;


import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        main.doIt();

    }

    private void doIt() {

        List<GeometricShape> shapeList = new LinkedList<>();

        fillList(shapeList);


        printList(shapeList);

        List<Circle> circleList = new ArrayList<>();

        for (GeometricShape shape : shapeList) {
            if (shape instanceof  Circle){
                circleList.add((Circle) shape);
            }
        }
        System.out.println("--------------------------------------------------------------------------");
        for (Circle circle : circleList) {
            System.out.println(circle);
        }

    }
    //TODO: main() is missing


    public void fillList(List<GeometricShape> shapeList) {

        shapeList.add( new Circle(1,2,3.0));
        shapeList.add( new Circle(2,9,3.0));
        shapeList.add( new Circle(4,2,3.0));
        shapeList.add( new Circle(5,5,3.0));
        shapeList.add( new Circle(8,2,3.0));
        shapeList.add( new Circle(3,7,3.0));
        shapeList.add(new Rectangle(2,4,1.0,5.0));
        shapeList.add(new Rectangle(2,4,4.0,9.0));
        shapeList.add(new Rectangle(4,4,4.0,5.0));
        shapeList.add(new Rectangle(2,6,2.0,7.0));
        shapeList.add(new Rectangle(2,4,4.0,1.0));
        shapeList.add(new RightTriangle(3,4,5.0,9.0));

    }


    public void printList(List<GeometricShape> shapeList) {
		//TODO: Implement
        System.out.println("------------for-----------------");
        for (int pos = 0; pos < shapeList.size(); pos++) {
            System.out.println(shapeList.get(pos));
        }


        System.out.println("------------for each-----------------");
        for (GeometricShape shape : shapeList) {
            System.out.println(shape);
        }
        System.out.println("------------stream 1-----------------");
        shapeList.stream()
                .forEach(shape -> System.out.println(shape));


        System.out.println("------------stream 2-----------------");
        shapeList.stream().forEach(System.out::println);


        System.out.println("------------stream 3-----------------");
        shapeList.parallelStream().forEach(System.out::println);

    }

}
