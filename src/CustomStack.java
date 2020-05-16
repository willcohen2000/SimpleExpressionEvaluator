public class CustomStack<Item> {

    Node root;

    private class Node {
        Item item;
        Node next;
    }

    void push(Item item) {

    }

    Item pop() {
        return null;
    }

    boolean isEmpty() {
        return (root.item == null);
    }

}
