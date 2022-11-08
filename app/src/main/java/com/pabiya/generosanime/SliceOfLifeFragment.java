package com.pabiya.generosanime;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;


import com.pabiya.generosanime.databinding.FragmentSliceOfLifeBinding;

public class SliceOfLifeFragment extends Fragment {

    private FragmentSliceOfLifeBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSliceOfLifeBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SliceOfLifeFragment.this)
                        .navigate(R.id.action_SliceOfLife_to_GenerosAnime);
            }
        });
        binding.imageAnohana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SliceOfLifeFragment.this)
                        .navigate(R.id.action_SliceOfLife_to_anohanaFragment);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}