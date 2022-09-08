package com.eridanus.post.api;

import com.eridanus.post.entity.Post;
import com.eridanus.post.model.PostDTO;
import com.eridanus.post.service.PostServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("post/v1")
public class PostController {
    private static final Logger LOGGER = Logger.getLogger(PostController.class);

    @Autowired
    private PostServiceImpl postService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/crearPost")
    @ResponseStatus(HttpStatus.CREATED)
    public Post crear(@RequestBody PostDTO postDTO) {
        LOGGER.info(":: Creación de Post ::");
        return postService.crearPost(postDTO);
    }

    @GetMapping("/post/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PostDTO obtenerPost(@PathVariable("id") int id) {
        LOGGER.info(":: Obtención de Post ::");
        return postService.obtenerPostId(id).to();
    }

    @GetMapping("/posts")
    @ResponseStatus(HttpStatus.OK)
    public List<Post> obtenerPosts() {
        LOGGER.info(":: Obteniendo Posts ::");
        return postService.obtenerPosts();
    }

    @GetMapping("/monitoreo")
    @ResponseStatus(HttpStatus.OK)
    public HttpStatus monitoreo() {
        LOGGER.info(":: Servicio ejecutándose ::");
        return HttpStatus.OK;
    }
}
