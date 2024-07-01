package com.saqib.algorithms;

public class SingleLinkedList {
    private Node head;

    public SingleLinkedList() {
        head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addAt(int index, int data) {
        Node newNode = new Node(data);
        if (index == 0) {
            addFirst(data);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void addAfter(int key, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }



    public void deleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void deleteLast() {
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                Node temp = head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
            }
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            deleteFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void delete(int data) {
        if (head != null) {
            if (head.data == data) {
                head = head.next;
            } else {
                Node temp = head;
                while (temp.next != null && temp.next.data != data) {
                    temp = temp.next;
                }
                if (temp.next != null) {
                    temp.next = temp.next.next;
                }
            }
        }
    }

    public void deleteAll(int data) {
        if (head != null) {
            while (head != null && head.data == data) {
                head = head.next;
            }
            Node temp = head;
            while (temp != null && temp.next != null) {
                if (temp.next.data == data) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
        }
    }

    public void deleteAll() {
        head = null;
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void reverse(int k) {
        head = reverse(head, k);
    }

    private Node reverse(Node head, int k) {
        Node current = head;
        Node next = null;
        Node prev = null;
        int count = 0;
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if (next != null) {
            head.next = reverse(next, k);
        }
        return prev;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private static class Node {
        private final int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(4);
        list.add(2);
        list.addFirst(1);
        list.addAt(2, 6);
        list.addAfter(8, 7);
        list.display();
        System.out.println();
        list.deleteFirst();
        list.deleteLast();
        list.deleteAt(2);
        list.delete(8);
        list.deleteAll(5);
        list.deleteAll();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(4);
        list.add(2);
        list.reverse();
        list.display();
        System.out.println();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(4);
        list.add(2);
        list.reverse(2);
        list.deleteAll(2);
        list.display();
    }
}
