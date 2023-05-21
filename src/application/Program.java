package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Shape> shapeList = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());

			if (type == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				shapeList.add(new Circle(color, radius));
			} else {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				shapeList.add(new Rectangle(color, width, height));
			}

			System.out.println();
		}

		System.out.println("SHAPE AREAS: ");
		for (Shape obj : shapeList) {
			System.out.println(String.format("%.2f", obj.area()));
		}

		sc.close();

	}

}
