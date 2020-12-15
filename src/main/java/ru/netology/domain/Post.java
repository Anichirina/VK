package ru.netology.domain;

public class Post {
private int id;
private int  ownerId;
private int frontId;
private  int createdId;
private  int dateInfo;
private String textInfo;
private int replyOwnerId;
private  int replyPostId;
private int friendsOnly;
private boolean commentsInfo;
private boolean copyrightInfo;
private boolean likeInfo;
private boolean repostInfo;
private  boolean viewInfo;
private String postTypeInfo;
private boolean postSourceInfo;
private boolean geoInfo;
private  int singerIdInfo;
private int canPinInfo;
private int canDeleteInfo;
private int canEditInfo;
private int isPinnedInfo;
private int markedAsAdsInfo;
private boolean isFavoritInfo;
private boolean donutInfo;
private int postponedIdInfo;

    public boolean isViewInfo() {
        return viewInfo;
    }

    public void setViewInfo(boolean viewInfo) {
        this.viewInfo = viewInfo;
    }

    public String getTextInfo() {
        return textInfo;
    }

    public void setTextInfo(String textInfo) {
        this.textInfo = textInfo;
    }

    public int getSingerIdInfo() {
        return singerIdInfo;
    }

    public void setSingerIdInfo(int singerIdInfo) {
        this.singerIdInfo = singerIdInfo;
    }

    public boolean isRepostInfo() {
        return repostInfo;
    }

    public void setRepostInfo(boolean repostInfo) {
        this.repostInfo = repostInfo;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public String getPostTypeInfo() {
        return postTypeInfo;
    }

    public void setPostTypeInfo(String postTypeInfo) {
        this.postTypeInfo = postTypeInfo;
    }

    public boolean isPostSourceInfo() {
        return postSourceInfo;
    }

    public void setPostSourceInfo(boolean postSourceInfo) {
        this.postSourceInfo = postSourceInfo;
    }

    public int getPostponedIdInfo() {
        return postponedIdInfo;
    }

    public void setPostponedIdInfo(int postponedIdInfo) {
        this.postponedIdInfo = postponedIdInfo;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getMarkedAsAdsInfo() {
        return markedAsAdsInfo;
    }

    public void setMarkedAsAdsInfo(int markedAsAdsInfo) {
        this.markedAsAdsInfo = markedAsAdsInfo;
    }

    public boolean isLikeInfo() {
        return likeInfo;
    }

    public void setLikeInfo(boolean likeInfo) {
        this.likeInfo = likeInfo;
    }

    public int getIsPinnedInfo() {
        return isPinnedInfo;
    }

    public void setIsPinnedInfo(int isPinnedInfo) {
        this.isPinnedInfo = isPinnedInfo;
    }

    public boolean isFavoritInfo() {
        return isFavoritInfo;
    }

    public void setFavoritInfo(boolean favoritInfo) {
        isFavoritInfo = favoritInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(boolean geoInfo) {
        this.geoInfo = geoInfo;
    }

    public int getFrontId() {
        return frontId;
    }

    public void setFrontId(int frontId) {
        this.frontId = frontId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public boolean isDonutInfo() {
        return donutInfo;
    }

    public void setDonutInfo(boolean donutInfo) {
        this.donutInfo = donutInfo;
    }

    public int getDateInfo() {
        return dateInfo;
    }

    public void setDateInfo(int dateInfo) {
        this.dateInfo = dateInfo;
    }

    public int getCreatedId() {
        return createdId;
    }

    public void setCreatedId(int createdId) {
        this.createdId = createdId;
    }

    public boolean isCopyrightInfo() {
        return copyrightInfo;
    }

    public void setCopyrightInfo(boolean copyrightInfo) {
        this.copyrightInfo = copyrightInfo;
    }

    public boolean isCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(boolean commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public int getCanPinInfo() {
        return canPinInfo;
    }

    public void setCanPinInfo(int canPinInfo) {
        this.canPinInfo = canPinInfo;
    }

    public int getCanEditInfo() {
        return canEditInfo;
    }

    public void setCanEditInfo(int canEditInfo) {
        this.canEditInfo = canEditInfo;
    }

    public int getCanDeleteInfo() {
        return canDeleteInfo;
    }

    public void setCanDeleteInfo(int canDeleteInfo) {
        this.canDeleteInfo = canDeleteInfo;
    }
}
