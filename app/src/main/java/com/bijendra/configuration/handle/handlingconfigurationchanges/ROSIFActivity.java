package com.bijendra.configuration.handle.handlingconfigurationchanges;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ROSIFActivity extends AppCompatActivity {
    static final String FRAG_TAG="FrViewState";
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_view_state_in_fragment);
        FragRetainObjectState frViewState=null;
        if(bundle!=null)
        {

            frViewState=(FragRetainObjectState)getSupportFragmentManager().findFragmentByTag(FRAG_TAG);
            getSupportFragmentManager().beginTransaction().replace(R.id.container,frViewState,FRAG_TAG).commit();
            CUtil.showMsg(this,"Configuration Changed");
            CUtil.showMsg(this,"Stored Values: "+frViewState.getStudent().getName()+"<>"+frViewState.getStudent().getAddess());
        }
        else {
            frViewState = FragRetainObjectState.newInstance();
            getSupportFragmentManager().beginTransaction().add(R.id.container,frViewState,FRAG_TAG).commit();
            Student student=new Student();
            student.setAddess("Pratap pura,Agra");
            student.setName("Bijendra");
            frViewState.setStudent(student);
            CUtil.showMsg(this,"initialize object in frgament");

        }



    }
}
