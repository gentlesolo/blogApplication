package com.sowloo.blogApplication.dtos.responses;

import com.sowloo.blogApplication.data.models.User;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
@Data
public class AddCommentResponse {
    private Integer blogId;
    private Integer commentId;
    private Integer userId;
    private String commentTitle;
    private String commentContent;
    private String localDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
}
