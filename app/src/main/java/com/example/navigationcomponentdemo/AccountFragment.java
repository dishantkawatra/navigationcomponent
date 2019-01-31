package com.example.navigationcomponentdemo;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.navigation.Navigation;


public class AccountFragment extends Fragment {


    EditText editText;
    private Button sendtext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_account, container, false);
        editText = rootView.findViewById(R.id.editText);
        sendtext = rootView.findViewById(R.id.button3);

        return rootView;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sendtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amount = (editText.getText().toString());
                Bundle bundle=new Bundle();
                bundle.putString("Data",amount);
                Navigation.findNavController(v).navigate(R.id.toGetDataFragment,bundle);
            }
        });

    }
}
