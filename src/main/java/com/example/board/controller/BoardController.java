package com.example.board.controller;


import com.example.board.model.BoardDAO;
import com.example.board.model.BoardTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class BoardController {
    //url - *.do

    @Autowired
    private BoardDAO boardDAO;
    @RequestMapping("/list.do")
    public String list(Model model) {
        ArrayList<BoardTO> lists =  boardDAO.boardList();
        model.addAttribute("list", lists);
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
    public String write_ok(HttpServletRequest request, Model model) {
        BoardTO to  = new BoardTO();
        to.setSubject(request.getParameter("subject"));
        to.setWriter(request.getParameter("writer"));
        to.setMail(request.getParameter("mail1") + "@" + request.getParameter("mail2"));
        to.setPassword(request.getParameter("password"));
        to.setContent(request.getParameter("content"));
        to.setWip(request.getRemoteAddr());

        int flag = boardDAO.boardWriteOk(to);

        model.addAttribute("flag", flag);
        return "board_write1_ok";
    }

    @RequestMapping("/modify.do")
    public String modify() {
        return "board_modify1";
    }

    @RequestMapping("/modify_ok.do")
    public String modify_ok() {
        return "board_modify1_ok";
    }

    @RequestMapping("/delete.do")
    public String delete() {
        return "board_delete1";
    }

    @RequestMapping("/delete_ok.do")
    public String delete_ok() {
        return "board_delete1_ok";
    }
}
