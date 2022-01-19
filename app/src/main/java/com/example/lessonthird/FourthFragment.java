package com.example.lessonthird;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lessonthird.databinding.FragmentFourthBinding;
import com.example.lessonthird.databinding.FragmentThirdBinding;


public class FourthFragment extends Fragment {

    private FragmentFourthBinding binding;
    private String S;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        S = getArguments().getString("Key3");
        binding = FragmentFourthBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btn4.setOnClickListener(v -> {

            Bundle bundle = new Bundle();
            Fragment fragment = new FifthFragment();
            bundle.putString("Key4",S);
            fragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mContainer,fragment)
                    .addToBackStack(null).commit();


        });
    }
}