package com.example.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev4.databinding.FragmentSayfaXBinding;

public class sayfaX extends Fragment {

    private FragmentSayfaXBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSayfaXBinding.inflate(inflater, container, false);
        binding.buttonGitY2.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.sayfaYGecis2);
        });


        return binding.getRoot();
    }
}