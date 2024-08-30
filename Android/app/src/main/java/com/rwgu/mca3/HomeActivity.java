package com.rwgu.mca3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView tvDetails = findViewById(R.id.tvDetails);
        String details = getString();
        tvDetails.setText(details);
    }

    @NonNull
    private String getString() {
//        Bundle b = getIntent().getExtras();
//        assert b != null;
//        String name = b.getString("name");
//        String email = b.getString("email");
//        String phoneNo = b.getString("phoneNo");
//        String age = b.getString("age");
//        String gender = b.getString("gender");
//        String track = b.getString("track");
//        String hobby = b.getString("hobby");
//
//        String details = "Name: " + name + "\n" +
//                "Email: " + email + "\n" +
//                "Phone No: " + phoneNo + "\n" +
//                "Age: " + age + "\n" +
//                "Gender: " + gender + "\n" +
//                "Track: " + track + "\n" +
//                "Hobby: " + hobby;
        Student s = (Student) getIntent().getSerializableExtra("student");
        String details = "Name: " + s.getName() + "\n" +
                "Email: " + s.getEmail() + "\n" +
                "Phone No: " + s.getPhoneNo() + "\n" +
                "Age: " + s.getAge() + "\n" +
                "Gender: " + s.getGender() + "\n" +
                "Track: " + s.getTrack() + "\n" +
                "Hobby: " + s.getHobby();
        return details;
    }
}