package com.rizkywrdhana.finregards.ui.regards;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.rizkywrdhana.finregards.NewRegardsActivity;
import com.rizkywrdhana.finregards.R;

public class RegardsFragment extends Fragment {

    private RegardsViewModel regardsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        regardsViewModel =
                new ViewModelProvider(this).get(RegardsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_regards, container, false);
        Button button = (Button) root.findViewById(R.id.btn_create_new);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                detailClicked();
            }
        });

        final TextView textView = root.findViewById(R.id.text_regards);
        regardsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    private void detailClicked() {
        Intent intent = new Intent(getActivity(), NewRegardsActivity.class);
        startActivity(intent);
    }
}