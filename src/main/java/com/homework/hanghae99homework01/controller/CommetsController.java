package com.homework.hanghae99homework01.controller;

import com.homework.hanghae99homework01.repository.CommentsRepository;
import com.homework.hanghae99homework01.service.CommentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CommetsController {
    private final CommentsRepository commentsRepository;
    private final CommentsService commentsService;

}
