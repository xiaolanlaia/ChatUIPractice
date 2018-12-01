package com.example.chatuipractice;

/**
 * Created by W on 2018/12/1.
 */

public class Msg {

    public static final int TYPE_RECEIVED = 0;
    public static final int TYPE_SENT = 1;

    private String content;
    private int type;

    public String getContent() {
        return content;
    }

    public int getType() {
        return type;
    }

    public Msg(String content, int type) {
        this.content = content;
        this.type = type;
    }
}
