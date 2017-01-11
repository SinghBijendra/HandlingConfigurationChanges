package com.bijendra.configuration.handle.handlingconfigurationchanges;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SRASActivity extends AppCompatActivity {
    static final String AGE = "int_age";
    static final String NAME = "string_name";
    static final String NEW_LINE = "\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sras);
        if(savedInstanceState!=null)
        {
            CUtil.showMsg(this,"Configuration Changed");
            String value=NEW_LINE+"Name : "+savedInstanceState.getString(NAME);
            value += NEW_LINE+"Age : "+String.valueOf(savedInstanceState.getInt(AGE));
            CUtil.showMsg(this,"Stored Value :"+value);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(AGE,35);
        outState.putString(NAME,"Bijendra");


        super.onSaveInstanceState(outState);
    }
}
