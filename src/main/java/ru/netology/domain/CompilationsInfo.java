package ru.netology.domain;

public class CompilationsInfo {
    private int ID;
    private boolean Liked;
    private boolean Reposted;
    private boolean commentsAllowed;
    private boolean bookmarked;
    private boolean user;

    public boolean isUser() {
        return user;
    }

    public void setUser(boolean user) {
        this.user = user;
    }

    public boolean isReposted() {
        return Reposted;
    }

    public void setReposted(boolean reposted) {
        Reposted = reposted;
    }

    public boolean isLiked() {
        return Liked;
    }

    public void setLiked(boolean liked) {
        Liked = liked;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isCommentsAllowed() {
        return commentsAllowed;
    }

    public void setCommentsAllowed(boolean commentsAllowed) {
        this.commentsAllowed = commentsAllowed;
    }

    public boolean isBookmarked() {
        return bookmarked;
    }

    public void setBookmarked(boolean bookmarked) {
        this.bookmarked = bookmarked;
    }
}
