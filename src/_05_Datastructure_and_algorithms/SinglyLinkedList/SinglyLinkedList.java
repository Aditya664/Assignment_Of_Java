package SinglyLinkedList;

public class SinglyLinkedList {
  Node head;

  public void insert(int data) {
    Node node = new Node();
    node.data = data;
    node.next = null;

    if (head == null) {
      head = node;
    } else {
      Node temp = new Node();
      temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = node;
    }
  }

  public void show() {
    Node node = new Node();
    node = head;
    try {
      while (node.next != null) {
        System.out.print(node.data);
        System.out.print(" --> ");
        node = node.next;
      }
      System.out.println(node.data);
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("No data Found");
    }
  }

  public void insertAt(int index, int data) {
    Node node = new Node();
    node.data = data;

    Node temp = head;
    try {
      for (int i = 1; i < index - 1; i++) {
        temp = temp.next;
      }
      node.next = temp.next;
      temp.next = node;
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("Index Not Found");
    }
  }

  public void insertFirst(int data) {
    Node node = new Node();
    node.data = data;
    if (head != null) {
      node.next = head;
      head = node;
    } else {
      head = node;
    }
  }

  public void deleteLast() {
    Node temp;
    temp = head;
    if (temp.next != null) {
      while (temp.next.next != null) {
        temp = temp.next;
      }
      temp.next = null;
    } else {
      head = null;
    }
  }

  public void deleteAt(int index) {
    try {
      if (index > 1) {
        Node temp;
        temp = head;
        for (int i = 1; i < index - 1; i++) {
          temp = temp.next;
        }
        temp.next = temp.next.next;
      }
      if (index == 1) {
        head = head.next;
      }
    } catch (Exception e) {
      System.out.println("No data Found to Delete");
    }
  }

  public void delete(int data) {
    Node temp;
    temp = head;
    if (temp.data == data) {
      head = head.next;
    } else {
      while (temp.next != null) {
        if (temp.next.data == data && temp.next.next == null) {
          temp.next = null;
          break;
        } else if (temp.next.data == data) {
          temp.next = temp.next.next;
        }
        temp = temp.next;
      }
    }
  }

  public int len() {
    if (head == null) {
      return 0;
    }
    Node temp = head;
    int count = 1;
    while (temp.next != null) {
      count++;
      temp = temp.next;
    }
    return count;
  }

  public boolean isFound(int data) {
    Node temp = head;
    boolean found = false;
    if (temp.data == data) {
      found = true;
      return found;
    }
    while (temp.next != null) {
      if (temp.data == data || temp.next.data == data) {
        found = true;
        break;
      }

      temp = temp.next;
    }
    return found;
  }
}
