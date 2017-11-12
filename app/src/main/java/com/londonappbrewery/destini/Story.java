package com.londonappbrewery.destini;

/**
 * Created by nicolas on 11/11/17.
 */

public class Story{
    private int mNaration;
    private Branch[] mBranches;




    public int getNaration() {
        return mNaration;
    }

    public Branch[] getBranches() {
        return mBranches;
    }

    public Story(int naration, Branch[] branches) {
        mNaration = naration;
        mBranches = branches;
    }

    public void setNaration(int naration) {
        mNaration = naration;
    }

    public void setBranches(Branch[] branches) {
        mBranches = branches;
    }
}
