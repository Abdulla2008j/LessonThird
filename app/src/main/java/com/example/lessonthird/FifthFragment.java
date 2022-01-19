package com.example.lessonthird;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lessonthird.databinding.FragmentFifthBinding;
import com.example.lessonthird.databinding.FragmentFourthBinding;

public class FifthFragment extends Fragment {


    private FragmentFifthBinding binding;
    private String S;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        S = getArguments().getString("Key4");
        binding = FragmentFifthBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btn5.setOnClickListener(view1 ->
                binding.tv.setText(S));
    }
}