package com.homework.hanghae99homework01.repository;

import com.homework.hanghae99homework01.model.Board;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

    @Override
    List<Board> findAll(Sort sort);
}
