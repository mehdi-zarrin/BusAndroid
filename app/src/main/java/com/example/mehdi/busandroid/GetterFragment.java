package com.example.mehdi.busandroid;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.otto.Subscribe;

public class GetterFragment extends Fragment {
    TextView message;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_getter, container, false);
        message = (TextView) view.findViewById(R.id.fragment_getter_text);
        return view;
    }

    @Subscribe
    public void onGetMessage(MessageEvent messageEvent) {
        message.setText(messageEvent.getMessage());
    }

    @Override
    public void onResume() {
        super.onResume();
        EventBus.getBus().register(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        EventBus.getBus().unregister(this);
    }


}
