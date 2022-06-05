package com.homework.hanghae99homework01.model;

import com.homework.hanghae99homework01.dto.CommentsDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Comments extends Timestamped{

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String comments;

    @Setter
    @ManyToOne
    private Board board;

    public Comments(String name, String comments) {
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
