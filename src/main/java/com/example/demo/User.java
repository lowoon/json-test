package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class User {
    private String completedTime;
    @JsonIgnore
    private String ignore;

    public void setFinishTime(String completedTime) {
        this.completedTime = completedTime;
    }
}
