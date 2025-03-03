import java.util.ArrayList;
import java.util.Scanner;
public class StringListOperations {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Insert\n2. Search\n3. Delete\n4. Display\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the item to be inserted: ");
                    String item = sc.nextLine();
                    list.add(item);
                    System.out.println("Inserted successfully");
                    break;
                case 2:
                    System.out.print("Enter the item to search: ");
                    String searchItem = sc.nextLine();
                    if (list.contains(searchItem)) {
                        System.out.println("Item found in the list.");
                    } else {
                        System.out.println("Item not found in the list.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the item to delete: ");
                    String deleteItem = sc.nextLine();
                    if (list.remove(deleteItem)) {
                        System.out.println("Deleted successfully");
                    } else {
                        System.out.println("Item does not exist.");
                    }
                    break;
                case 4:
                    System.out.println("The Items in the list are: ");
                    for (String str : list) {
                        System.out.println(str);
                    }
                    break;
                case 5:
                    System.out.println("Exiting");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
