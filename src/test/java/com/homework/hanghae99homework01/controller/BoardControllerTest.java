package com.homework.hanghae99homework01.controller;

import com.homework.hanghae99homework01.model.Board;
import com.homework.hanghae99homework01.model.Comments;
import com.homework.hanghae99homework01.repository.BoardRepository;
import com.homework.hanghae99homework01.repository.CommentsRepository;
import com.homework.hanghae99homework01.service.BoardService;
import com.homework.hanghae99homework01.service.CommentsService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
class BoardControllerTest {

    @Mock
    BoardRepository boardRepository;
    BoardService boardService = new BoardService(boardRepository);

    @Mock
    CommentsRepository commentsRepository;


    @Test
    void 데이터_일괄저장() {
        for (int i = 0; i < 100; i++) {
            Board board = new Board("제목" + i, "이름" + i, "내용" + i);
            Comments comments1 = new Comments("댓이름1_"+i,"댓내용1_"+i);
            Comments comments2 = new Comments("댓이름2_"+i,"댓내용2_"+i);

            System.out.println("board = " + board.getTitle());
            System.out.println("comments1 = " + comments1.getComments());
            boardRepository.save(board);
            board.addComments(comments1);
            board.addComments(comments2);
            commentsRepository.save(comments1);
            commentsRepository.save(comments2);
        }
        List<Board> boardAll = boardRepository.findAll();
        List<Comments> commentsAll = commentsRepository.findAll();

        System.out.println("boardAll = " + boardAll);
        System.out.println("commentsAll = " + commentsAll);

        assertThat(boardAll.size()).isEqualTo(100);
        assertThat(commentsAll.size()).isEqualTo(200);
    }



    @Test
    void 전체_게시글_조회() {
        boardRepository.findAll(Sort.by(Sort.Direction.DESC, "createdAt"));

    }

    @Test
    void createBoard() {
    }

    @Test
    void getBoard() {
    }

    @Test
    void updateBoard() {
    }

    @Test
    void deleteBoard() {
    }
}