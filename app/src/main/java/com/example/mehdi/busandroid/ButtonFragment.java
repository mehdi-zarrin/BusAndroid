package com.example.mehdi.busandroid;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class ButtonFragment extends Fragment implements View.OnClickListener {

    EditText messageText;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_button, container, false);
        Button sendBtn = (Button) view.findViewById(R.id.fragment_button_send);
        sendBtn.setOnClickListener(this);
        messageText = (EditText) view.findViewById(R.id.fragment_button_message);
        return view;
    }

    @Override
    public void onClick(View v) {
        EventBus.getBus().post(new MessageEvent(messageText.getText().toString()));
    }
}
