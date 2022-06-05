package com.homework.hanghae99homework01.service;

import com.homework.hanghae99homework01.dto.BoardDto;
import com.homework.hanghae99homework01.product.Board;
import com.homework.hanghae99homework01.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public Long update(Long nid, BoardDto boardDto) {
        Board contents = boardRepository.findById(nid).orElseThrow(
                () -> new IllegalArgumentException("[my]Contents.Service): 해당 아이디를 찾을 수 없습니다.")
        );
        contents.update(boardDto);
        boardRepository.save(contents);
        return contents.getId();
    }

    public Board findOne(Long nid){
        return boardRepository.findById(nid).orElseThrow(
                () -> new IllegalArgumentException("([my]Contents.Controller): 해당 아이디를 찾을 수 없습니다.")
        );
    }
}
