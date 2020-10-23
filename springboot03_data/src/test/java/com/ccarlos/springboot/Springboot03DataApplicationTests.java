package com.ccarlos.springboot;

import com.ccarlos.mapper.ArticleMapper;
import com.ccarlos.mapper.CommentMapper;
import com.ccarlos.pojo.Article;
import com.ccarlos.pojo.Comment;
import com.ccarlos.repository.CommentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class Springboot03DataApplicationTests {

    @Autowired
    private CommentMapper commentMapper;

    @Test
    void contextLoads() {
        Comment comment = commentMapper.findById(1);
        System.out.println(comment);
    }

    @Autowired
    private ArticleMapper articleMapper;


    @Test
    public void selectArticle() {
        Article article = articleMapper.selectArticle(1);
        System.out.println(article);
    }

    //测试整合JPA
    @Autowired
    private CommentRepository commentRepository;

    @Test
    public void selectComment() {
        Optional<Comment> byId = commentRepository.findById(1);
        if (byId.isPresent()) {
            System.out.println(byId.get());
        }
    }
}
