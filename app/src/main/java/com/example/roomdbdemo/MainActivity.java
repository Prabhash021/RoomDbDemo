package com.example.roomdbdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText userName, userAddress, userPhNum;
    Button addDataToRoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.UserName);
        userAddress = findViewById(R.id.address);
        userPhNum = findViewById(R.id.ph_num);
        addDataToRoom = findViewById(R.id.saveBt);

        DatabaseHelper databaseHelper = DatabaseHelper.getDB(this);

        addDataToRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userNameGet = userName.getText().toString();
                String userAdrsGet = userAddress.getText().toString();
                String userPhNumGet = userPhNum.getText().toString();

                databaseHelper.userDataDao().addData(new userData(userNameGet, userAdrsGet, userPhNumGet));

//                ArrayList<userData> arrayList = (ArrayList<userData>) databaseHelper.userDataDao().getAllUserData();

            }
        });
    }
}