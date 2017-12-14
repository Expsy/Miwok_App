package com.example.android.miwok;

/**
 * Created by Expsy on 23.10.2017.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private int mSoundResourceID;

    public Word (String defaultTranslation, String miwokTranslation, int soundResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourceID = soundResourceID;
    }

    public Word (String defaultTranslation, String miwokTranslation,  int imageResourceID, int soundResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourceID = soundResourceID;
        mImageResourceID = imageResourceID;
    }



    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    /**
     * Get method for Miwok translation.
     * @return mMiwokTranslation
     */
    public String getMinowTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasImage() {
        return (mImageResourceID != NO_IMAGE_PROVIDED);
    }

    public int getSoundResourceID() {
        return mSoundResourceID;
    }


}
