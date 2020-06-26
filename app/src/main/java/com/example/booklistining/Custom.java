package com.example.booklistining;

public class Custom {
    private String mTitle;
    private String mSubTitle;
    public Custom(String title, String subTitle) {
        this.mTitle = title;
        this.mSubTitle = subTitle;
    }

    public Custom(String title) {
        this.mTitle = title;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmSubTitle() {
        return mSubTitle;
    }
}
