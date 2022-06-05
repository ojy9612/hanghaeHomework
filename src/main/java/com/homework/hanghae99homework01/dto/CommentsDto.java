package com.homework.hanghae99homework01.dto;

import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class CommentsDto {

    private Long id;

    private String name;

    @NotNull(message = "댓글 내용을 입력해주세요.")
    private String comments;

    private Long board_id;
}
