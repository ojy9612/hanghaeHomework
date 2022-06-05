package com.homework.hanghae99homework01.product;

import com.homework.hanghae99homework01.dto.BoardDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Entity
public class Board extends Timestamped{

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String contents;

    @OneToMany( mappedBy = "board") // 주인은 Comment고 comment에서 borad를 참조하고 있다.
    private List<Comments> commentsList = new ArrayList<Comments>();

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
