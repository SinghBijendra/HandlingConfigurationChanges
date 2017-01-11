package com.bijendra.configuration.handle.handlingconfigurationchanges;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MMCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manually_managing_configuration);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        /*if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE)
            Toast.makeText(this,"LANDSCAPE",Toast.LENGTH_LONG).show();
        else
        if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT)
            Toast.makeText(this,"PORTRAIT",Toast.LENGTH_LONG).show();*/
        if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE)
            CUtil.showMsg(this,"LANDSCAPE");
        else  if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT)
                CUtil.showMsg(this,"PORTRAIT");
    }
}
