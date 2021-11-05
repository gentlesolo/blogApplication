package com.sowloo.blogApplication.data.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Comment {
    private Integer blogId;
    private Integer comment_id;
    private Integer user_id;
    private String comment_title;
    private String comment_description;
    private String localDateTime;
}
