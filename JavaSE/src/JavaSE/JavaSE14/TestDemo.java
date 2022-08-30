package JavaSE.JavaSE14;

public class TestDemo {
    public static void main(String[] args) {
        RealLinkedList realLinkedList = new RealLinkedList();
        realLinkedList.addFirst(5);
        realLinkedList.addFirst(2);
        realLinkedList.addFirst(3);
        realLinkedList.addLast(4);
        realLinkedList.addLast(5);
        realLinkedList.addLast(5);
        realLinkedList.addIndex(2,999);
        realLinkedList.removeAllKey(5);

        realLinkedList.display();
    }
}
