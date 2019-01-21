
/**
 * Write a description of class MyHouse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyHouse
{
    // instance variables - replace the example below with your own
    private Square grass;
    private Square sky;
    private Square base;
    private Triangle roof;
    private Tree tree1;
    private Tree tree2;
    private Tree tree3;
    private Tree tree4;
    private Tree tree5;
    private Tree tree6;
    private Tree tree7;
    private Tree tree8;

   /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public MyHouse(int x, int y)
    {
        // initialise instance variables
        grass = new Square();
        sky = new Square();
        base = new Square();
        roof = new Triangle();
        
        drawMyHouse(x, y);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void drawMyHouse(int x, int y)
    {
        // put your code here
        grass.changeColor("green");
        grass.makeVisible();
        grass.changeSize(600);
        grass.moveVertical(250);
        grass.moveHorizontal(-60);
        //Create the sky
        sky.changeColor("yellow");
        sky.makeVisible();
        sky.changeSize(600);
        sky.moveVertical(-350);
        sky.moveHorizontal(-60);
        //Create the house
        base.changeColor("black");
        base.makeVisible();
        base.changeSize(160);
        base.moveVertical(300);
        base.moveHorizontal(150);
        //Create the roof
        roof.changeColor("blue");
        roof.makeVisible();
        roof.changeSize(80,300);
        roof.moveVertical(260);
        roof.moveHorizontal(240);
        //Draw Trees
        tree1 = new Tree(40,210);
        tree2 = new Tree(80,210);
        tree3 = new Tree(120,210);
        tree4 = new Tree(160,210);
        tree5 = new Tree(310,210);
        tree6 = new Tree(350,210);
        tree7 = new Tree(390,210);
        tree8 = new Tree(430,210);
    }
}
