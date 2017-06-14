package com.example.android.miwok;

import android.util.Log;

/**
 * Created by DanielVG on 12.05.17.
 */

public class Word {
    /*Default translation of the Word*/
    private String mDefaultTranslation;

    /*Word in the Miwauke langauge*/
    private String mMiowokTranslation;

    /*Sound file of the Word in Miwauke language*/
    private int mSoundfileRessourceID;
    /*Image ressource ID for the Word Object*/
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    /*Creating a new Word Object with the Constructor and an additional image*/
    public Word(String defaultTranslation, String miwokTranslation, int soundRessourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiowokTranslation = miwokTranslation;
        mSoundfileRessourceID = soundRessourceID;
    }

    /*Creating a new Word Object with the Constructor and an additional SoundFile*/
    public Word(String defaultTranslation, String miwokTranslation, int imageRessourceID, int soundRessourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiowokTranslation = miwokTranslation;
        mImageResourceID = imageRessourceID;
        mSoundfileRessourceID = soundRessourceID;

    }

    /*Getter Method to get the default translation of the word*/
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /*Getter Method to get the Miwok translation of the word*/
    public String getMiowokTranslation() {
        return mMiowokTranslation;
    }

    /*Getter method to return the Image ID of the Word*/
    public int getImageResourceID() {
        return mImageResourceID;
    }

    /**
     * returns if the current word object has an image or not
     */
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    /*Getter method to return the Image ID of the Word*/
    public int getmSoundfileRessourceID() {
        return mSoundfileRessourceID;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiowokTranslation='" + mMiowokTranslation + '\'' +
                ", mSoundfileRessourceID=" + mSoundfileRessourceID +
                ", mImageResourceID=" + mImageResourceID +
                '}';
    }
}
