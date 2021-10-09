package DoublyLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
  public static void main(String[] args)
      throws NumberFormatException, IOException {
    int option;
    BufferedReader userinp =
        new BufferedReader(new InputStreamReader(System.in));
    DoublyLinkedList list = new DoublyLinkedList();

    while (true) {

      System.out.println(
          "\n=====================================================");
      System.out.println("1. Insert");
      System.out.println("2. Insert At some Position");
      System.out.println("3. Delete");
      System.out.println("4. Delete At some Position");
      System.out.println("5. Delete Data");
      System.out.println("6. isFound");
      System.out.println("7. Show");
      System.out.println("8. Length");
      System.out.println("9. Exit");
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
        int dataToDelete;
        System.out.println("Enter the Data : ");
        dataToDelete = Integer.parseInt(userinp.readLine());
        list.deleteData(dataToDelete);
        break;
      case 6:
        if (list.len() > 0) {
          System.out.println("Enter the Data : ");
          int checkData = Integer.parseInt(userinp.readLine());
          System.out.println(list.isFound(checkData));
        } else {
          System.out.println("No data Found");
        }
        break;
      case 7:
        list.show();
        break;
      case 8:
        System.out.println(list.len());
        break;
      case 9:
        System.exit(0);
      default:
        System.out.println("Invalid Option");
        break;
      }
    }
  }
}
