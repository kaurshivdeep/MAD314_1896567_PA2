package com.example.mad314_1896567_pa2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView Welcome_TV=findViewById(R.id.Welcome);
        final EditText username_ET=findViewById(R.id.Username);
        final EditText password_ET=findViewById(R.id.Password);
        final Button Login_BT=findViewById(R.id.login);
        final RecyclerView Student_RV;

        Login_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=username_ET.getText().toString();
                String pass_ward=password_ET.getText().toString();


            }
        });







    }
}
