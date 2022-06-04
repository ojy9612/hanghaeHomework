package com.homework.hanghae99homework01.service;

import com.homework.hanghae99homework01.repository.ContentsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ContentsService {
    private final ContentsRepository contentsRepository;


}
