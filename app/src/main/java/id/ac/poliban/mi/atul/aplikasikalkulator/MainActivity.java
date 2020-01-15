package id.ac.poliban.mi.atul.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etPertama = findViewById(R.id.etPertama);
        EditText etKedua = findViewById(R.id.etKedua);
        Button btTambah = findViewById(R.id.btTambah);
        Button btKurang = findViewById(R.id.btKurang);
        Button btKali = findViewById(R.id.btKali);
        Button btBagi = findViewById(R.id.btBagi);
        Button btBersihkan = findViewById(R.id.btBersihkan);
        TextView tvHasil = findViewById(R.id.tvHasil);

        btTambah.setOnClickListener(v ->  {
            double a = Double.parseDouble(etPertama.getText().toString());
            double b = Double.parseDouble(etKedua.getText().toString());
            double hasil = a + b;

            tvHasil.setText(String.valueOf(hasil));
        });
        btKali.setOnClickListener(v ->  {
            double a = Double.parseDouble(etPertama.getText().toString());
            double b = Double.parseDouble(etKedua.getText().toString());
            double hasil = a*b;

            tvHasil.setText(String.valueOf(hasil));
        });
        btBagi.setOnClickListener(v ->  {
            double a = Double.parseDouble(etPertama.getText().toString());
            double b = Double.parseDouble(etKedua.getText().toString());
            double hasil = a/b;

            tvHasil.setText(String.valueOf(hasil));
        });
        btKurang.setOnClickListener(v ->  {
            double a = Double.parseDouble(etPertama.getText().toString());
            double b = Double.parseDouble(etKedua.getText().toString());
            double hasil = a-b;

            tvHasil.setText(String.valueOf(hasil));
        });
        btBersihkan.setOnClickListener(v -> {
            etPertama.getText().clear();
            etKedua.getText().clear();
            tvHasil.setText(("HASIL"));
        });
    }
}
