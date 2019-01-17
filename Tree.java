
/**
 * Creates an instance of a Tree.
 *
 * @author J. Midence
 * @version January 15, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Square trunk;
    private Triangle leaves1;
    private Triangle leaves2;
    private Triangle leaves3;

    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public Tree(int x, int y)
    {
        // initialise instance variables
        trunk = new Square();
        leaves1 = new Triangle();
        leaves2 = new Triangle();
        leaves3 = new Triangle();
        // actually draw the tree
        drawTree(x, y);
    }

    /**
     * Draws the tree
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawTree(int x, int y)
    {
        // put your code here
       leaves1.changeColor("green");
       leaves1.makeVisible();
       leaves1.moveHorizontal(x);
       leaves1.moveVertical(y);
       
       // leaves 2
       leaves2.changeColor("green");
       leaves2.makeVisible();
       leaves2.moveHorizontal(x);
       leaves2.moveVertical(y);
       leaves2.moveVertical(10);
       
       // leaves 3
       leaves3.changeColor("green");
       leaves3.makeVisible();
       leaves3.moveHorizontal(x);
       leaves3.moveVertical(y);
       leaves3.moveVertical(20);
       
       // trunk
       trunk.changeColor("black");
       trunk.changeSize(25);
       trunk.makeVisible();
       trunk.moveHorizontal(x);
       trunk.moveVertical(y);
       trunk.moveVertical(15);
       trunk.moveHorizontal(-22);
        
    }
    
}