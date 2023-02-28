import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

    @Test
    void getRangeValueTest(){

        BinaryTree binaryTree = new BinaryTree();
        Node root = new Node();
        root.data = 1;
        root.left = new Node();
        root.right = new Node();
        root.left.data = 2;
        root.right.data = 3;
        root.left.left = new Node();
        root.left.right = new Node();
        root.right.left = new Node();
        root.right.right = new Node();
        root.left.left.data = 4;
        root.left.right.data = 5;
        root.right.left.data = 6;
        root.right.right.data = 7;

        var res = binaryTree.getRangeValues(root, 1, 2) ;
        assertEquals(3,res.size());
        assertEquals(1,res.get(0));
        assertEquals(2,res.get(1));
        assertEquals(3,res.get(2));
    }

    @Test
    void getRangeValueRootNullTest(){
        BinaryTree binaryTree = new BinaryTree();
        assertEquals(0,binaryTree.getRangeValues(null,1,2).size());
    }

    @Test
    void getRangeValueUnEvenTreeTest(){

        BinaryTree binaryTree = new BinaryTree();
        Node root = new Node();
        root.data = 1;
        root.left = new Node();
        root.right = new Node();
        root.left.data = 2;
        root.right.data = 3;
        root.left.left = new Node();
        root.left.right = new Node();
        root.right.left = new Node();
        root.left.left.data = 4;
        root.left.right.data = 5;
        root.right.left.data = 6;

        var res = binaryTree.getRangeValues(root, 1, 2) ;
        assertEquals(3,res.size());
        assertEquals(1,res.get(0));
        assertEquals(2,res.get(1));
        assertEquals(3,res.get(2));
    }
}
