package com.onlinestudy.noticeborad.domain;

import java.util.Date;

public class Comment {

    String comment_id;
    String board_id;
    String member_id;
    String comment_content;
    int comment_show_yn;
    Date insert_dt;
    Date update_dt;

    public Comment(String comment_id, String board_id, String member_id, String comment_content, int comment_show_yn, Date insert_dt, Date update_dt) {
        this.comment_id = comment_id;
        this.board_id = board_id;
        this.member_id = member_id;
        this.comment_content = comment_content;
        this.comment_show_yn = comment_show_yn;
        this.insert_dt = insert_dt;
        this.update_dt = update_dt;
    }

    public String getComment_id() {
        return comment_id;
    }

    public void setComment_id(String comment_id) {
        this.comment_id = comment_id;
    }

    public String getBoard_id() {
        return board_id;
    }

    public void setBoard_id(String board_id) {
        this.board_id = board_id;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

    public int getComment_show_yn() {
        return comment_show_yn;
    }

    public void setComment_show_yn(int comment_show_yn) {
        this.comment_show_yn = comment_show_yn;
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
