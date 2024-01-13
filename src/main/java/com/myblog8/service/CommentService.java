package com.myblog8.service;

import com.myblog8.payload.CommentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@SpringBootApplication
public interface CommentService {
    public CommentDto createComment(long postId, CommentDto commentDto);
    public void deleteCommentById(long postId,long commentId);

    List<CommentDto> getCommentsByPostId(long postId);

    CommentDto updateComment(long commentId, CommentDto commentDto);
}
