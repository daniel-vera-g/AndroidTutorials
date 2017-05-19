package com.example.android.miwok;

/**
 * Created by DanielVG on 12.05.17.
 */

public class Word {
    /*Default translation of the Word*/
    private String mDefaultTranslation;

    /*Word in the Miwauke langauge*/
    private String mMiowokTranslation;
    /*Image ressource ID for the Word Object*/
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /*Creating a new Word Object with the Constructor*/
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiowokTranslation= miwokTranslation;
    }

    /*Creating a new Word Object with the Constructor and an additional image*/
    public Word(String defaultTranslation, String miwokTranslation, int imageRessourceID){
        mDefaultTranslation = defaultTranslation;
        mMiowokTranslation= miwokTranslation;
        mImageResourceID = imageRessourceID;
    }

    /*Getter Method to get the default translation of the word*/
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    /*Getter Method to get the Miwok translation of the word*/
    public String getMiowokTranslation(){
        return mMiowokTranslation;
    }

    /*Getter method to return the Image ID of the Word*/
    public int getImageResourceID(){
        return mImageResourceID;
    }

    /**
     * returns if the current word object has an image or not
     * */
    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
