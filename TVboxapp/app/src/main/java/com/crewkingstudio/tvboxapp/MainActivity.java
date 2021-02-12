package com.crewkingstudio.tvboxapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnFocusChangeListener {

    Fragment fragment;
    String fragmentTag = "";

    private ImageButton btnMic, btnSet, btnStar, btnSearch, btnList, btnHis, btnHe;
    private TextView tvMic, tvSet, tvStar, tvSearch, tvList, tvHis, tvHe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMic = findViewById(R.id.btnMic);
        btnSet = findViewById(R.id.btnSet);
        btnStar = findViewById(R.id.btnStar);
        btnSearch = findViewById(R.id.btnSearch);
        btnList = findViewById(R.id.btnList);
        btnHis = findViewById(R.id.btnHis);
        btnHe = findViewById(R.id.btnHe);

        tvMic =  findViewById(R.id.tvMic);
        tvSet = findViewById(R.id.tvSet);
        tvStar = findViewById(R.id.tvStar);
        tvSearch = findViewById(R.id.tvSearch);
        tvList =  findViewById(R.id.tvList);
        tvHis =  findViewById(R.id.tvHis);
        tvHe =  findViewById(R.id.tvHe);

        tvMic.setVisibility(View.INVISIBLE);
        tvSet.setVisibility(View.INVISIBLE);
        tvStar.setVisibility(View.INVISIBLE);
        tvSearch.setVisibility(View.INVISIBLE);
        tvList.setVisibility(View.INVISIBLE);
        tvHis.setVisibility(View.INVISIBLE);
        tvHe.setVisibility(View.INVISIBLE);

        btnMic.setOnFocusChangeListener(this);
        btnSet.setOnFocusChangeListener(this);
        btnStar.setOnFocusChangeListener(this);
        btnSearch.setOnFocusChangeListener(this);
        btnList.setOnFocusChangeListener(this);
        btnHis.setOnFocusChangeListener(this);
        btnHe.setOnFocusChangeListener(this);

        Class fragmentClass = null;

        fragmentClass = HomeFragment.class;
        fragmentTag = "HomeFragment";
        try {
            fragment = (Fragment) fragmentClass.newInstance();

            Bundle bundle = new Bundle();

            bundle.putString("fragmentTag", fragmentTag);


            fragment.setArguments(bundle);
            // Insert the fragment by replacing any existing fragment
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_content, fragment).commitAllowingStateLoss();
        } catch (Exception e) {
        }
    }
    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        if (v.getId() == R.id.btnMic) {
            if (hasFocus)
                tvMic.setVisibility(View.VISIBLE);
            else
                tvMic.setVisibility(View.INVISIBLE);
        }
        if (v.getId() ==  R.id.btnSet) {
            if (hasFocus)
                tvSet.setVisibility(View.VISIBLE);
            else
                tvSet.setVisibility(View.INVISIBLE);
        }
        if (v.getId() ==  R.id.btnStar) {
            if (hasFocus)
                tvStar.setVisibility(View.VISIBLE);
            else
                tvStar.setVisibility(View.INVISIBLE);
        }
        if (v.getId() ==  R.id.btnSearch) {
            if (hasFocus)
                tvSearch.setVisibility(View.VISIBLE);
            else
                tvSearch.setVisibility(View.INVISIBLE);
        }
        if (v.getId() ==  R.id.btnList) {
            if (hasFocus)
                tvList.setVisibility(View.VISIBLE);
            else
                tvList.setVisibility(View.INVISIBLE);
        }
        if (v.getId() ==  R.id.btnHis) {
            if (hasFocus)
                tvHis.setVisibility(View.VISIBLE);
            else
                tvHis.setVisibility(View.INVISIBLE);
        }
        if (v.getId() ==  R.id.btnHe) {
            if (hasFocus)
                tvHe.setVisibility(View.VISIBLE);
            else
                tvHe.setVisibility(View.INVISIBLE);
        }
    }
}