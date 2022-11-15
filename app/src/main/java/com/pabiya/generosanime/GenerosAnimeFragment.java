package com.pabiya.generosanime;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.navigation.fragment.NavHostFragment;

import com.pabiya.generosanime.databinding.GenerosAnimeBinding;

public class GenerosAnimeFragment extends Fragment {

    private GenerosAnimeBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = GenerosAnimeBinding.inflate(inflater, container, false);
        getParentFragmentManager().setFragmentResultListener("login", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                String text= result.getString("user");
                binding.username.setText(text);
            }
        });
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.sliceoflife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(GenerosAnimeFragment.this)
                        .navigate(R.id.action_GenerosAnimeFragment_to_SliceOfLifeFragment);
            }
        });

        binding.accion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(GenerosAnimeFragment.this)
                        .navigate(R.id.action_GenerosAnime_to_accionFragment);
            }
        });
        binding.romance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(GenerosAnimeFragment.this)
                        .navigate(R.id.action_GenerosAnime_to_romanceFragment);
            }
        });
        binding.drama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(GenerosAnimeFragment.this)
                        .navigate(R.id.action_GenerosAnime_to_dramaFragment);
            }
        });
        binding.comedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(GenerosAnimeFragment.this)
                        .navigate(R.id.action_GenerosAnime_to_comediaFragment);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}