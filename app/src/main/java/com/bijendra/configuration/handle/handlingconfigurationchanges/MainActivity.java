package com.bijendra.configuration.handle.handlingconfigurationchanges;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gotoOtherActivity(View view)
    {
        if(view.getTag().toString().equalsIgnoreCase("0"))
            startActivity(new Intent(this,MMCActivity.class));
        else if(view.getTag().toString().equalsIgnoreCase("1"))
            startActivity(new Intent(this,SRASActivity.class));
        else if(view.getTag().toString().equalsIgnoreCase("2"))
            startActivity(new Intent(this,RFSActivity.class));
        else if(view.getTag().toString().equalsIgnoreCase("3"))
            startActivity(new Intent(this,ROSIFActivity.class));

    }
}
