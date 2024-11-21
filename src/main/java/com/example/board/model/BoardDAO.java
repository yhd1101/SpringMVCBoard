package com.example.board.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class BoardDAO {

    private final Logger logger = LoggerFactory.getLogger( this.getClass().getName());

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public ArrayList<BoardTO> boardList() {
        String sql = "select seq, subject, writer, date_format( date, '%Y/%m/%d' ) date, hit, datediff( now(), date ) wgap from board1 order by seq desc";
        ArrayList<BoardTO> lists = (ArrayList<BoardTO>) jdbcTemplate.query(
                sql,
                new BeanPropertyRowMapper<>(BoardTO.class));
        logger.info("logger : {}" , "데이터개수 : " + lists.size());
        return lists;
    }
}
