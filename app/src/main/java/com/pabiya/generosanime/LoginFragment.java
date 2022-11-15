package com.pabiya.generosanime;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.pabiya.generosanime.databinding.FragmentLoginBinding;
import com.pabiya.generosanime.databinding.GenerosAnimeBinding;

public class LoginFragment extends Fragment {

    private FragmentLoginBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentLoginBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    String usuario="pau",pass="1234";
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.user.length()!=0 &&binding.password.length()!=0){
                    if (binding.user.getText().toString().equals(usuario)
                            && binding.password.getText().toString().equals(pass)){
                        Bundle bundle = new Bundle();
                        bundle.putString("user",binding.user.getText().toString());
                        getParentFragmentManager().setFragmentResult("login",bundle);

                        NavHostFragment.findNavController(LoginFragment.this)
                                .navigate(R.id.action_loginFragment_to_GenerosAnime);
                    }

                }
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}