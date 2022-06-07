package com.example.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev4.databinding.FragmentSayfaABinding;

public class sayfaA extends Fragment {
    private FragmentSayfaABinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSayfaABinding.inflate(inflater,container,false);
        binding.buttonGitB.setOnClickListener(view -> {
            Kisiler gönderilecek_kisi = new Kisiler("Ruhi","Uzuner",26);

            sayfaADirections.SayfaBGecis gecis = sayfaADirections.sayfaBGecis(gönderilecek_kisi);
            gecis.setAd("Ruhi");
            gecis.setSoyad("UZUNER");
            gecis.setYas(26);
            Navigation.findNavController(view).navigate(gecis);
        });


        return binding.getRoot();
    }
}