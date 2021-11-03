package com.sowloo.blogApplication.data.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Comment {
    private List<Blog> blogs = new ArrayList<>();
    private String comment_id;
    private String user_id;
    private String comment_title;
    private String comment_description;
}
