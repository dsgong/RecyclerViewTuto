package com.example.kimhyunin.recyclerview;

/**
 * Created by kimhyunin on 2018. 3. 2..
 */

public class ListItem {

    private String head;
    private String desc;

    public ListItem(String head, String desc) {
        this.head = head;
        this.desc = desc;
    }

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }
}
