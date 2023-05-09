package com.example.igosafely;

import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class HowToSwipe extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_how_to_swipe);

        addFragment(new Step.Builder()
        .setTitle("About iGoSafely")
        .setContent("In order to ask for help, you need to add contact numbers of your friends.").setSummary("Step 1")
        .setBackgroundColor(Color.parseColor("#C791BA"))
        .setDrawable(R.drawable.s1).build());

        addFragment(new Step.Builder()
                .setTitle("How to use in trouble?")
                .setContent("Just press the start service button to start the siren.")
                .setSummary("Step 2")
                .setBackgroundColor(Color.parseColor("#C791BA"))
                .setDrawable(R.drawable.s2).build());

        addFragment(new Step.Builder()
                .setTitle("What happens if you hit panic button")
                .setContent("SOS will be triggered resulting in sending a call, message and location to the registered mobile numbers.")
                .setSummary("Step 3")
                .setSummary("This is summary")
                .setBackgroundColor(Color.parseColor("#C791BA"))
                .setDrawable(R.drawable.s3).build());
    }

    @Override
    public void currentFragmentPosition(int position) {

    }
}
