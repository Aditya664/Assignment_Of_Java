package CircularLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
  // I just implement this Circular linked list using Doubly linked List

  //  HEAD  <---->  NODE-1  <---->  NODE-2  <---->  NODE-3
  //   ^                                              ^
  //   |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ |

  public static void main(String[] args)
      throws NumberFormatException, IOException {
    int option;
    BufferedReader userinp =
        new BufferedReader(new InputStreamReader(System.in));
    CircularLinkedList list = new CircularLinkedList();
    while (true) {
      System.out.println(
          "\n=====================================================");
      System.out.println("1. Insert");
      System.out.println("2. Insert At some Position");
      System.out.println("3. Delete");
      System.out.println("4. Delete At some Position");
      System.out.println("5. isFound");
      System.out.println("6. Show");
      System.out.println("7. Length");
      System.out.println("8. Exit");
      System.out.println(
          "-----------------------------------------------------");
      System.out.println("Your Option : ");
      option = Integer.parseInt(userinp.readLine());
      System.out.println(
          "=====================================================");
      switch (option) {
      case 1:
        int data;
        System.out.println("Enter the Data : ");
        data = Integer.parseInt(userinp.readLine());
        list.insert(data);
        break;
      case 2:
        int index, dataAtindex;
        System.out.println("Enter the Position : ");
        index = Integer.parseInt(userinp.readLine());
        System.out.println("Enter the Data : ");
        dataAtindex = Integer.parseInt(userinp.readLine());
        list.insertAt(index, dataAtindex);
        break;

      case 3:
        list.delete();
        break;
      case 4:
        int DeleteIndex;
        System.out.println("Enter the Position : ");
        DeleteIndex = Integer.parseInt(userinp.readLine());
        list.deleteAt(DeleteIndex);
        break;

      case 5:
        System.out.println("Enter the Data : ");
        int checkData = Integer.parseInt(userinp.readLine());
        System.out.println(list.isFound(checkData));
        break;
      case 6:
        list.show();
        break;
      case 7:
        System.out.println(list.len());
        break;
      case 8:
        System.exit(0);
      default:
        System.out.println("Invalid Option");
        break;
      }
    }
    //		list.insert(10);
    //		list.insert(20);
    //		list.insert(30);
    //		list.insert(40);
    //		list.insert(50);
    //		list.insert(60);
    //		list.show();
    //		System.out.println("\nThe length of the Linked list is
    //"+list.len()); 		System.out.println(); 		System.out.println(list.isFound(54));
    //		System.out.println(list.isFound(60));
    //		list.delete();
    //		list.show();
    //		list.deleteAt(1);
    //		list.show();
    //		list.deleteAt(1);
    //		list.show();
    //		list.insert(70);
    //		list.show();
    //		list.deleteAt(3);
    //		list.show();
  }
}
