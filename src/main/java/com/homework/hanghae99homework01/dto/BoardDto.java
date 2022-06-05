package com.homework.hanghae99homework01.dto;

import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class BoardDto {

    private Long id;

    private String title;

    private String name;

    private String contents;
}
