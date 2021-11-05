package com.sowloo.blogApplication.dtos.responses;

import com.sowloo.blogApplication.data.models.User;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
public class AddBlogResponse {
    private Integer blogId;
    private User userId;
    private String blogTitle;
    private String blogType;
    private String blogContent;
    private String blogDescription;
    private String localDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
}
