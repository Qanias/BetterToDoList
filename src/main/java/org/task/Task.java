package org.task;

import org.enums.Priority;

import java.time.OffsetDateTime;
import java.util.UUID;

public interface Task {
    String name = null;
    String description = null;
    OffsetDateTime dueDate = null;
    UUID taskId = null;
    boolean isCompleted = false;
    Priority priority = Priority.MEDIUM;


    String getName();
    String getDescription();
    OffsetDateTime getDueDate();
    boolean getIsCompleted();
    Priority getPriority();

}
