package com.bijendra.configuration.handle.handlingconfigurationchanges;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class RFSActivity extends AppCompatActivity {

    static final String FRAG_TAG="FrRetainState";
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_retaining_fragments);
        FragRetainState frRetainState=null;
        if(bundle!=null)
        {
            CUtil.showMsg(this,"Configuration Changed");
            frRetainState=(FragRetainState)getSupportFragmentManager().findFragmentByTag(FRAG_TAG);
        }
        else
            frRetainState= FragRetainState.newInstance();

        if(frRetainState!=null && !frRetainState.isInLayout())
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.container,frRetainState,FRAG_TAG).commit();
        }

    }

}
