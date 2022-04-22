package com.onlinestudy.noticeborad.domain;

import java.util.Date;

public class Board {

     String board_id;
     String board_title;
     String board_content;
     int board_show_yn;
     String member_id;
     Date insert_dt;
     Date update_dt;

    public Board(String board_id, String board_title, String board_content, int board_show_yn, String member_id, Date insert_dt, Date update_dt) {
        this.board_id = board_id;
        this.board_title = board_title;
        this.board_content = board_content;
        this.board_show_yn = board_show_yn;
        this.member_id = member_id;
        this.insert_dt = insert_dt;
        this.update_dt = update_dt;
    }

    public String getBoard_id() {
        return board_id;
    }

    public void setBoard_id(String board_id) {
        this.board_id = board_id;
    }

    public String getBoard_title() {
        return board_title;
    }

    public void setBoard_title(String board_title) {
        this.board_title = board_title;
    }

    public String getBoard_content() {
        return board_content;
    }

    public void setBoard_content(String board_content) {
        this.board_content = board_content;
    }

    public int getBoard_show_yn() {
        return board_show_yn;
    }

    public void setBoard_show_yn(int board_show_yn) {
        this.board_show_yn = board_show_yn;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public Date getInsert_dt() {
        return insert_dt;
    }

    public void setInsert_dt(Date insert_dt) {
        this.insert_dt = insert_dt;
    }

    public Date getUpdate_dt() {
        return update_dt;
    }

    public void setUpdate_dt(Date update_dt) {
        this.update_dt = update_dt;
    }
}
