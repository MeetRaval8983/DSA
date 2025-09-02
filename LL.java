public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -1; // Or throw an exception
        }
        int val = head.data;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if(size <= 1) {
            return deleteFirst();
        }
        Node temp = head;
        while(temp.next != tail) {
            temp = temp.next;
        }
        int val = tail.data;
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if(index == 0) {
            return deleteFirst();
        }
        if(index == size - 1) {
            return deleteLast();
        }
        Node temp = head;
        for(int i = 1; i < index; i++) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return val;
    }   
    
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // New method to find a node
    public Node find(int val) {
        Node node = head;
        while(node != null) {
            if(node.data == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    private class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}