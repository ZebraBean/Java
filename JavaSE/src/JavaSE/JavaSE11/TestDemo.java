package JavaSE.JavaSE11;

public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addIndex(3,9);
        myLinkedList.remove(3);
//        myLinkedList.removeAllKey(3);
        myLinkedList.display();

    }
}
