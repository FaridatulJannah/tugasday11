package com.example.tugasday11.ui.apps;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tugasday11.DetailActivity;
import com.example.tugasday11.databinding.FragmentAppsBinding;

public class AppsFragment extends Fragment {
    private ImageView apps1;
    private FragmentAppsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentAppsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        apps1 = binding.apps1; // Pastikan ID-nya sesuai dengan ID di layout XML


        apps1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), DetailActivity.class);
                startActivity(intent);
            }
        });
        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;

    }


}