package DoublyLinkedList;

public class DoublyLinkedList {
  Node head;

  public void insert(int data) {
    Node node = new Node();
    node.data = data;
    node.prev = null;
    node.next = null;
    if (head == null) {
      head = node;
    } else {
      Node temp;
      temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = node;
      node.prev = temp;
    }
  }

  public void show() {
    if (head == null) {
      System.out.println("\nNo data found");
    } else {
      Node temp;
      temp = head;
      System.out.println();
      while (temp.next != null) {
        System.out.print(temp.data);
        System.out.print(" <--> ");
        temp = temp.next;
      }
      System.out.print(temp.data);
    }
  }

  public void insertAt(int index, int data) {
    try {
      Node temp;
      temp = head;
      Node node = new Node();
      node.data = data;
      if (index == 1) {
        temp.prev = node;
        node.next = temp;
        head = node;
      } else {
        for (int i = 1; i < index; i++) {
          temp = temp.next;
        }
        node.prev = temp.prev;
        node.prev.next = node;
        node.next = temp;
      }

    } catch (Exception e) {
      System.out.println("\nIndex not found");
    }
  }

  public void delete() {
    try {
      if (head.next == null) {
        head = null;
      } else {
        Node temp;
        temp = head;
        while (temp.next != null) {
          temp = temp.next;
        }
        temp.prev.next = null;
      }
    } catch (Exception e) {
      System.out.println("\nNo Data to Delete");
    }
  }

  public void deleteAt(int index) {
    if (index == 1) {
      head = head.next;
      head.prev = null;
    } else {
      Node temp;
      temp = head;
      for (int i = 1; i < index; i++) {
        temp = temp.next;
      }
      temp.prev.next = temp.next;
    }
  }

  public void deleteData(int data) {
    try {
      if (head.data == data && head.next != null) {
        head = head.next;
        head.prev = null;
      } else if (head.data == data && head.next == null) {
        head = null;
      } else {
        Node temp;
        temp = head;
        while (temp.data != data) {
          temp = temp.next;
        }
        if (temp.next != null) {
          temp.prev.next = temp.next;
          temp.next.prev = temp.prev;

        } else {
          temp.prev.next = null;
        }
      }
    } catch (Exception e) {
      System.out.println("\nData miss match");
    }
  }

  public int len() {
    try {
      Node temp = head;
      int count = 1;
      while (temp.next != null) {
        count++;
        temp = temp.next;
      }
      return count;
    } catch (Exception e) {
      return 0;
    }
  }

  public boolean isFound(int data) {
    Node temp;
    temp = head;
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
