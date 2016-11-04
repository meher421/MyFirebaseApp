package com.sam.fire;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.analytics.FirebaseAnalytics;

public class AnalyticsActivity extends AppCompatActivity {

    /**
     * The {@code FirebaseAnalytics} used to record screen views.
     */
      // [START declare_analytics]
    private FirebaseAnalytics mFirebaseAnalytics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analytics);

        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        mFirebaseAnalytics.setUserProperty("test1","sample 1"); //set user property
        mFirebaseAnalytics.setCurrentScreen(this,"AnalyticsActivity","AnalastParam");

        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "1");
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "prasad");
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);

        Bundle b2 = new Bundle();
        b2.putString(FirebaseAnalytics.Param.ITEM_ID, "2");
        b2.putString(FirebaseAnalytics.Param.ITEM_NAME, "meher");
        b2.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, b2);

        Bundle b3 = new Bundle();
        b3.putString(FirebaseAnalytics.Param.ITEM_ID, "1");
        b3.putString(FirebaseAnalytics.Param.ITEM_NAME, "meher");
        b3.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, b3);

        Bundle b4 = new Bundle();
        b4.putString(FirebaseAnalytics.Param.ITEM_ID, "2");
        b4.putString(FirebaseAnalytics.Param.ITEM_NAME, "prasad");
        b4.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, b4);

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
