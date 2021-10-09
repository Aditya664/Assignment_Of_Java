import java.util.*;
class LinkedList {
  Node head;
  static class Node {
    int data;
    Node next;
    Node(int d) {
      data = d;
      next = null;
    }
  }
  public static LinkedList insert(LinkedList list, int data) {
    Node new_node = new Node(data);
    new_node.next = null;
    if (list.head == null) {
      list.head = new_node;
    } else {
      Node last = list.head;
      while (last.next != null) {
        last = last.next;
      }
      last.next = new_node;
    }
    return list;
  }
  public static void printlist(LinkedList list) {
    Node temp = list.head;
    System.out.println("Linked list:");
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }
  public static void find(LinkedList l, int n) {
    Node temp = l.head;
    int i = 0;
    int f = 0;
    while (temp != null) {
      if (i == n) {
        f = 1;
        break;
      } else {
        i++;
        temp = temp.next;
      }
    }
    if (f == 1)
      System.out.println("The data is:" + temp.data);
    else
      System.out.println("Data does not exist");
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedList ll = new LinkedList();
    ll = insert(ll, 2);
    ll = insert(ll, 5);
    ll = insert(ll, 6);
    ll = insert(ll, 8);
    ll = insert(ll, 1);
    ll = insert(ll, 3);
    printlist(ll);
    System.out.println("Enter the number of node:");
    int num = sc.nextInt();
    find(ll, num - 1);
  }
}
