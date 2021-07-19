
package view;

import javafx.scene.shape.Shape;


public class State {
   
    private Shape shape;

    public Choices choice;
    public State(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }
    
    
}
