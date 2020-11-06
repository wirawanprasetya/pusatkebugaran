package com.example.utsautomata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

//import android.support.v7.app.AppCompatActivity;

//menambahkan komponen pada layout untuk dipanggil
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//jenis kelamin
import android.view.View;
import android.widget.Spinner;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

//pindah
import android.content.Intent;
//import android.widget.Button;


public class MainActivity2 extends AppCompatActivity {

    @BindView(R.id.simpan_button)
    Button simpan_button;

    @BindView(R.id.wp_button)
    Button wp_button;

    @BindView(R.id.hasil_nama)
    TextView hasilNama;
    @BindView(R.id.hasil_umur)
    TextView hasilUmur;
    @BindView(R.id.hasil_tb)
    TextView hasilTb;
    @BindView(R.id.hasil_bb)
    TextView hasilBb;

    //    jenis kelamin
    @BindView(R.id.hasil_jk)
    TextView hasilJk;

    //    hasil BMI dan BMR
    @BindView(R.id.hasil_bmi)
    TextView hasilBmi;

    @BindView(R.id.hasil_bmr)
    TextView hasilBmr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }



}