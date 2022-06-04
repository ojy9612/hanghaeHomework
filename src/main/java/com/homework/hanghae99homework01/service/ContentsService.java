package com.homework.hanghae99homework01.service;

import com.homework.hanghae99homework01.dto.ContentsDto;
import com.homework.hanghae99homework01.product.Contents;
import com.homework.hanghae99homework01.repository.ContentsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ContentsService {
    private final ContentsRepository contentsRepository;

    public Long update(Long nid, ContentsDto contentsDto) {
        Contents contents = contentsRepository.findById(nid).orElseThrow(
                () -> new IllegalArgumentException("[my]Contents.Service): 해당 아이디를 찾을 수 없습니다.")
        );
        contents.update(contentsDto);
        contentsRepository.save(contents);
        return contents.getId();
    }

    public Contents findOne(Long nid){
        return contentsRepository.findById(nid).orElseThrow(
                () -> new IllegalArgumentException("([my]Contents.Controller): 해당 아이디를 찾을 수 없습니다.")
        );
    }
}
