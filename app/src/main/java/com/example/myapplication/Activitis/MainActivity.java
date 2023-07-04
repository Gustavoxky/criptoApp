package com.example.myapplication.Activitis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.myapplication.Adapter.CryptoWalletAdapter;
import com.example.myapplication.Domain.CryptoWallet;
import com.example.myapplication.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewWallet();
    }

    private void recyclerViewWallet() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView = findViewById(R.id.view);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<CryptoWallet> cryptoWalletArrayList = new ArrayList<>();
        ArrayList<Integer> lineData = new ArrayList<>();
        lineData.add(1000);
        lineData.add(1100);
        lineData.add(1200);
        lineData.add(1100);

        ArrayList<Integer> lineData2 = new ArrayList<>();
        lineData2.add(2100);
        lineData2.add(2000);
        lineData2.add(1900);
        lineData2.add(2000);

        ArrayList<Integer> lineData3 = new ArrayList<>();
        lineData3.add(900);
        lineData3.add(1000);
        lineData3.add(1100);
        lineData3.add(1000);

        cryptoWalletArrayList.add(new CryptoWallet("bitcoin", "BTX", 1234.12, 2.13, lineData, 1234.12, 0.12343));
        cryptoWalletArrayList.add(new CryptoWallet("etheriun", "ETH", 2342.12, -1.13, lineData2, 6234.12, 0.011343));
        cryptoWalletArrayList.add(new CryptoWallet("trox", "ROX", 1234.12, 0.33, lineData3, 16234.12, 0.015343));

    adapter = new CryptoWalletAdapter(cryptoWalletArrayList);
    recyclerView.setAdapter(adapter);
    }
}