package com.eridanus.post.service;

import com.eridanus.post.entity.Post;
import com.eridanus.post.model.PostDTO;
import com.eridanus.post.repository.PostRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private static final Logger LOGGER = Logger.getLogger(PostServiceImpl.class);

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> obtenerPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post crearPost(PostDTO postDTO) {
        Post post = postRepository.save(Post.from(postDTO));
        return post;
    }

    @Override
    public Post obtenerPostId(int id) {
        return postRepository.findById(id);
    }

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
}
