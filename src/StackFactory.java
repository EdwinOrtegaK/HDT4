public class StackFactory {
    public IStack getInstance(int tipo){
        switch (tipo){
            case 1:
                return new StackUsingArrayList();
            case 2:
                return new StackUsingVector();
            case 3:
                return new StackUsingLinkedList();
            case 4:
                return new StackUsingDoubleLinkedList();
        }
        return null;
    }
}
