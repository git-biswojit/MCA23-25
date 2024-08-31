package com.rwgu.mca3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

public class EmpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_emp);
        EmpFragment empFragment = EmpFragment.newInstance("p1","p2");
        loadFragment(empFragment);
    }

    private void loadFragment(Fragment empFragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.empRegForm,empFragment)
                .commit();
    }
}