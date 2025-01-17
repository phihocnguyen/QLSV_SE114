package com.example.qlsv.ui.Self;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.qlsv.databinding.FragmentSelfBinding;

public class SelfFragment extends Fragment {

    private @NonNull FragmentSelfBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SelfViewModel studentSelfViewModel =
                new ViewModelProvider(this).get(SelfViewModel.class);

        binding = FragmentSelfBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSelf;
        studentSelfViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}