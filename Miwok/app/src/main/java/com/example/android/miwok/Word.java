package com.example.android.miwok;

/**
 * Created by DanielVG on 12.05.17.
 */

public class Word {
    /*Default translation of the Word*/
    private String mDefaultTranslation;

    /*Word in the Miwauke langauge*/
    private String mMiowokTranslation;

    /*Creating a new Word Object with the Constructor*/
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiowokTranslation= miwokTranslation;
    }

    /*Getter Method to get the default translation of the word*/
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    /*Getter Method to get the Miwok translation of the word*/
    public String getMiowokTranslation(){
        return mMiowokTranslation;
    }
}
