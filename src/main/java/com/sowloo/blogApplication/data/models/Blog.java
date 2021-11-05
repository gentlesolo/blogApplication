package com.sowloo.blogApplication.data.models;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
@Data
public class Blog {
    private final List<Blog> posts = new ArrayList<Blog>();
    private Integer blogId;
    private User userId;
    private String blogTitle;
    private String blogType;
    private String blogContent;
    private String blogDescription;
    private String localDateTime;

    public void setLocalDateTime(String localDateTimee){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        localDateTime = LocalDateTime.now().format(dateTimeFormatter);
    }
}
