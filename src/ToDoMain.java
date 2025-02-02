import model.Task;
import service.ToDoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoMain {
    static List<Task> taskqueue=new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ToDoService toDoService=new ToDoService();
        System.out.println("MENU");
        while (true){
            printMenu();
            toDoService.userChoice(scanner.nextInt(),taskqueue);
        }
    }

    private static void printMenu() {
        System.out.print("1. add Task\n2. delete Task\n3. modify Task\n4. show all Task\n");
    }
}