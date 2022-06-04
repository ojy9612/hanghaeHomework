package com.homework.hanghae99homework01.product;

import com.homework.hanghae99homework01.dto.ContentsDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Contents extends Timestamped{

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String contents;

    public Contents(String title, String name, String contents) {
        this.title = title;
        this.name = name;
        this.contents = contents;
    }

    public Contents(ContentsDto contentsDto) {
        this.title = contentsDto.getTitle();
        this.name = contentsDto.getName();
        this.contents = contentsDto.getContents();
    }

    public void update(ContentsDto contentsDto){
        this.title = contentsDto.getTitle();
        this.name = contentsDto.getName();
        this.contents = contentsDto.getContents();
    }
}
