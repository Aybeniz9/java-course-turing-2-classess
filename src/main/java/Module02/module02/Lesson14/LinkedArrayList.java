package Module02.module02.Lesson14;

public class LinkedArrayList <E>{
    private Node<E> head;
    private int size;

    public LinkedArrayList() {
        head = null;
        size = 0;
    }

    public void addHead(E data) {
        Node<E> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int getSize() {
        return size;
    }

    public E getIndex(int index) {
        if (index < 0 || index >= size || head == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void deleteIndex(int index) {
        if (index < 0 || index >= size || head == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node<E> prev = null;
            Node<E> current = head;
            for (int i = 0; i < index; i++) {
                prev = current;
                current = current.next;
            }
            prev.next = current.next;
        }
        size--;
    }

    public void updateIndex(int index, E newData) {
        if (index < 0 || index >= size || head == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = newData;
    }

    public void deleteObjects(E data) {
        Node<E> prev = null;
        Node<E> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
            } else {
                prev = current;
            }
            current = current.next;
        }
    }
}
