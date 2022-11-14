package com.pabiya.generosanime;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.pabiya.generosanime.databinding.FragmentAccionBinding;
import com.pabiya.generosanime.databinding.FragmentDramaBinding;

public class DramaFragment extends Fragment {

    private FragmentDramaBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ){

        binding = FragmentDramaBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(DramaFragment.this)
                        .navigate(R.id.action_dramaFragment_to_GenerosAnime);
            }
        });
        binding.imageReZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(DramaFragment.this)
                        .navigate(R.id.action_dramaFragment_to_reZeroFragment);
            }
        });
        binding.imageKimiNiTodoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(DramaFragment.this)
                        .navigate(R.id.action_dramaFragment_to_kimiNiTodokeFragment);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}