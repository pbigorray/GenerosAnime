package com.pabiya.generosanime.sliceoflife;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.pabiya.generosanime.R;
import com.pabiya.generosanime.databinding.FragmentAnohanaBinding;
import com.pabiya.generosanime.databinding.FragmentHyoukaBinding;


public class HyoukaFragment extends Fragment {

    private FragmentHyoukaBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentHyoukaBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(HyoukaFragment.this)
                        .navigate(R.id.action_hyoukaFragment_to_SliceOfLife);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}