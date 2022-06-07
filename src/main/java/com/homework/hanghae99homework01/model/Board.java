package com.homework.hanghae99homework01.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.homework.hanghae99homework01.dto.BoardDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
public class Board extends Timestamped{

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String contents;

    @OneToMany( mappedBy = "board") // 주인은 Comments 고  comments 에서 board 를 참조하고 있다.
    private final List<Comments> commentsList = new ArrayList<>();

    public void addComments(Comments comments){
        comments.setBoard(this);
        this.commentsList.add(comments);
    }

    public Board(String title, String name, String contents) {
        this.title = title;
        this.name = name;
        this.contents = contents;
    }

    public Board(BoardDto boardDto) {
        this.title = boardDto.getTitle();
        this.name = boardDto.getName();
        this.contents = boardDto.getContents();
    }

    public void update(BoardDto boardDto){
        this.title = boardDto.getTitle();
        this.name = boardDto.getName();
        this.contents = boardDto.getContents();
    }

}
