package linkedlists;

public class Main {
    public static void main(String[] args) {

        LinkedListOperation list = new LinkedListOperation();
        list.addFirst(70);
        list.addFirst(56);
        list.addAtSpecificPosition(30, 2);
        list.printList();

    }
}
