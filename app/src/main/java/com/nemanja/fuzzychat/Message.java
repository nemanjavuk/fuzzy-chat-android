package com.nemanja.fuzzychat;

/**
 * Created by nemanja on 1/24/15.
 */
public class Message {

    private String mText;
    private Long mDatetime;

    public String getText() {
        return mText;
    }


    public Long getDatetime() {
        return mDatetime;
    }

    public Message(String text) {
        this.mText = text;
    }

    public Message(String text, Long datetime) {
        this.mText = text;
        this.mDatetime = datetime;
    }

    @Override
    public String toString() {
        return "Message{" +
                "mText='" + mText + '\'' +
                ", mDatetime=" + mDatetime +
                '}';
    }
}
