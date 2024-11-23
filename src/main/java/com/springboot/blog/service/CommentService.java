package com.springboot.blog.service;

import com.springboot.blog.dto.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);
    List<CommentDto> getCommentsByPostID(long postId);
    CommentDto getCommentById(Long postId, Long commentId);
    CommentDto updateComment(Long postId, long commentId, CommentDto commentRequest);
    void deleteComment(Long postId, Long commentId);
}