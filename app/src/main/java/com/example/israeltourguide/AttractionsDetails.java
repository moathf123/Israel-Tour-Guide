package com.example.israeltourguide;

public class AttractionsDetails {

    int mImageResourcesID;
    String mTimeInfo;
    String mAttractionName;
    String mLocationName;

    public AttractionsDetails(int mImageResourcesID, String mTimeInfo, String mAttractionName, String mLocationName) {
        this.mImageResourcesID = mImageResourcesID;
        this.mTimeInfo = mTimeInfo;
        this.mAttractionName = mAttractionName;
        this.mLocationName = mLocationName;
    }

    public int getmImageResourcesID() {
        return mImageResourcesID;
    }

    public String getmTimeInfo() {
        return mTimeInfo;
    }

    public String getmAttractionName() {
        return mAttractionName;
    }

    public String getmLocationName() {
        return mLocationName;
    }

}
