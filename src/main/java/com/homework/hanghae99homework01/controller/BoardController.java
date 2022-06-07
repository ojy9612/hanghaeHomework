package com.homework.hanghae99homework01.controller;

import com.homework.hanghae99homework01.dto.BoardDto;
import com.homework.hanghae99homework01.model.Board;
import com.homework.hanghae99homework01.model.Comments;
import com.homework.hanghae99homework01.repository.BoardRepository;
import com.homework.hanghae99homework01.repository.CommentsRepository;
import com.homework.hanghae99homework01.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@RestController
public class BoardController {
    private final BoardService boardService;
    private final BoardRepository boardRepository;
    private final CommentsRepository commentsRepository;

    /**
     * 전체 게시글 목록 조회
     */
    @GetMapping("/api/boards/all")
    public List<Board> getAllBoard() {
        return boardRepository.findAll(Sort.by(Sort.Direction.DESC, "createdAt"));
    }

    /**
     * 게시글 작성
     */
    @PostMapping("/api/boards")
    public Board createBoard(@Valid @RequestBody BoardDto boardDto) {
        Board board = new Board(boardDto);
        return boardRepository.save(board);
    }

    /**
     * 게시글 하나 조회
     * 댓글도 불러와야 함
     */
    @GetMapping("/api/boards/{nid}")
    public Board getBoard(@PathVariable Long nid) {
        return boardService.findOne(nid);
    }

    /**
     * 게시글 수정
     */
    @PutMapping("/api/boards/{nid}")
    public Long updateBoard(@PathVariable Long nid, @RequestBody BoardDto boardDto) {
        return boardService.update(nid, boardDto);
    }

    /**
     * 게시글 삭제
     */
    @DeleteMapping("/api/boards/{nid}")
    public Long deleteBoard(@PathVariable Long nid) {
        Optional<Board> optionalBoard = boardRepository.findById(nid);
        if (optionalBoard.isPresent()){
            Board board = optionalBoard.get();
            List<Comments> commentsList = board.getCommentsList();

            commentsRepository.deleteAll(commentsList);
        }

        boardRepository.deleteById(nid);
        return nid;
    }
}
