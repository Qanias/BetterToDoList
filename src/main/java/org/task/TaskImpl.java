package org.task;

import org.enums.Priority;

import java.time.OffsetDateTime;
import java.util.UUID;

public class TaskImpl implements Task {

    private final String name;
    final private String description;
    final private OffsetDateTime dueDate;
    final private boolean isCompleted;
    final private Priority priority;
    final private UUID taskId = UUID.randomUUID();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public OffsetDateTime getDueDate() {
        return dueDate;
    }

    @Override
    public boolean getIsCompleted() {
        return isCompleted;
    }

    @Override
    public Priority getPriority() {
        return priority;
    }

    private TaskImpl(Builder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.dueDate = builder.dueDate;
        this.isCompleted = builder.isCompleted;
        this.priority = builder.priority;
    }

    public static class Builder {
        private String name;
        private String description;
        private OffsetDateTime dueDate;
        private boolean isCompleted = false;
        private Priority priority = Priority.MEDIUM;

        public static Builder newInstance() {
            return new Builder();
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder DueDate(OffsetDateTime dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public Builder isCompleted(boolean isCompleted) {
            this.isCompleted = isCompleted;
            return this;
        }

        public Builder priority(Priority priority) {
            this.priority = priority;
            return this;
        }

        public TaskImpl build() {
            return new TaskImpl(this);
        }
    }

    @Override
    public String toString() {
        return taskId.toString();
    }
}


