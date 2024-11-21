package com.example.board.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
    //url - *.do

    @RequestMapping("/list.do")
    public String list() {
        return "board_list1";
    }

    @RequestMapping(value = "/view.do")
    public String view() {
        return "board_view1";
    }

    @RequestMapping("/write.do")
    public String write() {
        return "board_write1";
    }

    @RequestMapping("/write_ok.do")
    public String write() {
        return "board_write1_ok";
    }

    @RequestMapping("/modify.do")
    public String modify() {
        return "board_modify1";
    }

    @RequestMapping("/modify_ok.do")
    public String modify() {
        return "board_modify1_ok";
    }

    @RequestMapping("/delete.do")
    public String delete() {
        return "board_delete1";
    }

    @RequestMapping("/delete_ok.do")
    public String delete() {
        return "board_delete1_ok";
    }
}
