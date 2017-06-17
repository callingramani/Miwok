package com.example.android.miwok;

/**
 * Created by ankit on 25-12-2016.
 */

public class Word {

    private String mMiwok;
    private String mEnglish;
    private int mresourceId;
    private  int mrawId;



    public Word(String English,String Miwok,int rawId){
        mMiwok = Miwok;
        mEnglish = English;
        mrawId =rawId;



    }

    public Word(String English,String Miwok,int resourceId,int rawId) {
        mMiwok = Miwok;
        mEnglish = English;
        mresourceId = resourceId;
        mrawId =rawId;


    }

    public String getmEnglish() {
        return mEnglish;
    }

    public String getmMiwok() {
        return mMiwok;
    }

    public int getmresourceId() {
        return mresourceId;
    }

    public int getmrawId(){ return mrawId;}



    public boolean hasmresourceId() {

        int got = getmresourceId();
        if (got != '\0')
            return true;
        else
            return false;

    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwok='" + mMiwok + '\'' +
                ", mEnglish='" + mEnglish + '\'' +
                ", mresourceId=" + mresourceId +
                ", mrawId=" + mrawId +
                '}';
    }
}




