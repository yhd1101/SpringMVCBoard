package com.example.board.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardTO {

    private  String seq;
    private  String subject;
    private  String writer;
    private  String mail;
    private  String password;
    private  String content;
    private  String hit;
    private  String wip;
    private  String date;
    private int wgap;
}
