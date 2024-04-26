package com.example.qlsv.ui.Deadline;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.qlsv.databinding.FragmentDeadlineBinding;

public class DeadlineFragment extends Fragment {

    private @NonNull FragmentDeadlineBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DeadlineViewModel deadlineViewModel =
                new ViewModelProvider(this).get(DeadlineViewModel.class);

        binding = FragmentDeadlineBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDeadline;
        deadlineViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}