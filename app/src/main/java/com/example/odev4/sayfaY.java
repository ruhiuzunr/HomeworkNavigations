package com.example.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev4.databinding.FragmentSayfaYBinding;


public class sayfaY extends Fragment {
    private FragmentSayfaYBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSayfaYBinding.inflate(inflater, container, false);
        binding.buttonGeriGit.setOnClickListener(view ->{
            Navigation.findNavController(view).navigate(R.id.geriDönGecis);
        });
        return binding.getRoot();
    }
}