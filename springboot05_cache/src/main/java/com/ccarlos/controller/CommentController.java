package com.ccarlos.controller;

import com.ccarlos.pojo.Comment;
import com.ccarlos.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/findCommentById")
    public Comment findCommentById(Integer id) {
        Comment comment = commentService.findCommentById(id);
        return comment;
    }
}