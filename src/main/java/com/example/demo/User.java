package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;

@Data
public class User {
    private String completedTime;
    @JsonIgnore
    private String ignore;

    @JsonSetter("finishTime")
    public void setCompletedTime(String completedTime) {
        this.completedTime = completedTime;
    }
}
