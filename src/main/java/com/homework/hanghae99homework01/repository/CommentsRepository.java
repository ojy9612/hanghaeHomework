package com.homework.hanghae99homework01.repository;

import com.homework.hanghae99homework01.product.Comments;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> {

    List<Comments> findByContentsId(Long contentsId, Sort sort);
}
