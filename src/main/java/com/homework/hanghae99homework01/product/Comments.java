package com.homework.hanghae99homework01.product;

import com.homework.hanghae99homework01.dto.CommentsDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Comments extends Timestamped{

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private Long contentsId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String comments;

    public void setContentsId(Long contentsId) {
        this.contentsId = contentsId;
    }

    public Comments(Long contentsId, String name, String comments) {
        this.contentsId = contentsId;
        this.name = name;
        this.comments = comments;
    }

    public Comments(CommentsDto commentsDto) {
        this.name = commentsDto.getName();
        this.comments = commentsDto.getComments();
    }

    public void update(CommentsDto commentsDto) {
        this.name = commentsDto.getName();
        this.comments = commentsDto.getComments();
    }

}
