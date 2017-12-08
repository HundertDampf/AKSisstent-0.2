package com.example.ims.aksisstent02;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DataActivity extends AppCompatActivity {
    private String teacher;
    Button btnBack;
    TextView viewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        btnBack = (Button) findViewById(R.id.btnZuruck);
        viewName = (TextView) findViewById(R.id.viewName);
        viewName.setText(teacher);

        TeachersDAO Alpha = new TeachersDAO(this);
        Alpha.doXML();

/*
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DataActivity.this, MenuActivity.class)); //open Data Acitvity

            }
        });
*/

    }

    public void setTeacher(String teacher) {

        this.teacher = teacher;
    }

    public static void toast(Context context, String output) {
        if (output == null) {
            output = "nope";
        }
        Toast toast = Toast.makeText(context, output, Toast.LENGTH_SHORT);
        toast.show();
    }
}
