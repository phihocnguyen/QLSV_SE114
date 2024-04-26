package com.example.qlsv.ui.TKB;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.qlsv.databinding.FragmentTkbBinding;

public class TKBFragment extends Fragment {

    private FragmentTkbBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TKBViewModel tkbViewModel =
                new ViewModelProvider(this).get(TKBViewModel.class);

        binding = FragmentTkbBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textTkb;
        tkbViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}