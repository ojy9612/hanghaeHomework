package com.homework.hanghae99homework01.controller;

import com.homework.hanghae99homework01.dto.CommentsDto;
import com.homework.hanghae99homework01.product.Comments;
import com.homework.hanghae99homework01.repository.CommentsRepository;
import com.homework.hanghae99homework01.service.CommentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CommentsController {
    private final CommentsRepository commentsRepository;
    private final CommentsService commentsService;

    /**
     * 댓글 목록 불러오기
     */
    @GetMapping("/api/comments/{nid}")
    public List<Comments> getAllComments(@PathVariable Long nid){
        return commentsRepository.findByContentsId(nid, Sort.by(Sort.Direction.DESC, "createdAt"));
    }

    /**
     * 댓글 추가하기
     */
    @PostMapping("/api/comments/{nid}")
    public Comments createComments(@PathVariable Long nid, @RequestBody CommentsDto commentsDto){
        Comments comments = new Comments(commentsDto);
        comments.setContentsId(nid);

        return commentsRepository.save(comments);
    }

    /**
     * 댓글 수정하기
     */
    @PutMapping("/api/comments/{mid}")
    public Long updateComments(@PathVariable Long mid, @RequestBody CommentsDto commentsDto){
        return commentsService.update(mid,commentsDto);
    }

    /**
     * 댓글 목록 불러오기
     */
    @DeleteMapping("/api/comments/{mid}")
    public Long deleteComments(@PathVariable Long mid){
        commentsRepository.deleteById(mid);
        return mid;
    }

}
