package com.example.hp.thenewestproject;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.thenewestproject.Sort.Sort;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private int[] arr = {2, 4, 1, 5, 6, 3};
    private int[] arr1 = {5, 4, 7, 1, 2, 3, 1, 8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvResult = findViewById(R.id.tvResult);
        TextView newText = findViewById(R.id.tvAnotherResult);
        Button btn = findViewById(R.id.btnId);

        Sort newSort = new Sort();
        int[] sortMass = newSort.bubbleSort(arr);
        int[] newSortMass = newSort.choiseSort(arr1);

        tvResult.setText(Arrays.toString(sortMass));
        newText.setText(Arrays.toString(newSortMass));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), getString(R.string.textByButton), Toast.LENGTH_LONG).show();
            }
        });
    }
}