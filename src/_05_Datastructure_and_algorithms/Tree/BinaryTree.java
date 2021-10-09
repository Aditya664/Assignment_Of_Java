package Tree;

import java.util.Scanner;

public class BinaryTree {
  static Node root;
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int choice;
    Node root = null;
    while (true) {
      System.out.println("============= MENU =============");
      System.out.println("1. Insert");
      System.out.println("2. Sort");
      System.out.println("3. Search");
      System.out.println("4. Exit");
      System.out.println("================================");
      System.out.print("Your choice : ");
      choice = inp.nextInt();

      switch (choice) {
      case 1:
        System.out.print("Enter the data : ");
        int InsData = inp.nextInt();
        if (root == null) {
          root = new Node(InsData);
        } else {
          root.add(InsData);
        }
        break;

      case 2:
        System.out.print("Sorted Elements : ");
        System.out.println(root.sort());
        break;
      case 3:
        System.out.print("Enter the Element to Search : ");
        int SearchData = inp.nextInt();
        if (root.search(SearchData)) {
          System.out.println("Found");
        } else {
          System.out.println("Not Found");
        }
        break;
      case 4:
        System.exit(0);
      default:
        System.out.println("Invalid Choice...!");
      }
    }
  }
}
