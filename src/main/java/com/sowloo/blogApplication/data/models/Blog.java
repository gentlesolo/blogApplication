package com.sowloo.blogApplication.data.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Blog {
    private final List<Blog> posts = new ArrayList<Blog>();
    private String blogId;
    private User userId;
    private String blogTitle;
    private String blogType;
    private String blogContent;
    private String blogDescription;
}
