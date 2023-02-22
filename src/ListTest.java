import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ListTest {
    @Test
    public void Test1(){
        IList list = new SingleLinkedList();
        assertEquals(true,list.IsEmpty());

    }
    @Test
    public void Test2(){
        IList list = new DoubleLinkedList();
        assertEquals(true,list.IsEmpty());

    }
    @Test
    public void Test3(){
        IStack stack = new StackUsingVector();
        assertEquals(true,stack.isEmpty());
    }

    @Test
    public void Test4(){
        IStack stack = new StackUsingArrayList();
        assertEquals(true,stack.isEmpty());
    }

    @Test
    public void Test5(){
        IStack stack = new StackUsingDoubleLinkedList();
        assertEquals(true,stack.isEmpty());
    }

    @Test
    public void Test6(){
        IStack stack = new StackUsingLinkedList();
        assertEquals(true,stack.isEmpty());
    }
}