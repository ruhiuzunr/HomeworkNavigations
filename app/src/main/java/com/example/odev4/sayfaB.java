package com.example.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev4.databinding.FragmentSayfaBBinding;


public class sayfaB extends Fragment {
    private FragmentSayfaBBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSayfaBBinding.inflate(inflater,container, false);

        binding.buttonGitY.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.sayfaYGecis);
            Log.e("Debug","Sayfa B'den X'e geçiş");
            Log.e("Debug","Sayfa B'den X'e geçiş");
        });


        return binding.getRoot();
    }
}