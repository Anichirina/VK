package ru.netology.domain;

public class DonutsInfo {
private boolean isDonuts;
private int paidDuration;
private boolean placeholder;
private boolean canPublishFreeCopy;
private String editMode;

    public boolean isPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(boolean placeholder) {
        this.placeholder = placeholder;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public boolean isDonuts() {
        return isDonuts;
    }

    public void setDonuts(boolean donuts) {
        isDonuts = donuts;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }
}
