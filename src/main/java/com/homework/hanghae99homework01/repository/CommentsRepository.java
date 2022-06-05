package com.homework.hanghae99homework01.repository;

import com.homework.hanghae99homework01.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> {
//
//    List<Comments> findByContentsId(Long contentsId, Sort sort);
}
