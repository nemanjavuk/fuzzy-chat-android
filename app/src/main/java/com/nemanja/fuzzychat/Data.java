package com.nemanja.fuzzychat;

public class Data {

    public static final int TYPE_MESSAGE = 0;
    public static final int TYPE_LOG = 1;
    public static final int TYPE_ACTION = 2;

    private int mType;
    private Message mMessage;
    private String mUsername;

    public int getType() {
        return mType;
    }

    public Message getMessage() {
        return mMessage;
    }

    public String getUsername() {
        return mUsername;
    }


    public static class Builder {
        private final int mType;
        private String mUsername;
        private Message mMessage;

        public Builder(int type) {
            mType = type;
        }

        public Builder username(String username) {
            mUsername = username;
            mMessage = new Message("");
            return this;
        }

        public Builder message(Message message) {
            mMessage = message;
            return this;
        }

        public Data build() {
            Data data = new Data();
            data.mType = mType;
            data.mUsername = mUsername;
            data.mMessage = mMessage;
            return data;
        }
    }
}
