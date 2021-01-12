package ru.netology.domain;

public class Post {
private int id;
private int  ownerId;
private FromId frontId;
private  CreatedBy createdId;
private  DataInfo dateInfo;
private String textInfo;
private int replyOwnerId;
private  int replyPostId;
private int friendsOnly;
private CommensInfo commentsInfo;
private CopyrightInfo copyrightInfo;
private LikeInfo likeInfo;
private RepostInfo repostInfo;
private VeiwInfo viewInfo;
private PostType postTypeInfo;
private PostInfoDemo postSourceInfo;
private Geoinfo geoInfo;
private int singerIdInfo;
private int canPinInfo;
private int canDeleteInfo;
private int canEditInfo;
private int isPinnedInfo;
private int markedAsAdsInfo;
private String isFavoritInfo;
private DonutsInfo donutInfo;
private int postponedIdInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public FromId getFrontId() {
        return frontId;
    }

    public void setFrontId(FromId frontId) {
        this.frontId = frontId;
    }

    public CreatedBy getCreatedId() {
        return createdId;
    }

    public void setCreatedId(CreatedBy createdId) {
        this.createdId = createdId;
    }

    public DataInfo getDateInfo() {
        return dateInfo;
    }

    public void setDateInfo(DataInfo dateInfo) {
        this.dateInfo = dateInfo;
    }

    public String getTextInfo() {
        return textInfo;
    }

    public void setTextInfo(String textInfo) {
        this.textInfo = textInfo;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public CommensInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommensInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public CopyrightInfo getCopyrightInfo() {
        return copyrightInfo;
    }

    public void setCopyrightInfo(CopyrightInfo copyrightInfo) {
        this.copyrightInfo = copyrightInfo;
    }

    public LikeInfo getLikeInfo() {
        return likeInfo;
    }

    public void setLikeInfo(LikeInfo likeInfo) {
        this.likeInfo = likeInfo;
    }

    public RepostInfo getRepostInfo() {
        return repostInfo;
    }

    public void setRepostInfo(RepostInfo repostInfo) {
        this.repostInfo = repostInfo;
    }

    public VeiwInfo getViewInfo() {
        return viewInfo;
    }

    public void setViewInfo(VeiwInfo viewInfo) {
        this.viewInfo = viewInfo;
    }

    public PostType getPostTypeInfo() {
        return postTypeInfo;
    }

    public void setPostTypeInfo(PostType postTypeInfo) {
        this.postTypeInfo = postTypeInfo;
    }

    public PostInfoDemo getPostSourceInfo() {
        return postSourceInfo;
    }

    public void setPostSourceInfo(PostInfoDemo postSourceInfo) {
        this.postSourceInfo = postSourceInfo;
    }

    public Geoinfo getGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(Geoinfo geoInfo) {
        this.geoInfo = geoInfo;
    }

    public int getSingerIdInfo() {
        return singerIdInfo;
    }

    public void setSingerIdInfo(int singerIdInfo) {
        this.singerIdInfo = singerIdInfo;
    }

    public int getCanPinInfo() {
        return canPinInfo;
    }

    public void setCanPinInfo(int canPinInfo) {
        this.canPinInfo = canPinInfo;
    }

    public int getCanDeleteInfo() {
        return canDeleteInfo;
    }

    public void setCanDeleteInfo(int canDeleteInfo) {
        this.canDeleteInfo = canDeleteInfo;
    }

    public int getCanEditInfo() {
        return canEditInfo;
    }

    public void setCanEditInfo(int canEditInfo) {
        this.canEditInfo = canEditInfo;
    }

    public int getIsPinnedInfo() {
        return isPinnedInfo;
    }

    public void setIsPinnedInfo(int isPinnedInfo) {
        this.isPinnedInfo = isPinnedInfo;
    }

    public int getMarkedAsAdsInfo() {
        return markedAsAdsInfo;
    }

    public void setMarkedAsAdsInfo(int markedAsAdsInfo) {
        this.markedAsAdsInfo = markedAsAdsInfo;
    }

    public String getIsFavoritInfo() {
        return isFavoritInfo;
    }

    public void setIsFavoritInfo(String isFavoritInfo) {
        this.isFavoritInfo = isFavoritInfo;
    }

    public DonutsInfo getDonutInfo() {
        return donutInfo;
    }

    public void setDonutInfo(DonutsInfo donutInfo) {
        this.donutInfo = donutInfo;
    }

    public int getPostponedIdInfo() {
        return postponedIdInfo;
    }

    public void setPostponedIdInfo(int postponedIdInfo) {
        this.postponedIdInfo = postponedIdInfo;
    }
}
