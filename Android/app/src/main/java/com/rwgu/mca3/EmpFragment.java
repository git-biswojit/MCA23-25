package com.rwgu.mca3;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EmpFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EmpFragment extends Fragment {

    TextInputLayout wrpFirstName, wrpLastName, wrpEmail, wrpAddress, wrpPhoneNo;
    Spinner spnGender;
    Button btnAge, btnNext;
    TextView tvAge;
    String gender;
    private EmpActivity empActivity;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EmpFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EmpFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EmpFragment newInstance(String param1, String param2) {
        EmpFragment fragment = new EmpFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_emp, container, false);
        init(view);
        onTextChangeListner(wrpFirstName);
        onTextChangeListner(wrpLastName);
        onTextChangeListner(wrpEmail);
        onTextChangeListner(wrpPhoneNo);
        onTextChangeListner(wrpAddress);
        onButtonClickListner();
        return view;
    }

    private void onButtonClickListner() {
        btnAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog pickerDialog = new DatePickerDialog(getContext(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        int age = getAge(year, month, dayOfMonth);
                        tvAge.setText("Age: " + age + " years");
                    }
                }, year, month, day);
                pickerDialog.getDatePicker().setMaxDate(new Date().getTime());
                pickerDialog.show();
            }
        });

        spnGender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gender = parent.getItemAtPosition(position).toString();
                Toast.makeText(getContext(), gender, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname, lname, email, address, phoneNo;
                fname = getTextContent(wrpFirstName);
                lname = getTextContent(wrpLastName);
                email = getTextContent(wrpEmail);
                phoneNo = getTextContent(wrpPhoneNo);
                address = getTextContent(wrpAddress);


               if(fname.isEmpty()||lname.isEmpty()
                       ||email.isEmpty()||phoneNo.isEmpty()
                       ||address.isEmpty()){
                   Toast.makeText(getContext(),"Please Enter All Fields",Toast.LENGTH_SHORT);
               }else {
                    String age = tvAge.getText().toString();
                    Employee s =new Employee();
                    s.setfName(fname);
                    s.setEmail(email);
                    s.setlName(lname);
                    s.setPhoneNo(phoneNo);
                    s.setAge(age);
                    s.setGender(gender);
                    empActivity.loadFragment(new empRegPage2());
                }
            }
        });
    }
    private int getAge(int year, int month, int day) {
        return Period.between(LocalDate.of(year, month, day), LocalDate.now()).getYears();
    }

    private String getTextContent(TextInputLayout textInputLayout){
        return textInputLayout.getEditText().getText().toString();
    }

    private void init(View view){
        wrpFirstName=view.findViewById(R.id.empFirstName);
        wrpLastName=view.findViewById(R.id.empLastName);
        wrpEmail=view.findViewById(R.id.empEmail);
        wrpPhoneNo=view.findViewById(R.id.empPhone);
        wrpAddress=view.findViewById(R.id.empAddress);
        btnAge=view.findViewById(R.id.ageBtn);
        spnGender=view.findViewById(R.id.empGender);
    }

    private void onTextChangeListner(TextInputLayout textInputLayout){
        textInputLayout.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(textInputLayout.getEditText().getText().toString().isEmpty()){
                    textInputLayout.setError("Please Enter Valid "+textInputLayout.getHint());
                }else{
                    textInputLayout.setError("");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        empActivity=(EmpActivity)getActivity();
    }
}