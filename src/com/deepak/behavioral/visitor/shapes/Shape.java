package com.deepak.behavioral.visitor.shapes;

import com.deepak.behavioral.visitor.visitor.Visitor;

public interface Shape {
    void move(int x, int y);

    void draw();

    String accept(Visitor visitor);
}
