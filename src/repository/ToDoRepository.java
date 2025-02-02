package repository;

import model.Task;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ToDoRepository {
    Scanner scanner=new Scanner(System.in);


    public void addNewTask(List<Task> taskqueue) {
        try {
            Task task=new Task();
            task.setIndex(taskqueue.size()+1);
            task.setDate(new Date().toString());
            System.out.println("Enter the task Name");
            task.setTaskName(scanner.nextLine());
            System.out.println("Enter the task Description");
            task.setDescription(scanner.nextLine());
            System.out.println("Task Added Successfully");
            taskqueue.add(task);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void showAllTask(List<Task> taskqueue) {
        try {
            for (Task task: taskqueue){
                System.out.print(task.getIndex()+". ");
                System.out.println("created At: "+task.getDate());
                System.out.println("Name: "+task.getTaskName());
                System.out.println("Description: "+task.getDescription());
                System.out.println();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void deleteTask(int i, List<Task> taskqueue) {
        for(Task task:taskqueue){
            if(task.getIndex()==i){
                taskqueue.remove(task);
            }
        }
    }
}
