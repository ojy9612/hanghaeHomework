package com.homework.hanghae99homework01.controller;

import com.homework.hanghae99homework01.repository.ContentsRepository;
import com.homework.hanghae99homework01.service.ContentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ContentsController {
    private final ContentsService contentsService;
    private final ContentsRepository contentsRepository;

    
}
