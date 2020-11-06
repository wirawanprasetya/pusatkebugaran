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






public class MainActivity extends AppCompatActivity {

    @BindView(R.id.input_nama)
    EditText inputNama;
    @BindView(R.id.input_umur)
    EditText inputUmur;
    @BindView(R.id.input_tb)
    EditText inputTb;
    @BindView(R.id.input_bb)
    EditText inputBb;


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





//    menambahkan butterknife
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //button pindah
        wp_button = (Button)findViewById(R.id.wp_button);

        wp_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                /**STEP A
                 *
                 *    "i" adalah variable Intent
                 *    kemudian kita akan memanggil method Intent dengan perintah New Intent()
                 *    memasukan parameter Intent() dengan MainActivity kemudian ActivityTujuan
                 */

                Intent i = new Intent(MainActivity.this, MainActivity2.class);




                /**STEP B
                 *
                 *    memulai Aktifitas perintah yang dibuat di bagian A
                 *    yaitu "i"
                 *    dengan method startActivity()
                 */

                startActivity(i);

            }
        });




//asli
    }

//    onclick simpan
    @OnClick(R.id.simpan_button)
    public void btnClicked() {
        String nama = inputNama.getText().toString();
        hasilNama.setText(nama);
        String umur = inputUmur.getText().toString();
        hasilUmur.setText(umur+" tahun");
        String tb = inputTb.getText().toString();
        hasilTb.setText(tb+" cm");
        String bb = inputBb.getText().toString();
        hasilBb.setText(bb+" kg");

        //jenis kelamin
        Spinner spinner = (Spinner) findViewById(R.id.jk_spinner);
        String jk = spinner.getSelectedItem().toString();
        hasilJk.setText(jk);

        //perhitungan BMI
        String bmi1 = inputBb.getText().toString();
        String bmi2 = inputTb.getText().toString();
        double hasila = Double.parseDouble(bmi1);
        double hasilb = Double.parseDouble(bmi2);
        //int hasila = Integer.parseInt(bmi1);
        //int hasilb = Integer.parseInt(bmi2);
//        Misalnya jika kamu memiliki berat badan 75 kg dan tinggi badan 1,65 m (165 cm),
//        maka penghitungan BMI-nya yaitu:
//        BMI = 75kg / (1,65 x 1,65) = 27, 55.
        double hasilc = (hasila/((hasilb/100)*(hasilb/100)));


        hasilBmi.setText(String.format(" %.1f", hasilc));
        //yourTextView.setText(String.format("Value of a: %.2f", a));




        //perhitungan BMR
        String bmr1 = inputBb.getText().toString();
        String bmr2 = inputTb.getText().toString();
        String bmr3 = inputUmur.getText().toString();
        double hasil1 = Double.parseDouble(bmr1);
        double hasil2 = Double.parseDouble(bmr2);
        double hasil3 = Double.parseDouble(bmr3);

        //BMI pada Laki - Laki
        double hasil4 = (66+(13.7*hasil1)+(5*hasil2)-(6.8*hasil3));
        hasilBmr.setText(String.format(" %.1f", hasil4));



    }

}