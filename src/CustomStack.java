public class CustomStack<Item> {

    Node root;

    private class Node {

        Item item;
        Node next;

        public Node(Item item, Node next) {
            this.item = item;
            this.next = next;
        }

    }

    void push(Item item) {
        Node node = new Node(item, root);
        root = node;
    }

    Item pop() {
        Item popped = root.item;
        root = root.next;
        return popped;
    }

    boolean isEmpty() {
        return (root.item == null);
    }

}
