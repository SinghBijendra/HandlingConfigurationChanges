package com.bijendra.configuration.handle.handlingconfigurationchanges;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragRetainObjectState extends Fragment {

    private Student data;

    public FragRetainObjectState() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static FragRetainObjectState newInstance() {
        FragRetainObjectState fragment = new FragRetainObjectState();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fr_retain_state, container, false);
    }

    public void setStudent(Student student)
    {
       this.data=student;
    }

    public Student getStudent()
    {
        return this.data;
    }



}
