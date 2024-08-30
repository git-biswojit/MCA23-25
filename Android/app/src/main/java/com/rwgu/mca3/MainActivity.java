package com.rwgu.mca3;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText etName, etEmail, etPwd, etConfPwd, etPhoneNo;
    Button btnDOB, btnSubmit;
    TextView tvDOB;
    RadioGroup rgGender;
    Spinner spTracks;
    CheckBox chReading, chWriting, chDance, chInsta;
    String gender, track;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        init();
        clickListeners();
    }

    private void clickListeners() {

        rgGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbMale) {
                    gender = getResources().getString(R.string.male);
                } else if (checkedId == R.id.rbFemale) {
                    gender = getResources().getString(R.string.female);
                }
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, email, pwd, confPwd, phoneNo;
                name = etName.getText().toString();
                email = etEmail.getText().toString();
                pwd = etPwd.getText().toString();
                confPwd = etConfPwd.getText().toString();
                phoneNo = etPhoneNo.getText().toString();


                if (name.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter name", Toast.LENGTH_SHORT).show();
                } else if (email.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter email", Toast.LENGTH_SHORT).show();
                } else if (pwd.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter password", Toast.LENGTH_SHORT).show();
                } else if (confPwd.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter confirm password", Toast.LENGTH_SHORT).show();
                } else if (!confPwd.equals(pwd)) {
                    Toast.makeText(MainActivity.this, "Confirm Password is not matching with the Password", Toast.LENGTH_SHORT).show();
                } else if (phoneNo.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter phone number", Toast.LENGTH_SHORT).show();
                } else {
                    String hobby = "";
                    if(chDance.isChecked()){
                        hobby = hobby+getResources().getString(R.string.dance);
                    }
                    if(chInsta.isChecked()) {
                        hobby = hobby+getResources().getString(R.string.insta);
                    }
                    if(chReading.isChecked()) {
                        hobby = hobby+getResources().getString(R.string.reading);
                    }
                    if(chWriting.isChecked()) {
                        hobby = hobby+getResources().getString(R.string.writing);
                    }
                    String age = tvDOB.getText().toString();
                    Student s =new Student();
                    s.setName(name);
                    s.setEmail(email);
                    s.setPhoneNo(phoneNo);
                    s.setAge(age);
                    s.setGender(gender);
                    s.setTrack(track);
                    s.setHobby(hobby);

                    Intent  i = new Intent(MainActivity.this,HomeActivity.class);
//                    Bundle b = new Bundle();
//                    b.putString("name",name);
//                    b.putString("email",email);
//                    b.putString("phoneNo",phoneNo);
//                    b.putString("age",age);
//                    b.putString("gender",gender);
//                    b.putString("track",track);
//                    b.putString("hobby",hobby);
//                    i.putExtras(b);
//                    i.putExtra("student",s);
                    startActivity(i);
                }
            }
        });

        btnDOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog pickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        int age = getAge(year, month, dayOfMonth);
                        tvDOB.setText("Age: " + age + " years");
                    }
                }, year, month, day);
                pickerDialog.getDatePicker().setMaxDate(new Date().getTime());
                pickerDialog.show();
            }
        });

        spTracks.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                track = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, track, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void init() {
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPwd = findViewById(R.id.etPassword);
        etConfPwd = findViewById(R.id.etConfirmPwd);
        etPhoneNo = findViewById(R.id.etPhoneNumber);
        btnDOB = findViewById(R.id.btnDoB);
        btnSubmit = findViewById(R.id.btnSubmit);
        rgGender = findViewById(R.id.rgGender);
        chReading = findViewById(R.id.chbReading);
        chWriting = findViewById(R.id.chbWriting);
        chDance = findViewById(R.id.chbDance);
        chInsta = findViewById(R.id.chbInsta);
        spTracks = findViewById(R.id.spTracks);
        tvDOB = findViewById(R.id.tvDoB);
    }

    private int getAge(int year, int month, int day) {
        return Period.between(LocalDate.of(year, month, day), LocalDate.now()).getYears();
    }
}