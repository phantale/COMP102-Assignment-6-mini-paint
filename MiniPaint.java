// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP 102 Assignment 6
 * Name:
 * Usercode:
 * ID:
 */

import ecs100.*;
import java.awt.Color;
import javax.swing.JColorChooser;

public class MiniPaint{

    // fields to remember:
    //  - the shape that will be drawn when the mouse is next released.
    //  - whether the shape should be filled or not
    //  - the position the mouse was pressed, 
    //  - the name of the image file
    private String drawFunction;
    private boolean fill;
    private double pressedX;
    private double pressedY;
    private double releasedX;
    private double releasedY;
    private String imgName;

    //Constructor
    /** Sets up the user interface - mouselistener and buttons */
    public MiniPaint(){
        drawFunction = null;
        fill = false;
        pressedX = 0;
        pressedY = 0; 
        releasedX = 0;
        releasedY = 0; 
        imgName = null;
        UI.setMouseListener(this::doMouse);
        
        UI.addButton("Line", this::line);
        UI.addButton("Rect", this::rect);
        UI.addButton("Oval", this::oval);
        UI.addButton("Image", this::image);
        UI.addButton("Colour", this::colour);
        UI.addButton("Fill/No Fill", this::chooseFill);
        UI.addButton("Clear", this::clear);
        UI.addButton("Quit", UI::quit);
    }

    /**
     * Respond to mouse events
     * When pressed, remember the position.
     * When released, draw the current shape using the pressed position
     *  and the released position.
     * Uses the value in the field to determine which kind of shape to draw.
     * Although you could do all the drawing in this method,
     *  it may be better to call some helper methods for the more
     *  complex actions (and then define the helper methods!)
     */
    public void doMouse(String action, double x, double y) {
        if(action.equals("pressed")){
            pressedX = x;
            pressedY = y;
        }
        else if(action.equals("released")){
            releasedX = x;
            releasedY = y;
        }
        if(action.equals("clicked")){
            pressedX = x;
            pressedY = y;
        }
    }

    //methods for the buttons
    public void line(){
        drawFunction = "line";
    }
    public void rect(){
        drawFunction = "rect";
    }
    public void oval(){
        drawFunction = "oval";
    }
    public void image(){
        drawFunction = "image";
        //image chooser code
    }
    public void colour(){
        //JColorChooser.showDialog(UI, "Choose colour", Color.black);
        
    }
    public void chooseFill(){
        if (!fill){
            fill = true;
        }
        else{
            fill = false;
        }
    }
    public void clear(){
        UI.clearGraphics();
    }
    
    //draws based on the chosen drawFunction and the positions the mouse was clicked & released
    public void draw(){
        if (drawFunction.equals("line")){
        }
        else if (drawFunction.equals("rect")){
        }
        else if (drawFunction.equals("oval")){
        }
        else if (drawFunction.equals("image")){
        }
    }


    /* Helper methods for drawing the shapes, if you choose to define them 
    I used the following methods:

    public void drawARectangle(double x, double y)
    // draws a Rectangle between the mouse pressed and mouse released points.

    public void drawAnOval(double x, double y)
    // draws an Oval between the mouse pressed and mouse released points.

    public void drawAnImage(double x, double y)
    // draws an image at the mouse released point.

     */

    /*# YOUR CODE HERE */

    // Main:  constructs a new MiniPaint object
    public static void main(String[] arguments){
        new MiniPaint();
    }       

}
