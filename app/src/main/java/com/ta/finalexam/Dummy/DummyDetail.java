package com.ta.finalexam.Dummy;

/**
 * Created by Veteran Commander on 10/26/2016.
 */

public class DummyDetail {

    public int userAva;
    public String username;
    public int imContent;
    public String label;
    public String hashtag;

    public int userAvaCm;
    public String comment;

    public DummyDetail(int userAva, String username, int imContent, String label, String hashtag) {
        this.userAva = userAva;
        this.username = username;
        this.imContent = imContent;
        this.label = label;
        this.hashtag = hashtag;
    }

    public DummyDetail(int userAva, String comment) {
        this.userAvaCm = userAva;
        this.comment = comment;
    }
}
