package es.travelworld.travelling;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.snackbar.Snackbar;
import es.travelworld.travelling.databinding.FragmentLoginBinding;

public class LoginFragment extends Fragment {

    private FragmentLoginBinding loginBinding;

    public LoginFragment() {
        // Required empty public constructor
    }

     @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        loginBinding= FragmentLoginBinding.inflate(getLayoutInflater());
         setListeners();
         return loginBinding.getRoot();

    }

        private void setListeners() {
            loginBinding.tvGet.setOnClickListener(view ->
                    Snackbar.make(view,"Disponible proximamente...",Snackbar.LENGTH_SHORT).show());
            loginBinding.tvCreate.setOnClickListener(view ->
                    Snackbar.make(view,"Disponible proximamente...",Snackbar.LENGTH_SHORT).show());

        }






    }