package MAIN.service;

import MAIN.entity.Blog;

import java.util.List;

public interface BlogService {

    List<Blog> findAll();

    Blog findById(int id);

    Blog save(Blog blog);

    void  deleteById(int id);
}
