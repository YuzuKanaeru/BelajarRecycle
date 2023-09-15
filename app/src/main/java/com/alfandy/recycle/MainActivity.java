package com.alfandy.recycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import com.alfandy.recycle.Mahasiswa;
import com.alfandy.recycle.MahasiswaAdapter;
import com.alfandy.recycle.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter mahasiswaAdapter;
    private List<Mahasiswa> mahasiswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mahasiswaList = new ArrayList<>();
        // Tambahkan data mahasiswa ke dalam list
        mahasiswaList.add(new Mahasiswa("Alfandy Jaelani Putra", "E41220328", "085850845495"));
        mahasiswaList.add(new Mahasiswa("Nama 2", "NIM 2", "Nomor HP 2"));
        // Tambahkan data mahasiswa lainnya sesuai kebutuhan

        mahasiswaAdapter = new MahasiswaAdapter(mahasiswaList, this);
        recyclerView.setAdapter(mahasiswaAdapter);
    }
}