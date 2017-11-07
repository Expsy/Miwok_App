package com.example.android.miwok;

/**
 * Created by Expsy on 23.10.2017.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word (String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
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

}
