package com.example.logcatpracticaluse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.logcatpracticaluse.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Log.i("박원희", "onCreate 실행됩니다");

        binding.button1.setOnClickListener(view -> printLog("버튼 1 클릭 했습니다"));
        binding.button2.setOnClickListener(view -> printLog("버튼 2 클릭 했습니다"));
        binding.button3.setOnClickListener(view -> printLog("버튼 3 클릭 했습니다"));
        binding.button4.setOnClickListener(view -> printLog("버튼 4 클릭 했습니다"));
        binding.buttonCenter.setOnClickListener(view -> {
            Log.i("박원희", "텍스트뷰 내용: " + binding.textView.getText());
            Log.i("박원희", "에디트 텍스트 내용: " + binding.edit.getText());
        });
    }


    private void printLog(String message) {
        Log.i("박원희", message);
    }
}