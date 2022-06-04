package com.homework.hanghae99homework01.repository;

import com.homework.hanghae99homework01.product.Contents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentsRepository extends JpaRepository<Contents, Long> {

}
