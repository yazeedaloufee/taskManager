package com.yazeed.Task.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity

public class Task {
    @Id
    int id;
    String title;
    String description;
    Date date;

}
