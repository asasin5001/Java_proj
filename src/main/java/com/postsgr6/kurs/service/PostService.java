package com.postsgr6.kurs.service;

import com.postsgr6.kurs.model.Post;

import java.util.List;

public interface PostService {

    Post create(Post post);

    List<Post> readAll();

    Post read(int id);

    boolean update(Post post, int id);

    boolean delete(int id);
}
