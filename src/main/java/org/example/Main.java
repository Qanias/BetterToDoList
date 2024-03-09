package org.example;


import org.task.Task;
import org.task.TaskImpl;
import org.todolist.ToDoList;
import org.todolist.ToDoListImpl;

import java.time.OffsetDateTime;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Task task = new TaskImpl.Builder()
                .name("pierwszy")
                .description("Opis")
                .DueDate(OffsetDateTime.now())
                .build();

        LinkedList<Task> lista = new LinkedList<>();
        lista.add(task);

        ToDoList toDoList = new ToDoListImpl.Builder().name("to do list").build();


        System.out.println(task.getName());
        System.out.println(task.getDescription());
        System.out.println(task.getDueDate());
        System.out.println(task.getIsCompleted());
        System.out.println(task.getPriority());
        System.out.println(task);


        System.out.println(toDoList);
        System.out.println(toDoList.isEmpty());
        toDoList.add(task);
        System.out.println(toDoList.isEmpty());
        System.out.println(toDoList.get(0));
        toDoList.addAll(lista);
        System.out.println(toDoList.stream().filter(obj -> !obj.getIsCompleted()).count());
    }
}