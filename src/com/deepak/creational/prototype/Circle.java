package com.deepak.creational.prototype;

public class Circle extends Shape {
    public int radius;

    public Circle() {
    }

    public Circle(Shape target) {
    }

    public Circle(Circle target) {
        super(target);
        if (null != target) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }
}
