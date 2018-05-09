package com.bignerdranch.android.criminalintent;

import java.sql.Time;
import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private Date mTime;
    private boolean mSolved;
    private boolean mRequiresPolice;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public Date getTime() {
        return mTime;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public void setTime (Date time) { mTime = time; }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public UUID getId() {
        return mId;
    }

    public Crime() {
        this(UUID.randomUUID());
    }
    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
    }
}
