package com.example.android.miwok;

public class Word {

    private String mDefaultWord;
    private String mMiwokWord;
    private int mResourceID = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    public Word(String defaultWord, String miwokWord, int resourceID) {
        this(defaultWord, miwokWord);
        mResourceID = resourceID;
    }

    public Word(String defaultWord, String miwokWord) {
        mDefaultWord = defaultWord;
        mMiwokWord = miwokWord;
    }

    public String getDefaultWord() {
        return mDefaultWord;
    }

    public String getMiwokWord() {
        return mMiwokWord;
    }

    public int getResourceID() {
        return  mResourceID;
    }

    public boolean hasImage() {
        return mResourceID != NO_IMAGE;
    }
}
