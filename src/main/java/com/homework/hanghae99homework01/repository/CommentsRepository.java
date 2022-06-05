package com.homework.hanghae99homework01.repository;

import com.homework.hanghae99homework01.model.Board;
import com.homework.hanghae99homework01.model.CommentsNoBoard;
import com.homework.hanghae99homework01.model.Comments;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> {


    List<CommentsNoBoard> findByBoard(Board board, Sort sort);
}
