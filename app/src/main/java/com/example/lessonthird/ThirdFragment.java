package com.example.lessonthird;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lessonthird.databinding.FragmentSecondBinding;
import com.example.lessonthird.databinding.FragmentThirdBinding;


public class ThirdFragment extends Fragment {

    private FragmentThirdBinding binding;
    private String S;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        S = getArguments().getString("Key2");
        binding = FragmentThirdBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btn3.setOnClickListener(v -> {

            Bundle bundle = new Bundle();
            Fragment fragment = new FourthFragment();
            bundle.putString("Key3",S);
            fragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mContainer,fragment)
                    .addToBackStack(null).commit();
        });
    }
}