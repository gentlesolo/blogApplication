package com.sowloo.blogApplication.data.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class User {
//    private final List<Blog> posts = new ArrayList<Blog>();
    private Integer userId;
    private String firstName;
    private String lastName;
    private String userEmail;
    private String userRoleId;
}
