package org.telran.social.service;

import org.telran.social.entity.Post;
import org.telran.social.model.NetworkUser;

import java.util.List;

public interface PostService {

    List<Post> getAll();

    Post getById(Long id);

    Post create(Post post);

    void deleteById(Long id);
}
