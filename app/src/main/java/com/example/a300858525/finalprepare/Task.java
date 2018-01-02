package com.example.a300858525.finalprepare;

/**
 * Created by 300858525 on 1/2/2018.
 */

public class Task {

    private int taskId;
    private String taskName, taskDescription;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Task() {

    }

    public Task(int taskId, String taskName, String taskDescription) {

        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }
}
