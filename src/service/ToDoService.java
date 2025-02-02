package service;

import model.Task;
import repository.ToDoRepository;

import java.util.List;
import java.util.Scanner;

public class ToDoService {


    public void userChoice(int i, List<Task> taskqueue) {
        Scanner scanner=new Scanner(System.in);
        ToDoRepository toDoRepository=new ToDoRepository();
            switch (i) {
                case 1:
                    toDoRepository.addNewTask(taskqueue);
                    break;
                case 2:
                    toDoRepository.showAllTask(taskqueue);
                    System.out.println("Enter index of Task to be deleted");
                    toDoRepository.deleteTask(scanner.nextInt(),taskqueue);

                    break;
                case 3:

                    break;
                case 4:
                    toDoRepository.showAllTask(taskqueue);
                    break;
                default:
                    System.out.println("Invalid Option");
            }
    }
}
