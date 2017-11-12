package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Story[] mStories = new Story[] {
            new Story(R.string.T1_Story,
                    new Branch[] { new Branch(R.string.T1_Ans1, 2), new Branch(R.string.T1_Ans2, 1) } ),
            new Story(R.string.T2_Story,
                    new Branch[] { new Branch(R.string.T2_Ans1, 2), new Branch(R.string.T2_Ans2, 3) } ),
            new Story(R.string.T3_Story,
                    new Branch[] { new Branch(R.string.T3_Ans1, 5), new Branch(R.string.T3_Ans2, 4) } ),
            new Story(R.string.T4_End,
                    new Branch[] { new Branch(-1, 0), new Branch(-1, 0) } ),
            new Story(R.string.T5_End,
                    new Branch[] { new Branch(-1,  0), new Branch(-1, 0) } ),
            new Story(R.string.T6_End,
                    new Branch[] { new Branch(-1, 0), new Branch(-1, 0) } )
    };

    Button mTopButton ;
    Button mBottomButton ;
    TextView mStory ;
    int mStoryIndex =0 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTopButton    = (Button)   findViewById(R.id.buttonTop);
        mBottomButton = (Button)   findViewById(R.id.buttonBottom);
        mStory        = (TextView) findViewById(R.id.storyTextView);

        mStory.setText(mStories[mStoryIndex].getNaration());
        mTopButton.setText(mStories[mStoryIndex].getBranches()[0].getQuestion());
        mBottomButton.setText(mStories[mStoryIndex].getBranches()[1].getQuestion());



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        nextStory(0);
                    }
                });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        nextStory(1);
                    }
                });

    }

    private void nextStory (int noButton){
        if (mStoryIndex != -1) {
            mStoryIndex = mStories[mStoryIndex].getBranches()[noButton].getNextStory();
            if (mStoryIndex == -1) {
                mStory.setText("----> End <-----");
            } else {
                if (mStories[mStoryIndex].getNaration() != -1) {
                    mStory.setText(mStories[mStoryIndex].getNaration());
                } else {
                    mStory.setText("----> End <-----");
                }
                if (mStories[mStoryIndex].getBranches()[0].getQuestion() != -1) {
                    mTopButton.setText(mStories[mStoryIndex].getBranches()[0].getQuestion());
                } else {
                    mTopButton.setText("----> End <-----");
                }
                if (mStories[mStoryIndex].getBranches()[1].getQuestion() != -1) {
                    mBottomButton.setText(mStories[mStoryIndex].getBranches()[1].getQuestion());
                } else {
                    mBottomButton.setText("----> End <-----");
                }
            }

        }


    }
}
