import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxStackTest {

    @Test
    public void pushToEmptyStackTest(){
        MaxStack maxStack = new MaxStack();
        var node = new Node();
        maxStack.push(node, 10);
        assertEquals(10, node.next.data);
    }

    @Test
    public void pushToStackTest(){
        MaxStack maxStack = new MaxStack();
        var head = new Node();
        var pushElement1 = new Node();
        var pushElement2 = new Node();
        head.next = pushElement2;
        pushElement2.data = 10;
        pushElement2.next = pushElement1;
        pushElement1.data = 20;

        maxStack.push(head,5);
        assertEquals(5,head.next.data);
        assertEquals(10,head.next.next.data);
        assertEquals(20, head.next.next.next.data);
    }

    @Test
    public void peekStackTest(){
        MaxStack maxStack = new MaxStack();
        var stack = new Node();
        var element0 = new Node();
        var element1 = new Node();
        stack.next = element1;
        element1.data = 10;
        element1.next = element0;
        element0.data = 20;
        assertEquals(10,maxStack.peek(stack));
    }

    @Test()
    public void popTest(){
        MaxStack maxStack = new MaxStack();
        var stack = new Node();
        var element0 = new Node();
        var element1 = new Node();
        var element2 = new Node();
        var element3 = new Node();
        stack.next = element3;
        element3.data = 75;
        element3.next = element2;
        element2.data = 30;
        element2.next = element1;
        element1.data = 50;
        element1.next = element0;
        element0.data = 60;

        assertEquals(75, maxStack.pop(stack));
    }

    @Test()
    public void popLastElementMaxTest(){
        MaxStack maxStack = new MaxStack();
        var stack = new Node();
        var element0 = new Node();
        var element1 = new Node();
        var element2 = new Node();
        var element3 = new Node();
        stack.next = element3;
        element3.data = 75;
        element3.next = element2;
        element2.data = 30;
        element2.next = element1;
        element1.data = 50;
        element1.next = element0;
        element0.data = 80;
        assertEquals(80, maxStack.pop(stack));
    }
}
