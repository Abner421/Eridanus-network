package com.eridanus.post.service;

import com.eridanus.post.entity.Post;
import com.eridanus.post.model.PostDTO;

import java.util.List;

public interface PostService {
    List<Post> obtenerPosts();
    Post crearPost(PostDTO postDTO);
    Post obtenerPostId(int id);
}
