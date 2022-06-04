package com.homework.hanghae99homework01.service;

import com.homework.hanghae99homework01.dto.CommentsDto;
import com.homework.hanghae99homework01.product.Comments;
import com.homework.hanghae99homework01.repository.CommentsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CommentsService {
    private final CommentsRepository commentsRepository;


    public Long update(Long mid, CommentsDto commentsDto) {
        Comments comments = commentsRepository.findById(mid).orElseThrow(
                () -> new IllegalArgumentException("[my]Comments.Service): 해당 아이디를 찾을 수 없습니다.")
        );
        comments.update(commentsDto);
        commentsRepository.save(comments);
        return comments.getId();
    }

}
