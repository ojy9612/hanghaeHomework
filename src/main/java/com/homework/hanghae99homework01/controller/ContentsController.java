package com.homework.hanghae99homework01.controller;

import com.homework.hanghae99homework01.dto.ContentsDto;
import com.homework.hanghae99homework01.product.Contents;
import com.homework.hanghae99homework01.repository.ContentsRepository;
import com.homework.hanghae99homework01.service.ContentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class ContentsController {
    private final ContentsService contentsService;
    private final ContentsRepository contentsRepository;

    /**
     * 전체 게시글 목록 조회
     */
    @GetMapping("/api/contents/all")
    public List<Contents> getAllContents() {
        return contentsRepository.findAll(Sort.by(Sort.Direction.DESC, "createdAt"));
    }

    /**
     * 게시글 작성
     */
    @PostMapping("/api/contents")
    public Contents createContents(@RequestBody ContentsDto contentsDto) {
        Contents contents = new Contents(contentsDto);
        return contentsRepository.save(contents);
    }

    /**
     * 게시글 하나 조회
     * 댓글도 불러와야 함
     */
    @GetMapping("/api/contents/{nid}")
    public Contents getContents(@PathVariable Long nid) {
        return contentsService.findOne(nid);
    }

    /**
     * 게시글 수정
     */
    @PutMapping("/api/contents/{nid}")
    public Long updateContents(@PathVariable Long nid, @RequestBody ContentsDto contentsDto) {
        return contentsService.update(nid, contentsDto);
    }

    /**
     * 게시글 삭제
     */
    @DeleteMapping("/api/contents/{nid}")
    public Long deleteContents(@PathVariable Long nid) {
        contentsRepository.deleteById(nid);
        return nid;
    }
}
