package com.example;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class Exercise01 {
	public static void main(String[] args) {
		ShapeFactory factory = (type) -> type.makeShape();
		var newShape = factory.makeShape(ShapeType.HEXAGON);
		System.out.println(newShape);
		System.out.println(ShapeType.HEXAGON.getClass());
		for (var shapeType : ShapeType.values())
			System.out.println("%s,%s, %d".formatted(shapeType.getClass().getName(),shapeType.name(),shapeType.ordinal()));
		for (var sekil : Sekil.values())
			System.out.println("%s,%s, %d".formatted(sekil.getClass().getName(),sekil.name(),sekil.ordinal()));
        System.out.println(ShapeType.CIRCLE instanceof ShapeType);
        System.out.println(factory.getClass());
        AlternativeShapeFactory alternativeShapeFactory = new AlternativeShapeFactory();
        var anotherShape = alternativeShapeFactory.makeShape(ShapeType.HEXAGON);
        System.out.println(anotherShape);
        
	}
}
@FunctionalInterface
interface ShapeFactory {
	Shape makeShape(ShapeType type);
	default Shape makeShape(String type) {
		return makeShape(ShapeType.valueOf(type));
	}
}

class AlternativeShapeFactory implements ShapeFactory {
	private static final Map<ShapeType,Supplier<Shape>> LOOKUP_TABLE = new EnumMap<>(ShapeType.class);
/*	
			Map.of(
			ShapeType.CIRCLE, () -> ShapeType.CIRCLE.makeShape(), 	
			ShapeType.TRIANGLE, () -> ShapeType.TRIANGLE.makeShape(), 	
			ShapeType.SQUARE, () -> ShapeType.SQUARE.makeShape(), 	
			ShapeType.HEXAGON, () -> ShapeType.HEXAGON.makeShape(), 	
			ShapeType.RECTANGLE, () -> ShapeType.RECTANGLE.makeShape() 	
			);
     static {
    	 for (var shapeType: ShapeType.values()) {
    		 if(!LOOKUP_TABLE.containsKey(shapeType))
    			 throw new IllegalArgumentException("You must provide a supplier for the shape %s".formatted(shapeType.name()));
    	 }
     }
			*/
     static {
    	 for (var shapeType: ShapeType.values()) {
    		 LOOKUP_TABLE.put(shapeType,shapeType::makeShape);
    	 }
     }
	@Override
	public Shape makeShape(ShapeType type) {
		return LOOKUP_TABLE.get(ShapeType.HEXAGON).get();
	}
	
}
class StandardShapeFactory implements ShapeFactory {

	@Override
	public Shape makeShape(ShapeType type) {
		return type.makeShape();
	}
}

enum Sekil {
	CIRCLE, TRIANGLE,SQUARE;
}

enum ShapeType { // abstract class
	CIRCLE { // 

		@Override
		public Shape makeShape() {
			return new Circle();
		}

	},
	TRIANGLE {

		@Override
		public Shape makeShape() {
			return new Triangle();
		}

	},
	SQUARE {

		@Override
		public Shape makeShape() {
			return new Square();
		}
	},
	RECTANGLE {

		@Override
		public Shape makeShape() {
			return new Rectangle();
		}
	},
	HEXAGON {

		@Override
		public Shape makeShape() {
			return new Hexagon();
		}
	};

	abstract public Shape makeShape();
}

interface Shape {
	default double area() {
		return 1;
	}
}

class Triangle implements Shape {
}

class Square implements Shape {
}

class Rectangle implements Shape {
}

class Circle implements Shape {
}

class Hexagon implements Shape {
}