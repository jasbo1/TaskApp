package com.taskapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {


    public static final String RESULT_KEY = "privet";
    EditText editTitle;
    EditText editDesc;
    private Task task;
    boolean isShow=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        if (getSupportActionBar()!= null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        editTitle = findViewById(R.id.editTitle);
        editDesc = findViewById(R.id.editDesc);

    }


    public void onClick(View view) {
        String title = editTitle.getText().toString().trim();
        String desc = editDesc.getText().toString().trim();
        if(task!=null) {
            task.setTitle(title);
            task.setDesc(desc);
            isShow=true;




        }else {
            task=new Task(title,desc);
            Intent intent = new Intent();
            intent.putExtra("task",task);
            setResult(RESULT_OK,intent);


        }
        if ( title.matches("")) {
            Toast.makeText(this, "Поля пустая ", Toast.LENGTH_SHORT).show();
            return;
        }
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()== android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

