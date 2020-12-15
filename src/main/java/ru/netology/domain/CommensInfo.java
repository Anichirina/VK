package ru.netology.domain;

public class CommensInfo {
        private int count;
        private boolean canPost;
        private boolean groupsCanPost;
        private boolean canClose;
        private boolean canOpen;

        public boolean isGroupsCanPost() {
                return groupsCanPost;
        }

        public void setGroupsCanPost(boolean groupsCanPost) {
                this.groupsCanPost = groupsCanPost;
        }

        public int getCount() {
                return count;
        }

        public void setCount(int count) {
                this.count = count;
        }

        public boolean isCanPost() {
                return canPost;
        }

        public void setCanPost(boolean canPost) {
                this.canPost = canPost;
        }

        public boolean isCanOpen() {
                return canOpen;
        }

        public void setCanOpen(boolean canOpen) {
                this.canOpen = canOpen;
        }

        public boolean isCanClose() {
                return canClose;
        }

        public void setCanClose(boolean canClose) {
                this.canClose = canClose;
        }
}
