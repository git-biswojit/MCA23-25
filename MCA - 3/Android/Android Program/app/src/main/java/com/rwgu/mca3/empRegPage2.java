package com.rwgu.mca3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class empRegPage2 extends Fragment {


    Employee employee;
    public empRegPage2(Employee s) {
        // Required empty public constructor
        this.employee = s;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.e("TAG","e: "+ employee.getEmail());
        return inflater.inflate(R.layout.fragment_emp_reg_page2, container, false);
    }
}