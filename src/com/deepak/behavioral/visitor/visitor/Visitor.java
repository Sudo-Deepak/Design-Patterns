package com.deepak.behavioral.visitor.visitor;

import com.deepak.behavioral.visitor.shapes.Circle;
import com.deepak.behavioral.visitor.shapes.CompoundShape;
import com.deepak.behavioral.visitor.shapes.Dot;
import com.deepak.behavioral.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
