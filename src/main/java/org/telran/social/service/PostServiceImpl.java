package org.telran.social.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.telran.social.entity.Post;
import org.telran.social.repository.PostJpaRepository;

import java.util.List;

public class PostServiceImpl implements PostService {

    @Autowired
    private PostJpaRepository postJpaRepository;

    @Override
    public List<Post> getAll() {
        return postJpaRepository.findAll();
    }

    @Override
    public Post getById(Long id) {
        return null;
    }

    @Override
    public Post create(Post post) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
