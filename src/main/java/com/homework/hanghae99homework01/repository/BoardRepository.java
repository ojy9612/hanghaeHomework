package com.homework.hanghae99homework01.repository;

import com.homework.hanghae99homework01.product.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

}
