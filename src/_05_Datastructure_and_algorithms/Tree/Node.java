package Tree;

import java.util.ArrayList;

public class Node {
  int data;
  Node left, right;

  Node(int data) { this.data = data; }

  public void add(int data) {
    if (data < this.data) {
      if (this.left != null) {
        this.left.add(data);
      } else {
        this.left = new Node(data);
      }
    }

    if (data > this.data) {
      if (this.right != null) {
        this.right.add(data);
      } else {
        this.right = new Node(data);
      }
    }
  }

  public ArrayList<Integer> sort() {
    ArrayList<Integer> res = new ArrayList<>();
    if (this.left != null) {
      res.addAll(this.left.sort());
    }
    res.add(this.data);

    if (this.right != null) {
      res.addAll(this.right.sort());
    }

    return res;
  }

  public boolean search(int data) {
    if (this.data == data) {
      return true;
    }

    if (data < this.data) {
      if (this.left != null) {
        return this.left.search(data);
      } else {
        return false;
      }
    } else {
      if (this.right != null) {
        return this.right.search(data);
      } else {
        return false;
      }
    }
  }
}
