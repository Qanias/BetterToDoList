package org.todolist;

import lombok.Builder;
import org.task.Task;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ToDoListImpl implements ToDoList {

    private final String name;
    private final LinkedList<Task> toDoList;
    private final UUID toDoListId = UUID.randomUUID();
    @Override
    public String getName() {
        return name;
    }

    @Override
    public LinkedList<Task> getToDoList() {
        return toDoList;
    }

    @Override
    public String toString() {
        return toDoListId.toString();
    }

    private ToDoListImpl(Builder builder) {
        this.name = builder.name;
        this.toDoList = builder.toDoList;
    }


    public static class Builder {
        private String name;
        private LinkedList<Task> toDoList = new LinkedList<>();
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder toDoList(LinkedList<Task> toDoList) {
            this.toDoList = toDoList;
            return this;
        }
        
        public ToDoListImpl build() {
            return new ToDoListImpl(this);
        }
    }

}
