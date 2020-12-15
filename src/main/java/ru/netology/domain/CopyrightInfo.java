package ru.netology.domain;

public class CopyrightInfo {
  private   int count;
   private int countPost;
   private int GroupCanPost;
   private boolean CanClose;
   private boolean CanOpen;

    public int getGroupCanPost() {
        return GroupCanPost;
    }

    public CopyrightInfo setGroupCanPost(int groupCanPost) {
        GroupCanPost = groupCanPost;
        return this;
    }

    public int getCountPost() {
        return countPost;
    }

    public CopyrightInfo setCountPost(int countPost) {
        this.countPost = countPost;
        return this;
    }

    public int getCount() {
        return count;
    }

    public CopyrightInfo setCount(int count) {
        this.count = count;
        return this;
    }

    public boolean isCanOpen() {
        return CanOpen;
    }

    public CopyrightInfo setCanOpen(boolean canOpen) {
        CanOpen = canOpen;
        return this;
    }

    public boolean isCanClose() {
        return CanClose;
    }

    public CopyrightInfo setCanClose(boolean canClose) {
        CanClose = canClose;
        return this;
    }
}
