package com.londonappbrewery.destini;

/**
 * Created by nicolas on 11/11/17.
 */


public class Branch{
    private int mQuestion;
    private int mNextStory;

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public int getNextStory() {
        return mNextStory;
    }

    public void setNextStory(int nextStory) {
        mNextStory = nextStory;
    }

    public Branch(int question, int nextStory) {

        mQuestion = question;
        mNextStory = nextStory;
    }
}

